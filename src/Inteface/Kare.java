package Inteface;

public class Kare implements IMatch {
    private double KenarUzunlugu;

    public Kare() {
        KenarUzunlugu = 0;
    }
    public Kare(int kenarUzunlugu){

        this.KenarUzunlugu = kenarUzunlugu;
    }

    public double getKenarUzunlugu() {

        return this.KenarUzunlugu;
    }

    public void setKenarUzunlugu(double kenarUzunlugu) {

        this.KenarUzunlugu = kenarUzunlugu;
    }

    public double alanHesaplama() {
        return KenarUzunlugu * KenarUzunlugu;
    }


    public String match(Object Nsn) {
        Kare kare = (Kare) Nsn;
        if (this.alanHesaplama() < kare.alanHesaplama()) {

            return "asıl nesnenin sahip olduğu alan parametredeki nesnenin alanından büyüktür:";
        }
        else if (this.alanHesaplama() < kare.alanHesaplama()) {

            return "asıl nesnenin sahip olduğu alna parametredeki nesnenin alanından küçüktür";
        }
        else {
            return "nesnelerin saip olduğu alanlar eşittir";
        }
    }
}
