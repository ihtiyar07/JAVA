package nesneFinalAlanlar2;

public class FinalConstractor {
    private  double en;
    private  double boy;


    public double FinalConstractorAlan(){
        return this.en * this.boy;
    }

    public FinalConstractor(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
        
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
}
