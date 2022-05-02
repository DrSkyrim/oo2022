import java.util.*;
public class PendulumTest{
    
    public static void main(String[] arg)throws InterruptedException{
        double length=2.5;
        int teeth=5;
        Pendulum p1=new Pendulum();
        //Cog c1=new Cog();
        double swingTime=p1.calculatSwing(length);

        p1.swingPendulum(swingTime);
        //int rounds=c1.roundTime(swing);

        System.out.println(swingTime);
    }
}