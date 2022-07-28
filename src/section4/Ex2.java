package section4;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";

            map.put(c, map.get(c) - 1);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.next();

        Ex2 T = new Ex2();
        System.out.println(T.solution(s1, s2));

    }
}
