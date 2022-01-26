import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        char[] inputArray= input.toCharArray();
        int i = 0;
        int j = inputArray.length-1;
        while (i < j) {
            if (! Character.isAlphabetic(inputArray[i])) {
                i++;
                continue;
            }

            if (! Character.isAlphabetic(inputArray[j])) {
                j--;
                continue;
            }

            if (Character.isAlphabetic(inputArray[i]) && Character.isAlphabetic(inputArray[j])) {
                char tmp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = tmp;
                i++;
                j--;
            }
        }

        for (int k=0;k<inputArray.length;k++) {
            System.out.print(inputArray[k]);
        }
    }
}
