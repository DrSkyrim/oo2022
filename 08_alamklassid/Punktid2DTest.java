public class Punktid2DTest{
    public static void main(String[] arg){
        Punktid2D p1= new Punktid2D(3,4);
        Punktid2D p2= new Punktid2D(5,8);
        Punktid2D p3= new Punktid3D(1,3,3);
        if(p1.kaugusNullist()<p2.kaugusNullist()&&p1.kaugusNullist()<p3.kaugusNullist()){
            System.out.println("Punkt yks oli nullile l2hemal");
        }
        else if(p2.kaugusNullist()<p3.kaugusNullist()){
            System.out.println("Punkt kaks oli nullile l2hemal");
        }
        else{
            System.out.println("Punkt kolm oli nullile l2hemal");
        }
    }
}