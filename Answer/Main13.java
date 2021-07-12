import java.util.Scanner;

public class Main {
//teachermode e
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char target = scanner.next().charAt(0);
        int[] arr = new int[input.length()];
        int p = 1000;
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i) == target) {
                p = 0;
            }
            arr[i] = p;
            p++;
        }
        p = 1000;
        for (int j=input.length()-1;j>-1;j--) {
            if (input.charAt(j) == target) {
                p = 0;
            } else {
                p++;
            }

            if (arr[j] > p) {
                arr[j] = p;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
