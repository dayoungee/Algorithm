import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try{
            // scanner 보다 속도가 빠름
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 점수 갯수
            int n = Integer.parseInt(st.nextToken());
            // 태수의 점수
            int score = Integer.parseInt(st.nextToken());
            // 랭킹 등록 갯수
            int rankNum = Integer.parseInt(st.nextToken());

            ArrayList ar = new ArrayList();
            if(n>0)
            {
                st = new StringTokenizer(br.readLine());
                for(int i = 0 ; i <n; i++){
                    ar.add(Integer.parseInt(st.nextToken()));
                }
            }

            Main T = new Main();
            T.solution(ar,score, rankNum);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private void solution(ArrayList<Integer> n, int score, int rankNum) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int inputScoreRank = 1;

        if(n.size() == rankNum && score <= n.get(n.size()-1))
        {
            System.out.print(-1);
            return;
        }

        for(int num : n) {
            if (score < num) inputScoreRank++;
            else              break;
        }

        System.out.println(inputScoreRank);
    }
}