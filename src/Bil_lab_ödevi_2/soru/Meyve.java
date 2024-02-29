package Bil_lab_ödevi_2.soru;

public class Meyve extends Yiyecek{

    public Meyve(String name, String renk, String yetistigi_yer) {
        super(name, renk, "ağaç");
    }

    public String YiyecekTuru(){
        return "meyve";

    }


    @Override
    public void setDegerAl(String name, String renk, String yetistigi_yer) {

        super.setDegerAl("","","ağaç");
        setDegerAl(name,renk);

    }
}