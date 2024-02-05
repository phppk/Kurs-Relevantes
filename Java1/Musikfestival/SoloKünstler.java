package Musikfestival;

public class SoloKünstler extends Künstler{
    String instrument;
    String festivalName;

    public SoloKünstler(String name, String genre, int anzahlDerAuftritte, String instrument){
        this.name = name;
        this.genre = genre;
        this.anzahlDerAuftritte = anzahlDerAuftritte;
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }
    @Override
    public void getInfo() {
        getInstrument();
        super.getInfo();
    }
    public void addAuftritt(String fesitvalname){
        this.festivalName = festivalName;
    }
}
