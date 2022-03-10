package DataStructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex_9012 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String s = br.readLine();
            boolean ex = false;

            Stack stack = new Stack();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                } else {
                    if (stack.empty()) {
                        ex = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }

            }
            if (!stack.empty() || ex) {
                bw.write("NO" + "\n");
            } else {
                bw.write("YES" + "\n");
            }

        }


        bw.flush();
        bw.close();
        br.close();

    }
}
