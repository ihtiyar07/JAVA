package yapilandiricilar;

public class Student {
    private String name;
    private String surname;
    private int StudentAge;
    private int StudentNumber;


    public Student(String name, String surname, int StudentAge, int StudentNumber){
        this.name = name;
        this.surname = surname;
        this.StudentAge = StudentAge;
        this.StudentNumber = StudentNumber;
    }
    public Student(){
        this.name = getName();
        this.surname = getSurname();
        this.StudentAge = getStudentAge();
        this.StudentNumber = getStudentNumber();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public void setStudentAge(int studentAge) {

        if(studentAge < 0)
            StudentAge = 0;
        else
            StudentAge = studentAge;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if(studentNumber < 0)
            StudentNumber = 0;
        else
            StudentNumber = studentNumber;
    }
}