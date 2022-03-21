import java.io.*;

public class SaveLogija{
    public static void salvestaja(String text)throws IOException{
        PrintWriter pw1=new PrintWriter(
            new FileWriter("teated.txt")
        );
        pw1.println(text);
        pw1.close();
    }

}