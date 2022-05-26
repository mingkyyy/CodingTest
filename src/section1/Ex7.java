package section1;

import java.util.Scanner;

public class Ex7 {
    public String solution(String s) {
        String answer = "YES";
        s = s.toLowerCase();
//        String s2 = new StringBuilder(s).reverse().toString();
//        if (!s.equals(s2)) {
//            answer = "YES";
//        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                answer = "NO";
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Ex7 T = new Ex7();
        System.out.println(T.solution(s));

    }
}
