package Inheritence;

public class Student {
    private String name;
    private String surName;
    private int age;
    private int IDnumber;

    public Student(){
        name = "bilinmiyor";
        surName = "bilinmiyor";
        age = 0;
        IDnumber = 0;
    }
    public Student(String name, String surName, int age, int IDnumber){
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.IDnumber = IDnumber;
    }
    public String KimlikBilgileri(){
        return "Kimlik bilgileri:" + name + " " + surName + " " + age + " " + IDnumber;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setIDnumber(int IDnumber){
        this.IDnumber = IDnumber;
    }
    public int getIDnumber(){
    return IDnumber;
    }



}
