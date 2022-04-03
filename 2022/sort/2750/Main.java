import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++) {
            list.add(s.nextInt());
        }
        list.sort(Comparator.naturalOrder());
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}

