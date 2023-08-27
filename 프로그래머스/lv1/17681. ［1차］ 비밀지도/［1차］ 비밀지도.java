class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            int[] s1 = getArr(arr1[i], n);
            int[] s2 = getArr(arr2[i], n);
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                int c1 = s1[j];
                int c2 = s2[j];
                if(c1 == 1 || c2 == 1) sb.append('#');
                else sb.append(' ');
            }
            answer[i] = sb.reverse().toString();
        }
        
        return answer;
    }
    
    public int[] getArr(int num, int size) {
        int[] result = new int[size];
        for(int i=0; i < size; i++) {
            result[i] = num % 2;
            num = num/2;
        }       
        return result;
    }
}