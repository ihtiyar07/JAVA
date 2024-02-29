package Bil_lab_ödevi_2.soru;

public class Sebze extends Yiyecek{


    public Sebze(String name, String renk, String yetistigi_yer) {
        super(name,renk, "toprak");
    }

    public Sebze(String lahana, String kırmızı, String string) {


    }

    public String YiyecekTuru(){
        return "sebze";

    }

    @Override
    public void setDegerAl(String name, String renk, String yetistigi_yer) {
        super.setDegerAl("", "", "toprak");
    }
}