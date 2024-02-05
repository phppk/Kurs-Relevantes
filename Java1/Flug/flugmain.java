package Flug;

import java.util.List;

public class flugmain {
    public static void main(String[] args) {
        Passagier passagier = new Passagier("herbert", 74, "abceddsd", "9173538235");
        Flug flug = new Flug(47, "Bayern", "Deutschland", "heute", "morgen", 8, "3 Groschen");
        Flug flug2 = new Flug(222, "tomatotown","deutschland","hueet","Morgen",9,"7 Schilling");
        // System.out.println(flug.getFlugNummer());
        Buchungsanfrage anfrage = new Buchungsanfrage(flug2, passagier, 9);
        Flugbuchungssystem flugsystem = new Flugbuchungssystem();
        flugsystem.flugHinzufuegen(flug);
        flugsystem.buchungHinzufuegen(anfrage);
        flugsystem.buchungsAnfrage(flugsystem.anfragenListe());
        List<Buchungsanfrage> flugList = flugsystem.anfragenListe();
        System.out.println(flugList.toString());
        flugList.stream()
        .forEach(item -> System.out.println(item));
        //irgendwas mit to string keine ahnung wie man das printed. Nachfragen pls


    }

}
