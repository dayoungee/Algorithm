#include <bits/stdc++.h>
#define fastio cin.tie(0)->sync_with_stdio(0)
using namespace std;

constexpr int INF = 1e9 + 7;

void Add(int& a, int b) { a += b; if (a > INF) a = INF; }

int main() {
	fastio;
	int n, k; cin >> n >> k;
	vector A(n + 1, 0);
	for (int i = 1; i <= n; i++) cin >> A[i];
	
	vector LIS(n + 1, 0), DP(n + 1, 0);
	for (int i = n; i >= 1; i--) {
		LIS[i] = DP[i] = 1;
		for (int j = i + 1; j <= n; j++) if (A[i] < A[j]) {
			if (LIS[i] < LIS[j] + 1) LIS[i] = LIS[j] + 1, DP[i] = 0;
			if (LIS[i] == LIS[j] + 1) Add(DP[i], DP[j]);
		}
	}
	
	int mx = *max_element(LIS.begin(), LIS.end());
	vector I(mx + 1, vector(0, 0));
	for (int i = 1; i <= n; i++) I[LIS[i]].push_back(i);
	for (int i = 1; i <= mx; i++) {
		auto Cmp = [&](int a, int b) { return A[a] < A[b]; };
		sort(I[i].begin(), I[i].end(), Cmp);
	}
	
	int sum = 0;
	for (int j : I[mx]) Add(sum, DP[j]);
	if (sum < k) return !puts("-1");
	
	for (int i = mx, prv = 0; i; i--) {
		for (int j : I[i]) if (prv < j && A[prv] < A[j]) {
			if (k > DP[j]) k -= DP[j];
			else { cout << A[prv = j] << ' '; break;  }
		}
	}
	cout << '\n';
}