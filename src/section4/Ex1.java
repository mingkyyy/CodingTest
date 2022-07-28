package section4;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {
    public char solution(int n, String s) {
       char answer = ' ';
       int max = 0;
       HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char key : map.keySet()){
            if (map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Ex1 T = new Ex1();
        System.out.println(T.solution(n, s));

    }
}
