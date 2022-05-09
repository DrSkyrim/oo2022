import java.io.*;
import java.util.*;

public class GeenPredic{
    String tekst;
    boolean posneg;
    boolean geen;
    public void readGenes()throws IOException{
        BufferedReader br1=new BufferedReader(new FileReader("geenidDatabase.txt"));
        while ((tekst = br1.readLine()) != null){
            System.out.println(
                Arrays.toString(tekst.split("[ ;]")));
        }
    }

    //public Geen vanematestRando(String vanemaname1,String vanemaname2){




    //}




}