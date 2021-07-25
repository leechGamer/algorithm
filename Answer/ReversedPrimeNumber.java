import java.util.Scanner;

public class ReversedPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i=0;i<num;i++) {
            int inputNumber = transformer(scanner.next());
            if (isPrimeNumber(inputNumber)) {
                System.out.print(inputNumber+ " ");
            }
        }
    }

    public static int transformer(String input) {
        String reversed = "";
        for (int i=input.length()-1;i>=0;i--) {
            reversed += input.charAt(i);
        }

        return Integer.parseInt(reversed);
    }

    public static boolean isPrimeNumber(int number) {
        int[] arr = new int[number+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i=2;i<number+1;i++) {
            if (arr[i] == 1) {
                continue;
            } else {
                int a = 2;
                while (i * a < number + 1) {
                    arr[i * a] = 1;
                    a++;
                }
            }
        }
        if (arr[number] != 1) {
            return true;
        }
        return false;
    }
}
