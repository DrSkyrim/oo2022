public class Bottle{
    int volume;
    int massTogether;
    int priceTogether;
    String type;
    int mass;
    int bottlePrice;
    int error;
    Drink d1;

public Bottle(int volume,String type,int mass,int bottlePrice){
    this.volume=volume;
    this.type=type;
    this.mass=mass;
    this.bottlePrice=bottlePrice;
}
public int bottleFill(){
    if(d1.mass!=0){
    massTogether=mass+d1.mass;
    return massTogether;
    }
    else{
        error=404;
        return error;
    }
}
public int fullBottlePrice(){
    if(d1.price!=0){
    priceTogether=bottlePrice+d1.price;
    return priceTogether;
    }
    else{
        error=404;
        return error;
    }
}
public void createDrink(String name,int price,int mass){
    Drink j1=new Drink(name,price,mass);
    d1=j1;
}
}