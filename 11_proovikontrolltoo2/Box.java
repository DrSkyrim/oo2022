public class Box{
String type;
int price;
int mass;
int slots;
Drink d1;
Bottle b1;
BigBottle b2;
int priceWithBottles;
int massWithBottle;
int slotsEmpty,numOfBottles;

public Box(String type,int price,int mass,int slots){
this.type=type;
this.price=price;
this.mass=mass;
this.slots=slots;
}
public void createBottle(int volume,String type,int mass,int bottlePrice){
    this.b1=new Bottle(volume,type,mass,bottlePrice);
}
public void createDrink(String name,int price,int mass){
    Drink j1=new Drink(name,mass,price);
    this.d1=j1;
}
public void createBigBottle(int volumeBig){
    this.b2=new BigBottle(volumeBig);   
}
public int calculateMass(){
    b1.createDrink(d1.name,d1.mass,d1.price);
    int bottlesMass=b1.bottleFill()*slots;
    massWithBottle=mass+bottlesMass;
    return massWithBottle;
}
public int calculatePrice(){
    b1.createDrink(d1.name,d1.mass,d1.price);
    int priceBottles=b1.fullBottlePrice()*slots;
    priceWithBottles=priceBottles+price;
    return priceWithBottles;
}
public int fillBoxFromBigB(){
    b2.createDrink(d1.name,d1.mass,d1.price);
    b2.assignDrink();
    System.out.println(b2.drinkInside);
    b2.createBottle(b1.volume,b1.type,b1.mass,b1.bottlePrice);
    numOfBottles=b2.fillBottles();
    System.out.println(numOfBottles);
    slotsEmpty=slots-numOfBottles;
    return slotsEmpty;
}
}