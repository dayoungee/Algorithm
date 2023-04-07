
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Meeting implements Comparable<Meeting>{
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.end == o.end) return this.start - o.start;
        return this.end - o.end;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Meeting> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Meeting(s,e));
        }
        list.sort(null);
        Meeting beforeMeeting = list.get(0);
        int answer = 1;
        for(int i = 1; i < list.size(); i++){
            if(beforeMeeting.end <= list.get(i).start){
                answer++;
                beforeMeeting = list.get(i);
            }
        }
        System.out.println(answer);
    }
}
