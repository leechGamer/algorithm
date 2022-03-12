import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        for (int i=1;i<number+1;i++) {
            for (int j=0;j<number-i;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<2*i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
