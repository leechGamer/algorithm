import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next();
        String answer = new String();
        for (int i=0;i<text.length();i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                answer += Character.toLowerCase(text.charAt(i));
            } else {
                answer += Character.toUpperCase(text.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
