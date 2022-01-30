import java.util.*;

public class Main {
    /*
     * 2. 두 배열 합치기
     * 3
     * 1 3 5
     * 5
     * 2 3 6 7 9
     * */
    public static ArrayList solution(ArrayList A, ArrayList B) {
        int pA = 0;
        int pB = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while (pA < A.size() && pB < B.size()) {
            int a = (int) A.get(pA);
            int b = (int) B.get(pB);
            if (a < b) {
                answer.add(a);
                pA++;
                continue;
            } else if (a > b) {
                answer.add(b);
                pB++;
                continue;
            } else if (a == b){
                answer.add(a);
                answer.add(b);
                pA++;
                pB++;
            }
        }
        
        if (pA < A.size()) {
            for (int i=pA;i< A.size();i++) {
                answer.add((Integer) A.get(i));
            }
        } else if (pB < B.size()) {
            for (int i=pB;i< B.size();i++) {
                answer.add((Integer) B.get(i));
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

        int numB = scanner.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        for (int i=0;i<numB;i++) {
            B.add(scanner.nextInt());
        }

        ArrayList answer = solution(A, B);
        for (int i=0;i<answer.size();i++) {
            System.out.print(answer.get(i)+" ");
        }
    }
}
