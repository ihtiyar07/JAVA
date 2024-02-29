package Diziler;
import java.util.*;
public class DiziSiralama {
    public static void main(String[] args) {
        int[] dizi = {23,25,3,12,99,45};
        Arrays.sort(dizi);
        for(int i:dizi)
            System.out.println(i);
    }
}
