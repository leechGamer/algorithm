import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        A.sort(Comparator.naturalOrder());

        System.out.println(A.get(0)*A.get(A.size()-1));
    }
}

