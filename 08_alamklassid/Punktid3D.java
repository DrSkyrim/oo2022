public class Punktid3D extends Punktid2D{
    double z;
    public Punktid3D(){
    x=alg_x;
    y=alg_y;
  }
  public Punktid3D(double uus_x, double uus_y,double uus_z){
    x=uus_x; //super is useful
    y=uus_y;
    z=uus_z;
  }
    public double kaugusNullist(){
    return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
  }
}