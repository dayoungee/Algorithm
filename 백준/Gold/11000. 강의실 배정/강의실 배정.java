import java.io.*;
import java.util.*;

class Class implements Comparable<Class>{
    int time;
    String state;
    Class(int time, String state){
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Class o) {
        if(o.time == this.time) return this.state.compareTo(o.state);
        else                    return this.time - o.time;
    }
}

public class Main {
    static ArrayList<Class> arr= new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < n; i ++){
            st = new StringTokenizer(br.readLine());
            arr.add(new Class(Integer.parseInt(st.nextToken()),"s"));
            arr.add(new Class(Integer.parseInt(st.nextToken()),"e"));
        }
        System.out.println(solution());
    }

    public static int solution(){
        int answer = 0, cnt = 0;
        Collections.sort(arr);
        for(Class c : arr){
            if(c.state == "s") cnt++;
            else cnt--;

            answer = Math.max(answer, cnt);
        }
        return answer;
    }
}

