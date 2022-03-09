package DataStructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex10828_2 {
    private int stack[];
    private int index;

    public Ex10828_2(int size) {
        this.index = -1;
        this.stack = new int[size];
    }

    public void push(int num) {
        stack[++index] = num;
    }

    public int pop() {
        if (index == -1) {
            return -1;
        }else {
            return stack[index--];
        }
    }

    public int size() {
        return index + 1;
    }

    public int empty() {
        if (index == -1) {
            return 1;
        }else {
            return 0;
        }
    }

    public int top() {
        if (index == -1) {
            return -1;
        }else {
            return stack[index];
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Ex10828_2 MyStack = new Ex10828_2(n);

        for (int i = 0; i < n; i++) {
            String[] array = br.readLine().split(" ");

            switch (array[0]) {
                case "push":
                    MyStack.push(Integer.parseInt(array[1]));
                    break;

                case "pop":
                    bw.write(MyStack.pop() + "\n");
                    break;

                case "size":
                    bw.write(MyStack.size() + "\n");
                    break;

                case "empty":
                    bw.write(MyStack.empty() + "\n");
                    break;

                case "top":
                    bw.write(MyStack.top() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();


    }
}
