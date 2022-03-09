package DataStructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex_9093 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack();

        for (int i = 0; i < n; i++) {
            String[] strings = br.readLine().split(" ");

            for (int j = 0; j < strings.length; j++) {

                for (int k = 0; k < strings[j].length(); k++) {
                    stack.push(strings[j].charAt(k));
                }
                while (!stack.empty()){
                    bw.write(String.valueOf(stack.pop()));
                }
                bw.write(" ");
            }
            bw.write("\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
