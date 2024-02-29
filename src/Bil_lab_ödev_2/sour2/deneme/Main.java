package Bil_lab_ödev_2.sour2.deneme;

import Bil_lab_ödevi_2.soru.Sebze;

public class Main {
    public static void main(String[] args) {

     Yiyecek lahana = new Meyve();

     lahana.setDegerAl("lahana","kirimzi");

     

    }

    public static void Yazdir(Yiyecek a){

        System.out.println(a.getName()+" bir "+ a.YiyecekTuru());

    }


}
