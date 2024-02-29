package ErisimBelirleyiciler;

public class Dikdortgen {
    private double en;
    private double boy;

    public double DikdortgenAlani(){
        return this.en*this.boy;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
    public double getEn(){
        return en;
    }
    public void setEn(double en){
        this.en = en;
    }
}

