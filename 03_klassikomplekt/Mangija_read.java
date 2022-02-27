import java.io.*;
public class Lugemine{
    public static void main(String[] arg) throws IOException{
      BufferedReader br1=new BufferedReader(
          new FileReader("mangijad.txt"));
        String rida1=br1.readLine();
        String[] m=rida1.split(" ");
        String parekonnanimi=m[0];
        int x=m[1];
        int y=m[2];
        double nurk=m[3];
        double kiirus=m[4];
        System.out.println(eesnimi+" pikkus meetrites "+meetrid);
    }