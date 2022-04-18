
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int count = 0;
        for (int i=0;i<N;i++) {
            char[] elements = s.next().toCharArray();
            List<Character> store = new ArrayList<>();
            boolean isValid = true;
            if (elements.length > 1) {
                store.add(elements[0]);
                for (int j=1;j<elements.length;j++) {
                    if (store.contains(elements[j])) {
                        if (elements[j-1] != elements[j]) {
                            isValid = false;
                        }
                    }
                    store.add(elements[j]);
                }
            }

            if (isValid) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}

