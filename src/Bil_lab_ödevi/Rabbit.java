package Bil_lab_ödevi;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Rabbit {
    public int rabitSayı(){
        Random rastgele = new Random();
        int rastgeleSayi = rastgele.nextInt(10)+1;
        return rastgeleSayi;
    }
    public int rabbitAdım(int n){
        if(n <= 2)
            return 0;
        else if(n <= 4)
            return 9;
        else if(n ==5)
            return -12;
        else if(n <= 8)
            return 1;
        else
            return -2;
    }
}
