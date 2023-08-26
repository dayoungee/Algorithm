class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                if(c + n > 90){
                    sb.append((char)(c + n - 90 + 64));
                }
                else sb.append((char)(c + n));
            }
            else if(Character.isLowerCase(c)){
                if(c + n > 122){
                  sb.append((char)(c + n - 122 + 96));
                }
                else sb.append((char)(c + n));
            }
            else sb.append(c);
        }
        return sb.toString();
    }
}