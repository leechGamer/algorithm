
import java.util.Scanner;

public class ReverseLetters {
    /*
    a#b!GE*T@S
    output: S#T!EG*b@a
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int lt = 0;
        int rt = input.length()-1;
        StringBuilder result = new StringBuilder(input);

        for (int i=0;i<input.length()/2;i++) {
            if (!Character.isLetter(input.charAt(lt))) {
                lt++;
            }

            if (!Character.isLetter(input.charAt(rt))) {
                rt--;
            }

            if (Character.isLetter(input.charAt(lt)) && Character.isLetter(input.charAt(rt))) {
                char tmp = input.charAt(lt);
                result.setCharAt(lt, input.charAt(rt));
                result.setCharAt(rt, tmp);
                lt++;
                rt--;
            }
        }
        System.out.println(result.toString());
    }
}
