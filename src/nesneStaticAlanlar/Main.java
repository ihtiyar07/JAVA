package nesneStaticAlanlar;

public class Main {
    public static void main(String[] args){
        System.out.println("static değişkenimize sınıf üzerinden erişim.");

        System.out.println("nesne sayisi: "+ Dikdortgen.getNesneSayisi());
        Dikdortgen dd1 = new Dikdortgen();
        System.out.println("nesne sayisi: " + Dikdortgen.getNesneSayisi());
        Dikdortgen dd2 = new Dikdortgen();
        System.out.println("nesne sayisi: " + Dikdortgen.getNesneSayisi());

        System.out.println();

        System.out.println("static değişkene nesne üzerinden erişim");
        System.out.println("nesne sayıisi= "  + dd1.getNesneSayisi());
        System.out.println("nesne sayıisi= "  + dd2.getNesneSayisi());

    }
}
