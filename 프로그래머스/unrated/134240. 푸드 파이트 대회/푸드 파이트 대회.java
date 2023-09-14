class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            int start = food[i] / 2;
            for(int j = 0; j < start; j++){
                sb.append(i);
            }
        }
        StringBuilder sb2 = new StringBuilder(sb);
        sb.append(0).append(sb2.reverse().toString());
        return sb.toString();
    }
}