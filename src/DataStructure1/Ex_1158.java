package DataStructure1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex_1158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList();
        sb.append("<");

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k; i++) {

                if (i == k - 1) {
                    if (queue.size() == 1) {
                        sb.append(queue.poll());
                    } else {
                        sb.append(queue.poll()).append(", ");
                    }
                } else
                    queue.add(queue.poll());
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
