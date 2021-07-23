import java.util.Scanner;

public class UpperCaseLowerCase {
    /*
    StuDY
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = "";
        for (char i : input.toCharArray()) {
            if (Character.isUpperCase(i)) {
                result += String.valueOf(i).toLowerCase();
            } else {
                result += String.valueOf(i).toUpperCase();
            }
        }
        System.out.println(result);
    }
}
