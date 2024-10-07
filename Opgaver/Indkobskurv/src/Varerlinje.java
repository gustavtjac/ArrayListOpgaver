import java.util.ArrayList;

public class Varerlinje {
    private static int temp = 0;
    private static ArrayList<Varer> varertotal = new ArrayList<>();

    public Varerlinje(ArrayList<Varer> varertotal) {
        this.varertotal = varertotal;
    }

    public static void varerKost(ArrayList<Varer> varertotal) {
      for (Varer varer : varertotal) {
          temp += varer.getPris();
          System.out.println(varer.getNavn() + " " + varer.getPris()+" Kr.");
      }
        System.out.println("Den Totale pris for dine varer er: " + temp + " Kr.");
    }
}
