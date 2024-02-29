package Bil_lab_ödevi_2.soru;


public abstract class Yiyecek {
    private String name;
    private String renk;
    private String yetistigi_yer;

    public  Yiyecek(String name, String renk, String yetistigi_yer) {
        this.yetistigi_yer = yetistigi_yer;
        this.renk = renk;
        this.name = name;
    }

    public void setDegerAl(String name, String renk, String yetistigi_yer){
        this.name = name;
        this.renk = renk;
        this.yetistigi_yer = yetistigi_yer;
    }
    public void setDegerAl(String name, String renk){
        this.name = name;
        this.renk = renk;
    }
    public String getYetistigi_yer() {
        return yetistigi_yer;
    }
    public String getName() {
        return name;
    }
    public String getRenk() {
        return renk;
    }

    public  String YiyecekTuru(){
        return "belirsiz";
    }

}

