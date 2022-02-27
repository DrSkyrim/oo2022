public class Mangija_create{
    public static void main(String[] arg){
        //Mangija m1=new Mangija("Tamm", 7, 12, 30, 3.5);
        Mangija_write mk=new Mangija_write(arg);
        Meeskond Me1=new Meeskond("LULERS");
        Mangija m1=new Mangija("Tamm", 7, 12, 30, 3.5);
        Mangija m2=new Mangija("Kapp", 9, 16, 50, 2.5);
        Me1.lisaMangija(m1);
        Me1.lisaMangija(m2);
        System.out.println(m1.kaugus(10, 12));
        System.out.println(m1);
        m1.liigu(1);
        System.out.println(m1);
        System.out.println(Me1);
        Me1.liigu(2);
        System.out.println(Me1);
        System.out.println(Me1.lahim(20,20));
    }
}