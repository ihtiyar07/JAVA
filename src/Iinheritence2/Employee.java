package Iinheritence2;

public class Employee {
    private String name;
    private String surName;
    private int age;

    public Employee() {
        name = "isim bilinmiyor";
        surName = "soyisim bilinmiyor";
        age = 0;
    }


    public Employee(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String IDimformation() {
        return "kimlik bilgileri: " + "  isim " + getName() + "  soyisimi: " + getSurName() + "  yaşı: " + getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) this.age = 0;
        else this.age = age;
    }
}
