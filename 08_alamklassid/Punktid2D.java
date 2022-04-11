class Punktid2D{
  double x, y;
  double alg_x=0;
  double alg_y=0;
  public Punktid2D(){
    x=alg_x;
    y=alg_y;
  }
  public Punktid2D(double uus_x, double uus_y){
    x=uus_x;
    y=uus_y;
  }
  public String kirjutaAndmed(){
    return "x="+x+" y="+y;
  }
  public double kaugusNullist(){
    return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
  }
}
