
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solution(n);
    }

    private static void solution(int n) {
        for (int i=0;i<n;i++) {
            for (int k=1;k<i+1;k++) {
                System.out.print(" ");
            }
            for (int j=0;j<n-i;j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

