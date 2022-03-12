import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        for (int i=1;i<number+1;i++) {
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            for (int k=0;k<(number-i)*2;k++) {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int x=1;x<number;x++) {
            for (int y=0;y<number-x;y++) {
                System.out.print("*");
            }
            for (int z=0;z<x*2;z++) {
                System.out.print(" ");
            }
            for (int y=0;y<number-x;y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
