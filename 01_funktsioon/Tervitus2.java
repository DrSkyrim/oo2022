public class Tervitus2 {
	public static void main(String[] arg){
		if(arg.length>0){
			int i = 0;
			while(i<arg.length){
		System.out.println("Tere, "+arg[i]+"!");
		i++;
		}
		}
		else{
			System.out.println("Tere! Mul pole kahte voi rohkem nime käes");
		}
	}
}