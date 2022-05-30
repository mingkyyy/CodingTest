package section1;

import java.util.Scanner;

public class Ex8 {

    public String solution(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();

        if (s.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Ex8 T = new Ex8();
        System.out.println(T.solution(s));

    }
}
