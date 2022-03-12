import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        for (int i=0;i<number;i++) {
            for (int j=1;j<number-i;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<i+1;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
