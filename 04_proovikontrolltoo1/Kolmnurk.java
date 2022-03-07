public class Kolmnurk{
    double[] xd=new double[3];
    double[] yd=new double[3];

    public Kolmnurk(double x1,double y1,double x2,double y2,double x3,double y3){
        xd[0]=x1;xd[1]=x2;xd[2]=x3;
        yd[0]=y1;yd[1]=y2;yd[2]=y3;
    }
    public void tryki(){
        for(int i=0;i<xd.length;i++){
            System.out.println(xd[i]+" "+yd[i]);
        }
    }
    public double ymbermoot(double x1,double y1,double x2,double y2,double x3,double y3){
        double vektor1x=x2-x1;
        double vektor2x=x3-x1;
        double vektor3x=x3-x2;
        double vektor1y=y2-y1;
        double vektor2y=y2-y1;
        double vektor3y=y2-y1;
        double vektor1=Math.sqrt(vektor1x*vektor1x+vektor1y*vektor1y);
        double vektor2=Math.sqrt(vektor2x*vektor2x+vektor2y*vektor2y);
        double vektor3=Math.sqrt(vektor3x*vektor3x+vektor3y*vektor3y);
        double ymbermoot=vektor1+vektor2+vektor3;
        return ymbermoot;
    }
}
