
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    static void solution(int M, int D) {
        LocalDate date = LocalDate.of(2007, M, D);
        System.out.print(date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M = s.nextInt();
        int D = s.nextInt();
        solution(M, D);
    }
}

