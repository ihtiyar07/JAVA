package A;

public class BitWiseOperatorler {
    public static void main(String[] args) {

            /*Scanner scanner = new Scanner(System.in);
            byte a1 = 6;
            byte a2 = 2;
            byte a3 = (byte) (a1&a2);
            System.out.print("a3: " + a3);
            */

            /*int sayac = 1, toplam =0;
            for(sayac=1; sayac < 100; sayac++)
                toplam+=sayac;
            System.out.println(toplam);*/

        int sayac = 1, toplam = 0;
        do{
            toplam+=sayac;
            sayac++;

        }while(sayac < 100);
        System.out.println(toplam);



    }
}
