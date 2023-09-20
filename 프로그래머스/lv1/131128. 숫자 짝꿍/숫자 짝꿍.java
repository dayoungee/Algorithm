class Solution {
    public String solution(String X, String Y) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        count(arr1, X);
        count(arr2, Y);
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            while(arr1[i] > 0 && arr2[i] > 0) {
                arr1[i]--;
                arr2[i]--;
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        
        if(answer.equals("")) return "-1";
        else if(answer.startsWith("0")) return "0"; 
            
        return answer;
    }
    
    public void count(int[] arr, String str){
        for(char c : str.toCharArray()) {
            arr[c - '0']++;
        }
    }
}