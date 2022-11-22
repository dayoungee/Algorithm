
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

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Main T = new Main();
            T.solution(N, M);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private void solution(int n, int m) {
        StringBuilder sb = new StringBuilder();
        boolean [] bNotPrimeArray = new boolean[m+1];
        for(int i = 2; i<=Math.sqrt(m); i++)
        {
            if(!bNotPrimeArray[i]){
                for(int j = i*i; j <= m; j = j+i)
                {
                    bNotPrimeArray[j] = true;
                }
            }
        }

        for(int k = n; k<=m; k++)
        {
            boolean bPalin = false;
            if(!bNotPrimeArray[k])
                bPalin = isPalin(k);

            if(bPalin)  sb.append(k).append("\n");
        }

        System.out.print(sb);
        System.out.print(-1);
    }

    public int reverse(int a){
        int result = 0;
        while(a != 0)
        {
            int digit = a % 10;
            result = result * 10 + digit;
            a /= 10;
        }
        return result;
    }

    public boolean isPalin(int num)
    {
        int reverseNum = 0;
        reverseNum = reverse(num);

        if(num == reverseNum)
            return true;
        else
            return false;
    }
}