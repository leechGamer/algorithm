import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = -1000000;
        int min = 1000000;
        for (int i=0;i<n;i++) {
            int c = s.nextInt();
            if (c > max) {
                max = c;
            }
            if (c < min) {
                min = c;
            }
        }
        System.out.print(min + " " + max);
    }
}

