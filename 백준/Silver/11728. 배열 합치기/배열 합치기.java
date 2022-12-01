import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        ArrayList<Integer> ar = new ArrayList<Integer>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            ar.add(Integer.parseInt(st.nextToken()));
        }


        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n2; i++){
            ar.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(ar);

        for(int a : ar){
            bw.write(a + " ");
        }
        bw.flush();
    }

}