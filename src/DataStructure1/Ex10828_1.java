package DataStructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex10828_1 {
    public static void main(String[] args)throws Exception{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack stack = new Stack();

        int n = Integer.parseInt(br.readLine());

        for (int i =0; i<n; i++){

            String array[] = br.readLine().split(" ");

            switch (array[0]){
                case "push":
                    stack.push(array[1]);
                    break;

                case "pop":
                    if (stack.empty()){
                        bw.write(-1+"\n");
                    }else {
                        bw.write(stack.pop()+"\n");
                    }
                    break;

                case "size":
                    bw.write(stack.size()+"\n");
                    break;

                case "empty":
                    if (stack.isEmpty() == true){
                        bw.write(1+"\n");
                    }else {
                        bw.write(0+"\n");
                    }
                    break;

                case "top":
                    if (stack.empty()){
                        bw.write(-1+"\n");
                    }else {
                        bw.write(stack.peek()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}