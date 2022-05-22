package section1;

import java.util.Scanner;

public class Ex3 {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split(" ");
        int max = Integer.MIN_VALUE;

        for (String st : strings) {
            int n = st.length();
            if (n > max) {
                max = n;
                answer = st;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Ex3 T = new Ex3();
        System.out.println(T.solution(s));
    }
}
