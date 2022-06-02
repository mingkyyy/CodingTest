package section1;

import java.util.Scanner;

public class Ex9 {

    public int solution(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Ex9 T = new Ex9();
        System.out.println(T.solution(s));

    }
}
