package Musikfestival;

import java.util.ArrayList;
import java.util.List;

public class Festival {
    public static void main(String[] args) {
        SoloKünstler soloKünstler = new SoloKünstler("Solo Künstler", "Pop", 10, "Gitarre");
        Band band = new Band("Band", "Rock", 5, 4);
        
        Künstler[] künstlerArray = {soloKünstler, band};
        
        System.out.println("Gesamtanzahl der Auftritte: " + AuftritteBerechnung.gesamtAuftritte(künstlerArray));
        List<Künstler> künstlerListe = new ArrayList<>();
        künstlerListe.add(new SoloKünstler("Herbert", "Pop", 20, "Gitarre"));
        künstlerListe.add(new SoloKünstler("Justus", "Rock", 15, "Schlagzeug"));
        künstlerListe.add(new SoloKünstler("Jacquline", "Pop", 10, "Keyboard"));
        künstlerListe.add(new Band("Die Hosen", "Rock", 30, 4));
        künstlerListe.add(new Band("Güllegräber", "Pop", 25, 5));
        künstlerListe.add(new Band("Hirtensäuer", "Rock", 18, 3));

        List<Künstler> gefilterteUndSortierteKünstler = KünstlerFilterUndSortierung.filterUndSortiereKünstler(künstlerListe, "Rock", 5);

        System.out.println("Gefilterte Bands/Künstler:");
        gefilterteUndSortierteKünstler.forEach(künstler -> System.out.println(künstler.getName() + " - " + künstler.getAuftritte()));
    }
}
