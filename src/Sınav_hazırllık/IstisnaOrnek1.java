package Sınav_hazırllık;

import java.io.*;

public class IstisnaOrnek1 {
    public void cokCalis() throws IOException {
        File f = new File("ornek.txt");
        BufferedReader bf = new BufferedReader( new FileReader(f));
        System.out.println(bf.readLine());
    }
    public void calis() throws IOException {
        cokCalis();
    }

    public void main(String args []) throws IOException {
        IstisnaOrnek1 io1 = new IstisnaOrnek1();
        io1.calis();
    }
}
