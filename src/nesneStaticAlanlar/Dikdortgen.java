package nesneStaticAlanlar;

public class Dikdortgen {
    private double en;
    private double boy;
    private static int nesneSayisi;

    public Dikdortgen(){
        nesneSayisi++;
    }

    public double DikdortgenAlani() {
        return en*boy;
    }

    public static int getNesneSayisi() {
        return nesneSayisi;
    }

}
