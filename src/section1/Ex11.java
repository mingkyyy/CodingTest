package section1;

import java.util.Scanner;

public class Ex11 {
    public String solution(String s) {
        String answer = "";
        s = s + " ";
        int count = 1;


        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                answer += s.charAt(i);
                if (count > 1) {
                    answer += count;
                    count = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Ex11 T = new Ex11();
        System.out.println(T.solution(s));

    }
}
