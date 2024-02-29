package Diziler;

public class ParametreSayisiDegisken {
    public static void main(String[] args) {

        toplamSayi(3);
        toplamSayi(3,7,5);
        toplamSayi(3,4,5,5,6,9,92);
    }

    public static void toplamSayi(int... sayilar){
        int toplam = 0;
        for(int x:sayilar)
            toplam+=x;

        System.out.println("sayilarin toplamı:" + toplam);
    }

}
