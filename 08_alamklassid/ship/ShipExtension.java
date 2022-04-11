public class ShipExtension extends Ship{
public ShipExtension(String new_name, int new_length,int new_height,int new_width,String new_module){
    super(new_name,new_length,new_height,new_width,new_module);
}
    String type;
    int price;
    double volume;
    int costl=400;
    int costh=300;
    int costw=400;
    public double calculateVolume(){
        volume=1.0*length*width*height;
        return volume;
    }
    public int calculateCost(){
        price=height*costh+width*costw+length*costl;
        return price;
    }

    public String detectType(){
        if(module.equals("battle")){
            type="Battleship";
        }
        if(module.equals("commercial")){
            type="Tradeship";
        }
        if(module.equals("transport")){
            type="Cargoship";
        }
        return type;
    }
}