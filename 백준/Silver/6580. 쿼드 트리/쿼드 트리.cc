#include <bits/stdc++.h>
#define fastio cin.tie(0)->sync_with_stdio(0)
using namespace std;

int n = -3;
bitset<512> check[512];

struct Converter { //0xdd -> int
	int conv[128];
	Converter() {
		for (int i = 0; i < 16; i++)
			conv["0123456789abcdef"[i]] = i;
	}
	int operator() (const string& s) {
		return conv[s[2]] << 4 | conv[s[3]];
	}
} Conv;

void Color() {
	string s;
	for (int& i = n; getline(cin, s) && s[0] != '}'; i++) {
		if (i < 0) continue;
		for (auto& i : s) if (i == ',') i = ' ';
		stringstream in(s); vector<int> v;
		while (in >> s) v.push_back(Conv(s));
		for (int j = 0; j < v.size(); j++) for (int k = 0; k < 8; k++)
			if (v[j] & 1 << k) check[i][j << 3 | k] = 1;
	}
}

void Print(int x, int y, int sz) {
	bool flag = 1;
	if (n == sz) cout << n << '\n';
	for (int i = x; i < x + sz; i++)
		for (int j = y; j < y + sz; j++)
			if (check[i][j] != check[x][y]) flag = 0;
	if (flag) cout << (check[x][y] ? 'B' : 'W');
	else {
		cout << 'Q'; sz >>= 1;
		Print(x, y, sz);
		Print(x, y + sz, sz);
		Print(x + sz, y, sz);
		Print(x + sz, y + sz, sz);
	}
}

int main() {
	fastio;
	Color();
	Print(0, 0, n);
}