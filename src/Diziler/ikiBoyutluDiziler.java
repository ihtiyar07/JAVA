package Diziler;

public class ikiBoyutluDiziler {
    public static void main(String[] args) {
        int[][] tablo = new int[5][4];

        for(int satir=0; satir < tablo.length; satir++){
            for(int sutun=0; sutun < tablo[satir].length; sutun++){
                tablo[satir][sutun] = (int)(Math.random()*100);
            }
        }
     for(int satir=0; satir< tablo.length; satir++) {
         for (int sutun = 0; sutun < tablo[satir].length; sutun++)
             System.out.print(tablo[satir][sutun] + "\t");
         System.out.println();
     }
    }
}
