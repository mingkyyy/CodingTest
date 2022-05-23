package section1;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public ArrayList<String> solution(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();

//        for (String s : strings) {
//            String st = new StringBuilder(s).reverse().toString();
//            answer.add(st);
//        }


        for (String s : strings){
            char[] characters = s.toCharArray();
            int ln = 0, rn = characters.length-1;

            while (ln<rn){
                char tmp = characters[ln];
                characters[ln] = characters[rn];
                characters[rn] = tmp;
                ln++;
                rn--;
            }
            answer.add(String.valueOf(characters));
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }

        Ex4 T = new Ex4();

        for (String s : T.solution(n, strings)) {
            System.out.println(s);
        }
    }
}
