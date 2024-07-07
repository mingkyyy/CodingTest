import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
         ArrayList<Integer> arrayList = new ArrayList<>();
        int TY = Integer.parseInt(today.substring(0, 4));
        int TM = Integer.parseInt(today.substring(5, 7));
        int TD = Integer.parseInt(today.substring(8, 10));

        int cnt = (TY * 12 * 28) + (TM * 28) + TD; //현재 총 날짜수


        for (int i = 0; i < privacies.length; i++) {
            String tmp = privacies[i];
            String Al[] = tmp.split(" ");
            String check = Al[1];

            int PY = Integer.parseInt(Al[0].substring(0, 4));
            int PM = Integer.parseInt(Al[0].substring(5, 7));
            int PD = Integer.parseInt(Al[0].substring(8, 10));
            int cnt2 = (PY * 12 * 28) + (PM * 28) + PD; //이전의 총 날짜수

            for (int j = 0; j < terms.length; j++) {
                String arr[] = terms[j].split(" ");
                int term = Integer.parseInt(arr[1]);

                String check2 = arr[0];

                if (check2.equals(check)) {
                    cnt2 = cnt2 + ((term * 28)-1);
                    if (cnt2 < cnt) {
                        arrayList.add(i+1);
                    }
                }
            }
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }


            
        return answer;
    }
}