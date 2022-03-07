public class Libisev_keskmine{
        public static double[] reaalarvudeks(String[] sd){
		double[] g=new double[sd.length];
		for(int i=0; i<sd.length; i++){
			g[i]=Double.parseDouble(sd[i]);
			}
		return g;
		}
    public static double keskmine(double a,double b,double c){
        double kesk=(a+b+c)/3;
        return kesk;
    }
    public static double[] Libisevkeskmine(double[] arvud){
        double[] keskmised=new double[arvud.length-2];
        for(int i=0;i<arvud.length;i++){
            if(i>=arvud.length||i+1>=arvud.length||i+2>=arvud.length){
                break;
            }
            else{     
            keskmised[i]=keskmine(arvud[i],arvud[i+1],arvud[i+2]);
        }
        }
        return keskmised;
    }

}