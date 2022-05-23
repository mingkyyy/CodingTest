package section1;

import java.util.Scanner;

public class Ex6 {
    public String solution(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Ex6 T = new Ex6();
        System.out.println(T.solution(s));

    }

}
