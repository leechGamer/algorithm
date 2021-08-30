import java.util.*;

public class PeerLeader {
    /**
     15
     BACBACCACCBDEDE
     */

    public static String solution(String[] arr) {
        String answer = "";
        HashMap<String, Integer> hash = new HashMap();
        for (int i=0;i<arr.length;i++) {
            Integer num = hash.get(arr[i]);
            if (num != null) {
                num ++;
                hash.put(arr[i], num);
            } else {
                hash.put(arr[i], 1);
            }
        }
        int max = Collections.max(hash.values());
        for (Map.Entry<String, Integer> h : hash.entrySet()) {
            if (max == h.getValue()) {
                answer = h.getKey();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        String[] arr = input.split("");

        String answer = solution(arr);
        System.out.println(answer);
    }
}
