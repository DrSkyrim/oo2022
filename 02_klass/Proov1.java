public class Proov1{
    public static void main(String[] arg){
        Isikukood jaagup=new Isikukood("37605030299");
        Isikukood paula=new Isikukood("61009171032");
        Isikukood martin=new Isikukood("50112180846");
        System.out.println(jaagup.sugu());
        System.out.println(paula.sugu());
        System.out.println(jaagup.aastakakstahte()+jaagup.synniaasta());
        System.out.println(martin.aastakakstahte()+martin.synniaasta());
    }
}