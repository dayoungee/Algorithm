class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.toLowerCase().split(" ", -1);
        for(String str : arr){
            for(int i = 2; i <= str.length()+1; i++){
                if(i % 2 == 0) sb.append(Character.toUpperCase(str.charAt(i-2)));
                else sb.append(str.charAt(i-2));
            }
            sb.append(" ");
        }
         sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}