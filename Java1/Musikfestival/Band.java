package Musikfestival;

public class Band extends Künstler {
    int bandMitglieder;

    public Band(String name, String genre, int anzahlDerAuftritte, int bandMitglieder){
        this.name = name;
        this.genre = genre;
        this.anzahlDerAuftritte = anzahlDerAuftritte;
        this.bandMitglieder = bandMitglieder;
    }
    public int getBandMitglieder() {
        return bandMitglieder;
    }
    
    @Override
    public void getInfo() {
        getBandMitglieder();
        super.getInfo();
    }
}
