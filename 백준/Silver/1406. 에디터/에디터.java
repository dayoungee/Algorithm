

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack stackL = new Stack<>();
        Stack stackR = new Stack<>();
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < str.length();i++){
            stackL.push(str.charAt(i));
        }

        for (int i=0; i<n; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            if (c == 'L' && !stackL.isEmpty()) {
                //왼쪽으로 이동시 하나 오른쪽으로 이동
                stackR.push(stackL.pop());
            } else if (c == 'D' && !stackR.isEmpty()) {
                //오른쪽으로 이동시 하나 왼쪽으로 이동
                stackL.push(stackR.pop());
            } else if (c == 'B' && !stackL.isEmpty()) {
                //삭제
                stackL.pop();
            } else if (c == 'P') {
                //추가
                stackL.push(String.valueOf(command.charAt(2)));
            }
        }

        while (!stackL.isEmpty()) {
            stackR.push(stackL.pop());
        }
        while (!stackR.isEmpty()) {
            sb.append(stackR.pop());
        }

        System.out.print(sb);

    }
}