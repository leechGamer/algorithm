import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        ArrayList result = new ArrayList<Character>();
        char[] inputArray = input.toCharArray();

        for (int i=0;i<inputArray.length;i++) {
            if (! result.contains(inputArray[i])) {
                result.add(inputArray[i]);
            }
        }

        for (int j=0;j<result.size();j++) {
            System.out.print(result.get(j));
        }
    }
}
