import java.util.*;

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Person[] arr = new Person[n];
        for (int i=0;i<n;i++) {
            int age = s.nextInt();
            String name = s.next();
            Person p= new Person(age, name);
            arr[i] = p;
        }

        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person p : arr) {
            System.out.println(p.age + " " + p.name);
        }
    }
}

