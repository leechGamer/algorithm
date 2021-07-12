import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] arr = new int[number];
        String input = scanner.next();
        int count = 0;
        String word = "";
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i) == '#') {
                word += "1";
            } else if (input.charAt(i) == '*') {
                word += "0";
            }

            if ((i+1)%7 == 0) {
                arr[count] = Integer.parseInt(word, 2);
                count++;
                word = "";
            }
        }

        for (int i=0;i<arr.length;i++) {
            System.out.print((char)arr[i]);
        }
    }
}
