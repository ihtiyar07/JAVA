package metotlaraNesneAtama;

public class Main {
    public static void main(String[] args) {
        Dikdortgen dd1 = new Dikdortgen(5,5);

       System.out.println("Dikdortgen alani:" + dd1.Dikdortgen());
       yeniDikdortgen(dd1);
       System.out.println("Yeni dikdortgen alani:" + dd1.Dikdortgen());

        double x = 123.55e52;
        System.out.println(x);


    }
    public static void yeniDikdortgen(Dikdortgen dd1){
        dd1.setBoy(7);
        dd1.setEn(8);

    }


}
