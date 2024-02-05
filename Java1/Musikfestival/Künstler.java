package Musikfestival;

public abstract class Künstler {
    String name;
    String genre;
    int anzahlDerAuftritte;

    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public int getAuftritte(){
        return anzahlDerAuftritte;
    }
    public void addAuftritt(){}
    public void addAuftritt(String festivalName){
        
    }
    public void addAuftritt(String fesivalName, String bühne){

    }

    public void getInfo(){
        getName();
        getGenre();
        getAuftritte();
    }
}
