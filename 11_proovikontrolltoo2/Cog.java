public class Cog{
    int teeth;
    int roundTime=0;
    int swingCounter=0;
    boolean doRun=true;
    Cog innerCog=null;

   
    public Cog(int teeth){
        this.teeth=teeth;
    }

    public void roundTime(){
            swingCounter++;
            if(swingCounter==teeth){
                System.out.println("Tick");
                swingCounter=0;
            }
            if(innerCog!=null){

            innerCog.roundTime();
            }
           // roundTimes();
    }
    //public void roundTimes(){
        //roundTime++;
        //if(roundTime==teeth){
            //System.out.println("Tack");
            //roundTime=0;
        //}
    //}

    void setInner(Cog newCog){
        innerCog=newCog;
    }
}

