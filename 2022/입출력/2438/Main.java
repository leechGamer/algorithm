import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        for (int i=1;i<n+1;i++) {
            for (int j=1;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

