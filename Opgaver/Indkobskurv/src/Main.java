import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean iGang = true;
Varer mælk = new Varer("Mælk",10);
Varer ost = new Varer("Ost",55);
Varer analKugle = new Varer("Gaming mus",140);
Varer bnlåbær = new Varer("Blåbær",25);

 ArrayList<Varer> indkøbsKurv = new ArrayList();

        System.out.println("Velkommen til shopping centeret!!!");
        System.out.println("Klik det korresponderende tal ind for at tilføje en varer");
     while(iGang){
         Varer.getVarer();
         Scanner sc = new Scanner(System.in);
         int temp = sc.nextInt();
         if(temp == Varer.getEnkeltVarer().size()+1){
             Varerlinje.varerKost(indkøbsKurv);
             iGang = false;
         } else if (temp > Varer.getEnkeltVarer().size()+1) {
             System.out.println("forkert input prøv igen");
         }else {
             System.out.println("Du har tilføet " + Varer.getEnkeltVarer().get(temp-1).getNavn());
             indkøbsKurv.add(Varer.getEnkeltVarer().get(temp-1));
         }


     }





    }
}
