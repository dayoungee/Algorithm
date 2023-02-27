import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while(n --> 0){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            Integer num = 0;
            if(!command.equals("all") && !command.equals("empty")) num = Integer.parseInt(st.nextToken());

            switch (command){
                case "add":
                    list.add(num);
                    break;
                case "remove":
                    list.remove(num);
                    break;
                case "check":
                    sb.append(list.contains(num) ? "1" : "0").append("\n");
                    break;
                case "toggle":
                    if(list.contains(num)) list.remove(num);
                    else                   list.add(num);
                    break;
                case "all":
                    list.clear();
                    for(int i = 1; i<=20; i++) list.add(i);
                    break;
                case "empty":
                    list.clear();
            }

        }

        System.out.println(sb);

    }


}
