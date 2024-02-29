package Bil_lab_ödev_2.sour2.deneme;

public abstract class Yiyecek {
    private String name;
    private String renk;
    private String yetistigi_yer;

    public void Yiyecek(String name, String renk, String yetistigi_yer) {
        this.yetistigi_yer = yetistigi_yer;
        this.renk = renk;
        this.name = name;
    }
/*
    public Yiyecek(String name, String renk, String yetistigi_yer) {
        this.name = name;
        this.renk = renk;
        this.yetistigi_yer = yetistigi_yer;
    }*/

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

    public static String YiyecekTuru(){
        return "belirsiz";
    }

}
