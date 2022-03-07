import java.util.*;
public class Keskmised3_proov{
    public static void main(String[] arg){
        Keskmised3 k=new Keskmised3();
        k.lisa(3);
        k.lisa(4);
        k.lisa(5);
        k.lisa(6);
        k.lisa(7);
        System.out.println(Arrays.toString(k.libisevKeskmine()));

        Keskmised3a k2=new Keskmised3a();
        k2.lisa(11);
        k2.lisa(22);
        k2.lisa(33);
        k2.lisa(44);
        k2.lisa(55);
        System.out.println(k2.libisevKeskmine());
    }
}