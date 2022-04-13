import java.util.*;

public class Main {
    public static final int a = 97;
    public static final int z = 122;
    public static final int A = 65;
    public static final int Z = 90;
    public static final int SPACE = 32;
    public static final int ZERO = 48;
    public static final int NINE = 57;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(s.hasNextLine()) {
            int small = 0;
            int big = 0;
            int number = 0;
            int spaceCount = 0;

            char[] S = s.nextLine().toCharArray();

            for (int i=0;i<S.length;i++) {
                int ascii = S[i];
                if (a <= ascii && ascii <= z) {
                    small += 1;
                    continue;
                }
                if (A <= ascii && ascii <= Z) {
                    big += 1;
                    continue;
                }
                if (ZERO <= ascii && ascii <= NINE) {
                    number += 1;
                    continue;
                }
                if (ascii == SPACE) {
                    spaceCount += 1;
                    continue;
                }
            }
            System.out.println(small+" " + big + " " + number + " " + spaceCount);
        }
    }
}

