package Bil_lab_ödevi;

import java.util.Random;

public class Kaplumbaga {

    public int turtleSayı(){
        Random rastgele = new Random();
        int rastgeleSayi = rastgele.nextInt(10)+1;
        return rastgeleSayi;
    }

    public int turtleAdım(int n){
        if(n <= 5)
            return 3;
        else if(n <= 7)
            return -6;
        else
            return 1;
    }

}
