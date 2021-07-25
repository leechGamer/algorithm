import java.util.Scanner;

public class RockScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] A = new String[num];
        String[] B = new String[num];
        for (int i=0;i<num;i++) {
            A[i] = scanner.next();
        }

        for (int i=0;i<num;i++) {
            B[i] = scanner.next();
        }

        for (int i=0;i<num;i++) {
            System.out.println(getWinner(A[i], B[i]));
        }
    }

    static String getWinner(String A, String B) {
        if (A.equals(B)) {
            return "D";
        } else {
            if (A.equals("1") && B.equals("3")) return "A";
            else if (A.equals("2") && B.equals("1")) return "A";
            else if (A.equals("3") && B.equals("2")) return "A";
        }
        return "B";
    }
}
