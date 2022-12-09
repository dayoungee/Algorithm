import java.io.*;
import java.text.Collator;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        Main T = new Main();
        boolean bRet = false;
        int answer = 0;
        for(int i = 0; i < n; i++){
            bRet = T.solution(br.readLine().toCharArray());
            if(bRet) answer++;
        }
        System.out.println(answer);


    }

    public boolean solution(char[] arr) {
        ArrayList<Character> list = new ArrayList<>();
        char before;
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] != arr[i]){
                if(list.contains(arr[i])) return false;
                else     list.add(arr[i]);
            }
        }
        return true;
    }


}