class Student {
    String name;
    int age;

    public Student(String saurabh, int i) {
        name=saurabh;
        age=i;

    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("saurabh",12);
        System.out.println(s.name); // null
        System.out.println(s.age);  // 0
    }
}