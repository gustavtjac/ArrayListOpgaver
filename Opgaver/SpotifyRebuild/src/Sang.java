import java.util.ArrayList;

public class Sang {
    private static ArrayList<Sang> sangListe = new ArrayList<>();
    private String songName;
    private String artistName;
    private static int counter = 0;
    public Sang(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
        sangListe.add(this);
    }
public static int getCounter(){
        return counter;
}
public void setSongName(String songName) {
        this.songName = songName;
}
public void setArtistName(String artistName) {
        this.artistName = artistName;
}

    public String getSongName() {
        return this.songName;
    }
    public String getArtistName() {
        return this.artistName;
    }
    public String toString() {
        return this.songName + " Lavet af: " + this.artistName;
    }
    public static ArrayList<Sang> getSangListe() {
        return sangListe;
    }

    public static void visSange(){
        for (Sang sang : sangListe) {
            System.out.println(sangListe.indexOf(sang) + 1 + ": "+ sang.toString());
        }
    }
public static void designStreg(){
    System.out.println("--------------------------------------------------------");
}

public static void søgeResultat(String søgning){
    System.out.println("Resultater:");
    int lokalcount = 0;
        for (Sang sang : sangListe) {
            if (sang.getSongName().equalsIgnoreCase(søgning)|| sang.getArtistName().equalsIgnoreCase(søgning)){
                lokalcount++;
                System.out.println(lokalcount + ": " + sang.toString());
            }
        }
}
}
