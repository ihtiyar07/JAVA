package Interface_ZeynepHoca;

public class Hesapalama1 {
    public void Kac(){
        System.out.println("interface kac");
    }
    void Run(){
        System.out.println("interface run");
    }
    public class Toplama{
        public int toplamaYap(int a, int b){
            return a+b;
        }
    }
    protected class Cikartma{
        public int cikartmaYap(int a, int b){
            return a-b;
        }
    }
    class Carpma{
        public int carpmaYap(int a,int b){
            return a*b;
        }
    }
    public class Bolma{
        public int bolmeYap(int a,int b){
            return a/b;
        }
    }
    public static void main(String[] args){
        Hesapalama1.Toplama ht = new Hesapalama1().new Toplama();
        Hesapalama1.Cikartma hc = new Hesapalama1().new Cikartma();
        Hesapalama1 a = new Hesapalama1();


        int sonuc1 = ht.toplamaYap(10,5);
        int sonuc2 = hc.cikartmaYap(9,3);

        System.out.println(sonuc1);
        System.out.println(sonuc2);
        a.Run();
        a.Kac();
    }

}