package section1;

import java.util.Scanner;

public class Ex5 {

    public String solution(String s){
        String answer = "";
        char[] chars = s.toCharArray();

        int ln = 0, rn=chars.length-1;

        while (ln<rn){
            if (Character.isAlphabetic(chars[ln]) == false){
                ln++;
            }else if (Character.isAlphabetic(chars[rn]) == false){
                rn--;
            }else {
                char tmp = chars[ln];
                chars[ln] = chars[rn];
                chars[rn] = tmp;

                ln ++;
                rn --;
            }
        }
        answer = String.valueOf(chars);


        return answer;
    }

    public static void main(String[] args) {
        Ex5 T = new Ex5();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
