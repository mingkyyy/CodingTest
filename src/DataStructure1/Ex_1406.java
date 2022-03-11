package DataStructure1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex_1406 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String st = br.readLine();
        int n = Integer.parseInt(br.readLine());
        Stack leftStack = new Stack();
        Stack rightStack = new Stack();
        for (int i = 0; i < st.length(); i++) {
            leftStack.push(st.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");

            switch (strings[0]) {
                case "L":
                    if (!leftStack.empty()) {
                        rightStack.push(leftStack.pop());
                    }
                    break;

                case "D":
                    if (!rightStack.empty()) {
                        leftStack.push(rightStack.pop());
                    }
                    break;

                case "B":
                    if (!leftStack.empty()) {
                        leftStack.pop();
                    }
                    break;

                case "P":
                    leftStack.push(strings[1]);
                    break;
            }
        }

        if (!rightStack.empty()) {
            while (rightStack.size() > 0) {
                leftStack.push(rightStack.pop());
            }
        }

        while (leftStack.size() > 0) {
            rightStack.push(leftStack.pop());
        }

        while (rightStack.size()>0){
            sb.append(rightStack.pop());
        }
        System.out.print(sb);

    }
}
