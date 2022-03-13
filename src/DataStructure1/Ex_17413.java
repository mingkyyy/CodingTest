package DataStructure1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex_17413 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] strings = br.readLine().split(" ");
        boolean check = false;

        for (int i = 0; i < strings.length; i++) {
            Stack stack = new Stack();
            for (int j = 0; j < strings[i].length(); j++) {
                if (strings[i].charAt(j) == '<') {
                    check = true;
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(strings[i].charAt(j));

                } else if (strings[i].charAt(j) == '>') {
                    check = false;
                    sb.append(strings[i].charAt(j));
                } else if (check) {
                    sb.append(strings[i].charAt(j));
                } else {
                    stack.push(strings[i].charAt(j));
                }
            }
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
