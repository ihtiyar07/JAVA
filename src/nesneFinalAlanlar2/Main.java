package nesneFinalAlanlar2;

public class Main {
    public static void main(String[] args) {

        FinalConstractor f = new FinalConstractor(6,5);

        System.out.println("Alan = " + f.FinalConstractorAlan());

        NewDikdortger(f);
    }
    public static void NewDikdortger(FinalConstractor a){
        a.setEn(9);
        a.setBoy(9);
        System.out.println("Yeni dikdortgenin alanı = " + a.FinalConstractorAlan());
    }
}
