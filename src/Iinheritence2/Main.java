package Iinheritence2;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("ahmet", "ihtiyar", 39);
        Student s = new Student("ahmet", "ihtiyar", 18,2884);

        System.out.println(e.IDimformation());
        System.out.println(s.IDimformation());
    }
}
