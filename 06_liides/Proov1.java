import java.io.*;
public class Proov1{
    public static void main(String[] arg)throws IOException{
        //Logija prooviLogija=new LihtneLogija();
        Logija prooviLogija=new FailiLogija("logid.txt");
        prooviLogija.logi("algus");
        if(arg.length==2){
            System.out.println(Integer.parseInt(arg[0])*Integer.parseInt(arg[1]));
        }
        prooviLogija.logi("ots");
    }
}