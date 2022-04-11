public class ShipWork{


public static void main(String[] arg){
    int length=Integer.parseInt(arg[1]);
    int height=Integer.parseInt(arg[2]);
    int width=Integer.parseInt(arg[3]);
    ShipExtension ship1=new ShipExtension(arg[0],length,height,width,arg[4]);

    System.out.println("Ship name: "+arg[0]+" "+"Ships cost: "+ship1.calculateCost()+" "+"Ship volume: "+ship1.calculateVolume()+" Ship type: "+ship1.detectType());
}
}