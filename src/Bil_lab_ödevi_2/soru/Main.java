package Bil_lab_ödevi_2.soru;

public class Main {
    public static void main(String[] args) {

        Yiyecek lahana = new Sebze("lahana","kırmızı","");
         Yiyecek elma = new Meyve("elma","yeşil","");



        Yazdir(lahana);
        Yazdir(elma);

    }
    public static void Yazdir(Yiyecek a){

            System.out.println(a.getName()+" bir "+ a.YiyecekTuru()+"dir."+a.getName()+" "+a.getYetistigi_yer()+"'ta yetişir.");

    }
}






