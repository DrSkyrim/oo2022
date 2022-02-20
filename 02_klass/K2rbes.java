public class K2rbes{
    private int x, y, suund,korgus;
    @Override
    //suund: 0 x++; 1 y++; 2 x--;3 y--
    public String toString(){
     return "("+x+","+y+", suund " +suund+" korgus "+korgus+")";
    }
    public int kysiX(){return x;}
    public int kysiY(){return y;}
    public void edasi(){
        if(suund==0){x++;}
        if(suund==1){y++;}
        if(suund==2){x--;}
        if(suund==3){y--;}
    }
    public int keera(){
        if(suund<=3){suund++;}

        else{suund=0;}

        return suund;
    }
    public void üles(){
        if(korgus<3){korgus++;}
        else{korgus=0;}
    }
        public void alla(){
        korgus--;
    }
}