package section1;

import java.util.Scanner;

public class Ex1 {
    public int solution(String strings, char t) {
        int answer = 0;
        strings = strings.toLowerCase();
        t = Character.toLowerCase(t);

//        for (int i = 0; i < strings.length(); i++) {
//            if (strings.charAt(i) == t) {
//                answer++;
//            }
//        }
        for (char x :strings.toCharArray()){
            if (x == t){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        Character input2 = in.nextLine().charAt(0);
        System.out.println(T.solution(input1, input2));
    }
}
