import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int[] unf;
    public static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v]=Find(unf[v]);
    }
    public static void Union(int a, int b){
        int fa=Find(a);
        int fb=Find(b);
        if(fa!=fb) unf[fa]=fb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        unf = new int[n+1];
        for(int i=1; i<=n; i++) unf[i]=i;
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            // 0이면 합집합, 1이면 여부 확인
            int check = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(check == 0)  Union(a, b);
            else{
                int fa = Find(a);
                int fb = Find(b);
                if(fa == fb) sb.append("YES").append("\n");
                else         sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }
}