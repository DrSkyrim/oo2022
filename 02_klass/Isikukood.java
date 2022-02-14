public class Isikukood{
    private String kood;
    public Isikukood(String uusKood){kood=uusKood;}
    public String sugu(){
     return (Integer.parseInt(kood.substring (0, 1)) %2 == 0 ?"naine":"mees");
    }
    public String aastakakstahte(){
        if(kood.substring(0,1).equals("1")){return "18";}
        if(kood.substring(0,1).equals("2")){return "18";}
        if(kood.substring(0,1).equals("3")){return "19";}
        if(kood.substring(0,1).equals("4")){return "19";}
        if(kood.substring(0,1).equals("5")){return "20";}
        else{return "20";}
    }
    public String synniaasta(){
        return kood.substring(1,3);
    }
}