public class BigBottle{
int volumeBig;
int drinkInside;
Drink d1;
Bottle b1;

int bottles=0;

public BigBottle(int volumeBig){
    this.volumeBig=volumeBig;
    
}

public void createBottle(int volume,String type,int mass,int bottlePrice){
    b1=new Bottle(volume,type,mass,bottlePrice);
}
public void createDrink(String name,int price,int mass){
    Drink j1=new Drink(name,price,mass);
    d1=j1;
}
public int assignDrink(){
    drinkInside=d1.mass;
    return drinkInside;
}
public void fillBottle(){
    if(drinkInside!=0&&drinkInside/b1.volume>=1){
        b1.bottleFill();
        b1.createDrink(d1.name,d1.price,d1.mass);
    }
}
public int fillBottles(){
    while(drinkInside!=0&&drinkInside/b1.volume>=1){
        drinkInside=drinkInside-b1.volume;
        bottles++;
    }
    return bottles;
}
}