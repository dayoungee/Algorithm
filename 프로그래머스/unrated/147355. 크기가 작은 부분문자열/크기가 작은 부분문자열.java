class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i <= t.length() - p.length(); i++){
            long m = Long.parseLong(p);
            long n = Long.parseLong(t.substring(i, i + p.length()));
            System.out.println(n);
            if(n <= m){
                System.out.println(n + "나는크다");
                answer ++;
            }
        }
        return answer;
    }
}