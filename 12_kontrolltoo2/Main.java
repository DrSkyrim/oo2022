import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] arg)throws IOException{
        Alleel a1=new Alleel("reesus","-");
        Alleel a2=new Alleel("reesus","+");
        Alleel a3=new Alleel("reesus","-");
        Alleel a4=new Alleel("reesus","-");
        Geen g1=new Geen(a1,a2);
        Geen g2=new Geen(a3,a4);
        Geen uusGeen=g1.createNewGene(g1,g2);
        GeenPredic gpr=new GeenPredic();
        //g1.lapseGeen(a1,a4);
        if(g1.error==false){
            System.out.println(g1.createGene());
        }
        else{
            System.out.println("Erinevad alleelid");
        }
        g1.selectRandomAlleel();
        System.out.println(uusGeen.posneg);
        gpr.readGenes();
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
        System.out.print("Sisesta soovitav geen: ");  
        String str= sc.nextLine();              //reads string  
        //System.out.print("You have entered: "+str);
        System.out.print("Sisesta kas positiivne voi negatiivne(+/-): ");  
        String str2= sc.nextLine();              //reads string  
        //System.out.print("You have entered: "+str2);
        System.out.print("Sisesta teine soovitav geen: ");  
        String str3= sc.nextLine();              //reads string  
        //System.out.print("You have entered: "+str);
        System.out.print("Sisesta kas positiivne voi negatiivne(+/-): ");  
        String str4= sc.nextLine();              //reads string  
        //System.out.print("Taname, kohe saate resultaati:");
        Alleel esimeseVanemaAlleel=new Alleel(str.toString(),str2.toString());
        Alleel teiseVanemaAlleel=new Alleel(str3.toString(),str4.toString());
        g1.lapseGeen(esimeseVanemaAlleel,teiseVanemaAlleel);
                                  
    }


}