package Bil_lab_ödev_2.sour2.deneme;

public class Meyve extends Yiyecek {


    @Override
    public void setDegerAl(String name, String renk) {
        super.setDegerAl(name, renk,"agac");
    }

    public static String YiyecekTuru(){
        return "meyve";

    }



}
