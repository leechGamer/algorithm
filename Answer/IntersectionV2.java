import java.util.*;

public class IntersectionV2 {
    /**
     공통원소 구하기
     5
     1 3 9 5 2
     5
     3 2 5 7 8
     */

    public static Integer[] solution(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashSet<Integer> set1 = new HashSet<>(A);
        HashSet<Integer> set2 = new HashSet<>(B);

        set1.retainAll(set2);

        List<Integer> answer = new ArrayList<>(set1);
        Collections.sort(answer);

        return answer.toArray(new Integer[set1.size()]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i=0;i<n;i++) {
            A.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i=0;i<m;i++) {
            B.add(scanner.nextInt());
        }
        Integer[] answer = solution(A, B);

        for (int i=0;i<answer.length;i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
