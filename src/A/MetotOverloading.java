package A;

public class MetotOverloading {
    public static void main(String[] args) {
        int birinciSayi = 8;
        int ikinciSayi = 5;
        double sayi1 = 8.5;
        double sayi2 = 5.8;
        int mutlakFark = farkiniAl(birinciSayi,ikinciSayi);
        System.out.println(birinciSayi+ " ve "+ ikinciSayi + "mutlak farki:" + mutlakFark);


        double mutlakFarkDouble = farkiniAl(sayi1, sayi2);
        System.out.println(sayi1 + " ve " + sayi2 + " mutlak farki:" + mutlakFarkDouble);
    }
    public static int farkiniAl(int x, int y){
        if(x > y)
            return x-y;
        else
            return y-x;
    }
    public static double farkiniAl(double x, double y) {
        if(x > y)
            return x-y;
        else
            return y-x;
    }
}
