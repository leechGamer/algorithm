
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        for (int i=0;i<number;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<(number-i)*2;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x=1;x<number;x++) {
            for (int y=1;y<number-x;y++) {
                System.out.print(" ");
            }
            for (int z=0;z<2*x+1;z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
