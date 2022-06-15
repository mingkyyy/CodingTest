package section1;

import java.util.Scanner;

public class Ex12 {
    public String solution(int n, String s) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String str = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(str, 2);
            answer += (char) num;
            s = s.substring(7);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Ex12 T = new Ex12();
        System.out.println(T.solution(n, s));

    }
}
