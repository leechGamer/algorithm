import java.util.*;

class Person {
    String name;
    int korean;
    int english;
    int math;

    public Person(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Person[] arr = new Person[n];
        for (int i=0;i<n;i++) {
            String name = s.next();
            int korean = s.nextInt();
            int english = s.nextInt();
            int math = s.nextInt();
            Person p= new Person(name, korean, english, math);
            arr[i] = p;
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.korean == o2.korean) {
                if (o1.english == o2.english) {
                    if (o1.math == o2.math) {
                        return o1.name.compareTo(o2.name);
                    }
                    return o2.math - o1.math;
                }
                return o1.english - o2.english;
            }
            return o2.korean - o1.korean;
        });

        for (int i=0;i< arr.length;i++) {
            System.out.println(arr[i].name);
        }
    }
}

