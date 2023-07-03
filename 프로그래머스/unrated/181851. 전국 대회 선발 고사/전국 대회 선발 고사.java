import java.util.*;


class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] ary = new int[3];
        int n = 0;
        int k = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }   
        }
        for( Map.Entry<Integer, Integer> entry: map.entrySet()){
            k++;
            ary[n] = entry.getValue();
            System.out.print(k);
            n += 1;
            if(n > 2) break;
        }
        
        return (10000 * ary[0]) + (100 * ary[1]) + ary[2];
     }
}