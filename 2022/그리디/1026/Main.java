import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for (int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        A.sort(Comparator.naturalOrder());

        for (int i=0;i<n;i++) {
            B.add(s.nextInt());
        }
        B.sort(Comparator.reverseOrder());

        int result = 0;
        for (int i=0;i<n;i++) {
            result += A.get(i) * B.get(i);
        }
        System.out.println(result);
    }
}

