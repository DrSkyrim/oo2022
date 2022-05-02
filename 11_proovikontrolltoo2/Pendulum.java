import java.util.*;

public class Pendulum{
    double length;
    boolean doSwing=true;
    Cog c1=new Cog(20);
    Cog c2=new Cog(60);
    
    public double calculatSwing(double length){
        double swingTime=2*Math.PI*Math.sqrt(length/9.8);

        return swingTime;
    }

    public void swingPendulum(double swingTime)throws InterruptedException{
        int waitTime=(int)(swingTime*1000);
        c1.setInner(c2);
        while(doSwing){
            Thread.sleep(waitTime);
            System.out.println("Click-Clack");
            c1.roundTime();
            }
    }
}