package Inheritence;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Ahmet","ihtiyar",18);
        Student s = new Student("Ahmet", "ihtiyar",18,32849);

        System.out.println(e.IDimformation());
        System.out.println(s.KimlikBilgileri());
    }
}
