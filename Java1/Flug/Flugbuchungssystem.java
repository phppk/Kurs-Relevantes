package Flug;

import java.util.ArrayList;
import java.util.List;

public class Flugbuchungssystem {
    List<Flug> verfügbareFlüge = new ArrayList<>();
    List<Buchungsanfrage> buchungsAnfragen = new ArrayList<>();
    public void flugHinzufuegen(Flug flug){
        // Check ob Flug schon in der Liste ist
        verfügbareFlüge.add(flug);
    
    }
    public void buchungHinzufuegen(Buchungsanfrage buchung){
        buchungsAnfragen.add(buchung);
    }
    public List<Buchungsanfrage> anfragenListe(){
        return buchungsAnfragen;
    }
    public void buchungsAnfrage(List<Buchungsanfrage>buchungsAnfragen){
        BuchungNichtMoeglichException buchungNichtMoeglichException = new BuchungNichtMoeglichException();
        for(int i = 0; i<buchungsAnfragen.size(); i++){
            if(verfügbareFlüge.contains(buchungsAnfragen.get(i).flug)){
                if(buchungsAnfragen.get(i).gewünschteSitze > buchungsAnfragen.get(i).flug.verfügbarkeitSitze){
                    buchungNichtMoeglichException.notEnoughSeats();
                }else{
                    System.out.println("sexy");
                }
            }else{
                buchungNichtMoeglichException.flightUnavailable();
            }
        }
    }
}
