import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numStart = in.nextInt();
        int numEnd = in.nextInt();
        Main T = new Main();
        T.solution(numStart, numEnd);
    }

    private void solution(int s, int e) {

        int[] ch = new int[e+1];

        // 2미만은 소수가 아님. 스킵
        if(e < 2 ) return;

        for(int i = 2; i<=Math.sqrt(e); i++)
        {
            if(ch[i] == 0)
            {
                for(int j = i*i; j<=e; j=j+i)
                {
                    ch[j] = 1;
                }
            }
        }

        if(s < 2) s = 2;

        for(int k = s; k <= e; k++)
        {
            if(ch[k] == 0)
                System.out.println(k);
        }

        return;
    }
}