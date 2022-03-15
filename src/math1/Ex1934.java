package math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1934 {
    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return GCD(b, a % b);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int c = Math.max(a, b);
            b = Math.min(a, b);
            a = c;

            int result = GCD(a, b);
            sb.append(a*b/result).append("\n");

        }
        System.out.println(sb);
    }
}
