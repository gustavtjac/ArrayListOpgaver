import java.util.ArrayList;

public class Varer {
    private String navn;
    private int pris;
private static ArrayList<Varer> enkeltVarer = new ArrayList<>();
private static int temp = 1;
    public Varer(String navn, int pris) {
        this.navn = navn;
        this.pris = pris;
        enkeltVarer.add(this);
    }
    public String getNavn() {
        return this.navn;
    }
    public int getPris() {
        return this.pris;
    }

    public static ArrayList<Varer> getEnkeltVarer() {
        return enkeltVarer;
    }

    public static void getVarer() {
    for (Varer hej : enkeltVarer) {
        System.out.println(enkeltVarer.indexOf(hej)+1 +": "+  hej.getNavn() +" "+ hej.getPris() + " Kr.");
    }
    System.out.println(enkeltVarer.size()+1+" for at stoppe");
}


}
