import java.io.*;
public class Proov3{
    public static void main(String[] arg)throws IOException{
        Logija failiLogija = new FailiLogija("logid.txt");
        //Logija prooviLogija=new LihtneLogija();
        LoendavLogija loendavLogija1=new LoendavLogija(failiLogija);
        Logija prooviLogija=loendavLogija1;
        prooviLogija.logi("algus");
        if(arg.length==2){
            System.out.println(Integer.parseInt(arg[0])*Integer.parseInt(arg[1]));
        }
        prooviLogija.logi("ots");
        System.out.println(loendavLogija1.logimisteArv());
    }
}