public class Libisevkeskmine{
    public static void main(String[] arg){

    double[] arvud=Libisev_keskmine.reaalarvudeks(arg);
    double a=arvud[0];
    double b=arvud[1];
    double c=arvud[2];
    double kesk=Libisev_keskmine.keskmine(a,b,c);
    double keskmised[]=Libisev_keskmine.Libisevkeskmine(arvud);

    System.out.println(kesk);
    for(int i=0;i<keskmised.length;i++){
    System.out.println(keskmised[i]);
    }
    }
}