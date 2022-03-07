import java.util.*;
public class Keskmised3{
    double[] hoidla=new double[10];
    int olemas=0;
    public void lisa(double arv){
    if(olemas>=hoidla.length){
        System.out.println("Pole ruumi!");
        return;
    }
        hoidla[olemas]=arv;
        olemas++;
    }
    public double[] libisevKeskmine(){
        return Libisev_keskmine.Libisevkeskmine(Arrays.copyOfRange(hoidla,0,olemas));
    }
}