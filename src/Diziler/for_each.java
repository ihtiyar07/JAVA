package Diziler;

public class for_each {
    public static void main(String[] args) {
        int[] D = {1,2,3,4,5,6};
        int toplam = 0;

        for(int x:D){
            toplam += x;
        }

        System.out.println("dizi elemanları toplamı:" + toplam);


    }
}
