package Diziler;

public class DizilerinKopyalanmasi_ArrayCopy {
    public static void main(String[] args) {
        int[] dizi1 = {1,2,3,4};
        int[] dizi2 = new int[dizi1.length];

        System.arraycopy(dizi1,0,dizi2,0,2);

        for(int i=0; i< dizi2.length; i++)
            System.out.println(dizi2[i]);
    }
}
