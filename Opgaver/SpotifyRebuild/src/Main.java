import java.util.Scanner;

public class Main {
    static Scanner INTSCANNER = new Scanner(System.in);
    public static void visMenu(){
        System.out.println("1 - Tilføj ny sang");
        System.out.println("2 - Fjern en sang");
        System.out.println("3 - Vis alle sange");
        System.out.println("4 - Søg efter en sang");
        System.out.println("5 - Rediger en sang");
        System.out.println("6 - Afslut program");

    }
    public static void valgEt(){
        Scanner STRINGSCANNER = new Scanner(System.in);
        System.out.println("Indtast først Sangens navn");
        String tempTitel = STRINGSCANNER.nextLine();
        System.out.println("Og derefter kunstneren");
        String tempNavn = STRINGSCANNER.nextLine();
        new Sang(tempTitel, tempNavn);
        System.out.println("Din sang er nu tilføjet");
        Sang.designStreg();
    }
    public static void valgTo(){
        int temp;
        if (Sang.getSangListe().size() == 0){
            System.out.println("Du har ikke nogle sange :)");
            Sang.designStreg();
        }else {

            Sang.visSange();
            System.out.println("Skriv tallet på den sang du gerne vil fjerne");
            Scanner sc1 = new Scanner(System.in);
            temp = sc1.nextInt();
            if (temp <= Sang.getSangListe().size()) {
                Sang.getSangListe().remove(temp - 1);
                System.out.println("din sang er nu fjernet");
                Sang.designStreg();
            } else {
                System.out.println("forkert input..");
                Sang.designStreg();
            }
        }

    }
    public static void valgTre(){
        if (Sang.getSangListe().size() == 0){
            System.out.println("Du har ikke nogle sange :)");
        }
        Sang.visSange();
        Sang.designStreg();

    }
    public static void valgFire(){
        Scanner STRINGSCANNER = new Scanner(System.in);
        System.out.println("Skriv din søgning");
        String tempRotte = STRINGSCANNER.nextLine();
        Sang.søgeResultat(tempRotte);
        Sang.designStreg();
    }
    public static void valgFem(){
        int temp;
        Scanner STRINGSCANNER = new Scanner(System.in);
        if (Sang.getSangListe().size() == 0){
            System.out.println("Du har ikke nogle sange :)");
            Sang.designStreg();
        }else {
            Sang.visSange();
            System.out.println("Tast tallet til den sang du vil redigere");
            Scanner sc1 = new Scanner(System.in);
            temp = sc1.nextInt();
            System.out.println("skriv det nye navn til din sang");
            String tempTitel = STRINGSCANNER.nextLine();
            System.out.println("Skriv den nye kunstner til din sang");
            String tempNavn = STRINGSCANNER.nextLine();
            Sang.getSangListe().get(temp-1).setSongName(tempTitel);
            Sang.getSangListe().get(temp-1).setArtistName(tempNavn);
            System.out.println("Din sang er nu opdateret! :)");
            Sang.designStreg();
        }

    }

    public static void main(String[] args) {
Scanner STRINGSCANNER = new Scanner(System.in);
        boolean iGang =true;
        System.out.println("Velkommen til Hjemmelavet Spotify");
        Sang.designStreg();
        while(iGang){
            visMenu();
            int temp = INTSCANNER.nextInt();
            if (temp == 1){
                valgEt();
            }else if (temp == 2){
               valgTo();
            }else if (temp == 3){
              valgTre();
            }else if (temp == 4){
valgFire();
            }else if (temp == 5){
              valgFem();
            }else if (temp == 6){
                System.out.println("Tak for i dag :)");
                iGang = false;
            }



        }



    }
}
