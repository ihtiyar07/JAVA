package Inteface;

public class Personel implements IMatch{

    private int age;
    public Personel(){
        age = 0;
    }
    public Personel(int age){
        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age < 0)
            age = 0;
        else
            this.age = age;
    }

    @Override
    public String match(Object Nsn) {

        Personel personel = (Personel)Nsn;
        if(personel.age < this.age){

            return "asıl nesnede verilen perssonelin aşı prametre olarak verilen nesnedeki personelin yaşından büyüktür...";
        }
        else if(personel.age > this.age)
            return "asıl nesnede verilen personelin yaşı parametre olarak verilen nenedeki personelin yaşından küçüktür...";
        else
            return "asıl nesnede verilen personelin yaşı parametre olarak verilen nesnedeki personelin yaşına eşittir...";
    }
}
