import java.io.*;
public class Mangija_write{
    public void Mangija_write(arg){
        PrintWriter pw1=new PrintWriter(
            new FileWriter("mangijad.txt"));
        pw1.println(arg);
        pw1.close();
    }
}