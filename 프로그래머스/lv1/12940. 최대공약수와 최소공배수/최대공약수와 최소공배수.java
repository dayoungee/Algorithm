class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcdNum = gcd(n, m);
        answer[0] = gcdNum;
        answer[1] = lcm(n, m, gcdNum);
        return answer;
    }
    
    public int lcm(int a, int b, int gcdN) { 
		return a*b / gcdN;
	}
    
    public int gcd(int a, int b) {
        while(b!=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
  }
}