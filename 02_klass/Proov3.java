public class Proov3{
    public static void main(String[] arg){
        K2rbes k1=new K2rbes();

        for(int i=0;i<arg.length;i++){
            if(arg[i].equals("e")){
                k1.edasi();
            }
            if(arg[i].equals("k")){
                k1.keera();
            }
            if(arg[i].equals("y")){
                k1.üles();
            }
            if(arg[i].equals("a")){
                k1.alla();
            }
        }
        System.out.println(k1);
    }
}