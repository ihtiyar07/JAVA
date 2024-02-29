package Diziler;

public class MethodaDiziAtama {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,4,5,};
        methodDizi(dizi);
    }
    public static void methodDizi(int[] dizi){
        dizi[0] = 9384;
        for(int i:dizi)
            System.out.println(i);

    }
}
