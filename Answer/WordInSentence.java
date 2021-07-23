import java.util.Scanner;

public class Main {
    /*
it is time to study
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int max = 0;
        int resultIndex = 100;
        for (int i=0;i<arr.length;i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                resultIndex = i;
            }
        }

        System.out.println(arr[resultIndex]);
    }
}
