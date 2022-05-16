package section1;

import java.util.Scanner;

public class Ex2 {
    public String solution(String s) {
        String answer = "";

//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isUpperCase(s.charAt(i)) == true) {
//                answer += Character.toLowerCase(s.charAt(i));
//            } else {
//                answer += Character.toUpperCase(s.charAt(i));
//            }
//        }

        for (char x : s.toCharArray()){
            if (Character.isUpperCase(x) == true) {
                answer += Character.toLowerCase(x);
            } else {
                answer += Character.toUpperCase(x);
            }
        }
        return answer;

    }


    public static void main(String[] args) {

        Ex2 T = new Ex2();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
    }
}
