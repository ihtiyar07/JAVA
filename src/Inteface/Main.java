package Inteface;

public class Main {
    public static void main(String[] args) {
        Kare kare = new Kare(2);
        Kare kare1 = new Kare(9);

        Personel personel = new Personel(89);
        Personel personel1 = new Personel(89);

        System.out.println("karelerin alanlarını karşılaştır:  " + kare.match(kare1));
        System.out.println("Personellerin yaşlarını karşılaştır:  " + personel.match(personel1));
    }
}
