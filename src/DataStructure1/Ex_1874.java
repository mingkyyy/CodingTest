package DataStructure1;

import java.io.*;
import java.util.Stack;

public class Ex_1874 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();
        int index = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num > index) {
                for (int j = index + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                index = num;
            } else if (stack.peek() != num) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
        br.close();

    }
}
