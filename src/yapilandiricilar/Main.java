package yapilandiricilar;

public class Main {
    public static void main(String[] args) {
        Student ogr1 = new Student("Ahmet", "ihtiyar", 18,211);
        Student ogr2 = new Student();
        ogr2.setName("Selman");
        ogr2.setSurname("Kaya");
        ogr2.setStudentNumber(7);
        ogr2.setStudentAge(25);

        showInfos(ogr1);
        System.out.println();
        showInfos(ogr2);

    }
    public static void showInfos(Student x){
        System.out.println("isim:"+x.getName());
        System.out.println("soyisim:" + x.getSurname());
        System.out.println("numarası:" + x.getStudentNumber());
        System.out.println("yası:" + x.getStudentAge());
    }
}
