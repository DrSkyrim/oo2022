public class Proov3{
    public static void main(String[] arg){
        PaarideLoendur1<Character> p1=new PaarideLoendur1<>();
        String lause="kaval ants ja vanapagana saapad vanpagana laekas";
        for(int i=0;i<lause.length();i++){
            p1.lisa(lause.charAt(i));
        }
        System.out.println(p1.loendur);
    }
}