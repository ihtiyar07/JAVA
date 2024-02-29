package NesneYonelimOrnek;
import java.util.Scanner;
public class Dikdortgen {
    private double en;
    private double boy;

    /*public Dikdortgen(double y,double x){
        en = x;
        boy = y;
    }*/
    /*public Dikdortgen() {
        Scanner deger = new Scanner(System.in);
        System.out.println(" dikdortgen için en degeri giriniz");
        en = deger.nextInt();
    }
*/
    public static void main(String[] args) {
        Dikdortgen da1 = new Dikdortgen();
        Dikdortgen da2 = new Dikdortgen();
        da1.en = 4;
        da1.boy = 3;
        da2.en = 6;
        da2.boy = 8;

        System.out.println("1.Dikdortgenin alani:" + da1.DikdortgenAlani());
        System.out.println("2.Dikdortgenin  alani:" + da2.DikdortgenAlani());

    }

    public double DikdortgenAlani() {
        return en * boy;
    }


}
