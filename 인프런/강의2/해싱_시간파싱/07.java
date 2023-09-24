import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int getTime(String time){
        int H = Integer.parseInt(time.split(":")[0]);
        int M = Integer.parseInt(time.split(":")[1]);
        return H*60+M;
    }
    public String[] solution(String[] reports, int time){
        HashMap<String, Integer> inT = new HashMap<>();
        HashMap<String, Integer> sumT = new HashMap<>();
        for(String x : reports){
            String a = x.split(" ")[0];
            String b = x.split(" ")[1];
            String c = x.split(" ")[2];
            if(c.equals("in")) inT.put(a, getTime(b));
            else sumT.put(a, sumT.getOrDefault(a, 0) + (getTime(b) - inT.get(a)));
        }
        ArrayList<String> res = new ArrayList<>();
        for(String name : sumT.keySet()){
            if(sumT.get(name) > time) res.add(name);
        }
        res.sort((a, b) -> a.compareTo(b));
        String[] answer = new String[res.size()];
        for(int i = 0; i < res.size(); i++){
            answer[i] = res.get(i);
        }
        return answer;
    }
}
