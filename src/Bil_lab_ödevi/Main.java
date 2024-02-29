package Bil_lab_ödevi;

public class Main {
    public static void main(String[] args) {
        Rabbit rb = new Rabbit();
        Kaplumbaga kp = new Kaplumbaga();

        int tavsan_sayisi = rb.rabitSayı();
        int turtle_sayisi = kp.turtleSayı();


        int toplam_adim_rabit = 0;
        int toplam_adim_turtle = 0;

        while(toplam_adim_rabit <=20 && toplam_adim_turtle <=20){
            toplam_adim_rabit += rb.rabbitAdım(rb.rabitSayı());
            toplam_adim_turtle += kp.turtleAdım(kp.turtleSayı());

            if(toplam_adim_rabit < 1){
                toplam_adim_rabit = 1;
            }
            if(toplam_adim_turtle < 1){
                toplam_adim_turtle = 1;
            }
            if(toplam_adim_rabit >= 20){
                System.out.println("Tavşan kazandı oley!!!");
                break;
            }
            else if(toplam_adim_turtle >= 20){
                System.out.println("Kaplumbağa kazandı oley !!!");
                break;
            }
            else if(toplam_adim_rabit == toplam_adim_turtle){
                for(int i=1; i<= 16; i++){
                    if(i == toplam_adim_rabit){
                        System.out.print("OUCH");
                    }
                    System.out.print("_");
                }
            }
            else{
                for(int i=1; i<=18; i++){
                    if(toplam_adim_rabit == i){
                        System.out.print("T");
                    }
                    else if(toplam_adim_turtle == i){
                        System.out.print("K");
                    }
                    else{

                    }
                    System.out.print("_");
                }

            }
            System.out.println();



        }

    }

}
