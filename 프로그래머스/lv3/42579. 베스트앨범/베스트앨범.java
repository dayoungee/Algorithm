import java.io.IOException;
import java.util.*;

class cd{
    String genre;
    int play;
    int index;
    cd(String genre, int play, int index){
        this.genre = genre;
        this.play = play;
        this.index = index;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0)+ plays[i]);
        }

        ArrayList<String> list = new ArrayList<>();

        while(!map.isEmpty()){
            int max = 0;
            String maxKey = "";
            for(String key : map.keySet()){
                if(max < map.get(key)){
                    max = map.get(key);
                    maxKey = key;
                }
            }
            list.add(maxKey);
            map.remove(maxKey);
        }

        ArrayList<cd> result = new ArrayList<>();
        for(String g : list){
            ArrayList<cd> temp = new ArrayList<>();
            for(int i = 0; i < genres.length; i++){
                if(genres[i].equals(g)){
                    temp.add(new cd(genres[i], plays[i], i));
                }
            }
            Collections.sort(temp, (o1, o2) -> o2.play - o1.play);
            result.add(temp.get(0));
            if(temp.size() > 1){
                result.add(temp.get(1));
            }
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i).index;
        }

        return answer;
    }
}