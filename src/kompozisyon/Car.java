package kompozisyon;

public class Car {
    private Motor motor = new Motor();

    public void hareketZamanı(){
        motor.caistir();
        System.out.println("yola cikalım...");
    }
    public void stopTime(){
        motor.Stop();
        System.out.println("eve geldikk... ");
    }
    public static void main(String []args){
        Car car = new Car();
        car.hareketZamanı();
        car.stopTime();
    }

    }
