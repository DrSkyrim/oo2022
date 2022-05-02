public class Proov1{
public static void main(String[] arg){
    //Drink j1=new Drink("Fanta",110,500);//createDrink("Fanta",110,500);
    Bottle b1=new Bottle(500,"Klaaspudel",100,10);//createBottle(500,"Klaaspudel",100,10);
    b1.createDrink("Fanta",110,500);
    //System.out.println(j1.name);
    System.out.println(b1.type);
    System.out.println(b1.bottleFill());
    System.out.println(b1.fullBottlePrice());
}
}