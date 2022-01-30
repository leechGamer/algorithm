import java.util.*;

public class Main {
    /*
     * 2. 공통 원소 구하기
     * 5
     * 1 3 9 5 2
     * 5
     * 3 2 5 7 8
     * */
    public static ArrayList solution(ArrayList A, ArrayList B) {
        int len = A.size() > B.size() ? A.size() : B.size();
        int pA = 0;
        int pB = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while (pA < len && pB < len) {
            int a = (int) A.get(pA);
            int b = (int) B.get(pB);
            if (a < b) {
                pA++;
                continue;
            } else if (a > b) {
                pB++;
                continue;
            } else if (a == b){
                answer.add(a);
                pA++;
                pB++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i=0;i<numA;i++) {
            A.add(scanner.nextInt());
        }
        A.sort(Comparator.naturalOrder());

        int numB = scanner.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i=0;i<numB;i++) {
            B.add(scanner.nextInt());
        }
        B.sort(Comparator.naturalOrder());

        ArrayList answer = solution(A, B);
        for (int i=0;i<answer.size();i++) {
            System.out.print(answer.get(i)+" ");
        }
    }
}
