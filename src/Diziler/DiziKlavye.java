package Diziler;

import java.util.Scanner;

public class DiziKlavye {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        int[] girSayi = new int[5];

        for(int i=0; i<5; i++)
            girSayi[i] = deger.nextInt();

        for(int i=0; i<girSayi.length; i++)
            System.out.println((i+1) + "inci eleman:" + girSayi[i]);
    }
}
