package AbstactClaslar_BTK;

public class Main {
    public static void main(String[] args) {

        GameCalculator gameCalculator = new ManGameCalculator();
        GameCalculator womanCalcultor = new WomanGameCalculator();

        Main main = new Main();
        main.yazdir(gameCalculator);
        main.yazdir(womanCalcultor);




    }
    public void yazdir(GameCalculator k){
        k.hesapla();
        k.GameOver();
        k.Kadir();
    }
}