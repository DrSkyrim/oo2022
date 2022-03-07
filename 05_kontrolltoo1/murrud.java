public class murrud{
    
    public static int uusLugeja(int lugeja1,int nimetaja1,int lugeja2,int nimetaja2){
        int uusLugeja=lugeja1*nimetaja2+lugeja2*nimetaja1;
        
        return uusLugeja;
    }
    public static int uusNimetaja(int nimetaja1,int nimetaja2){
        int uusNimetaja=nimetaja1*nimetaja2;
        return uusNimetaja;
    }
    public static int taandaja(int uusLugeja,int uusNimetaja){
        while (uusLugeja != 0 && uusNimetaja != 0) {
            if (uusLugeja > uusNimetaja) uusLugeja %= uusNimetaja;
            else uusNimetaja %= uusLugeja;
        }
        int taandaja=uusNimetaja+uusLugeja;
        return taandaja;
    }
public static void main(String[] arg){
    int lugeja1=7;
    int nimetaja1=4;
    int lugeja2=5;
    int nimetaja2=17;
    //System.out.println(7%4);
    if(lugeja1>nimetaja1){
        //Murd segaarvuks
        System.out.println(lugeja1/nimetaja1+" "+lugeja1%nimetaja1+"/"+nimetaja1);
    }
    else{
        System.out.println(lugeja1+"/"+nimetaja1);
    }
    //valmistume liitmiseks
    int uusLugeja=uusLugeja(lugeja1,nimetaja1,lugeja2,nimetaja2);
    int uusNimetaja=uusNimetaja(nimetaja1,nimetaja2);
    //kontrollid et koik tootas oigesti
    //System.out.println(uusLugeja);
    //System.out.println(uusNimetaja);
    if(uusLugeja>uusNimetaja){  
    //liidetud murd  
    System.out.println(uusLugeja/uusNimetaja+" "+uusLugeja%uusNimetaja+"/"+uusNimetaja);
    }
    else{
        System.out.println(uusLugeja+"/"+uusNimetaja);
    }
    //leiame taandamiseks taandaja
    int taandaja=taandaja(uusLugeja,uusNimetaja);
    //System.out.println(taandaja);
    //taandatud murd murruna
    System.out.println(uusLugeja/taandaja+"/"+uusNimetaja/taandaja);
}
}