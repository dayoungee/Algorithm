class Solution {
    public int solution(int n) {
        String temp = Integer.toBinaryString(n);
        int len = 0;
        for(int i = 0; i < temp.length(); i++){
            if(temp.charAt(i) == '1') len++;
        }
        
        while(true){
            n++;
            int len2 = 0;
            temp = Integer.toBinaryString(n);
            for(int i = 0; i < temp.length(); i++){
                if(temp.charAt(i) == '1') len2++;
            }
            if(len == len2) break;
        }
        
        return n;
    }
}