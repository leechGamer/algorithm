import java.util.Scanner;

public class Main {
    // 2 decimal -> oct number
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int length = input.length();
        if (length % 3 == 1) {
            System.out.print(input.charAt(0));
        } else if (length % 3 == 2) {
            System.out.print((input.charAt(0)-'0') * 2 + input.charAt(1) - '0');
        }
        for (int i=length % 3;i<length;i+=3) {
            System.out.print((input.charAt(i)-'0') * 4 +  (input.charAt(i+1)-'0') * 2 + (input.charAt(i+2)-'0'));
        }
        System.out.println();
	}
}
