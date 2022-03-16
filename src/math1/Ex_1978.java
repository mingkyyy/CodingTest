package math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1978 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            boolean check = false;

            if (array[i] == 1) {
                check = true;
            } else {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        check = true;
                    }
                }
            }
            if (check == false) {
                result++;
            }
        }
        System.out.println(result);
    }
}
