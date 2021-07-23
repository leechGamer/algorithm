
import java.util.Scanner;

public class FindCharacter {
    /*
    Computercooler
    c
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase();
        char target = scanner.next().toUpperCase().charAt(0);
        int count = 0;
        for (char i : input.toCharArray()) {
            if (i == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}
