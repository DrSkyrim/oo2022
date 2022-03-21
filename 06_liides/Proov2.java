import java.io.*;
public class Proov2{
    public static void main(String[] arg)throws IOException{
        Logija esimene=new LihtneLogija();
        Logija teine=new FailiLogija("logid.txt");
        HargnevLogija yhendaja=new HargnevLogija();
        Logija kolmas=new FailiLogija("Logs/logid2.txt");
        yhendaja.lisaLogija(esimene);
        yhendaja.lisaLogija(teine);
        yhendaja.lisaLogija(kolmas);
        Logija prooviLogija=yhendaja;
        prooviLogija.logi("algus");
        if(arg.length==2){
            System.out.println(Integer.parseInt(arg[0])*Integer.parseInt(arg[1]));
        }
        prooviLogija.logi("ots");
    }
}