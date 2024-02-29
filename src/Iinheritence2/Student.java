package Iinheritence2;

public class Student extends Employee{
    private int IDnumber;

    public int getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }

    public Student(String name, String surName, int age, int IDnumber) {
        super(name, surName, age);
        this.IDnumber = IDnumber;
    }

    public String IDimformation(){
        return "kimlik bilgileri: " + "isim: " + getName() + "   soyisimi: " + getSurName() + "  yaşı: " + getAge() + "  ID numarası: " + IDnumber;
    }

}
