package Flug;
public class Flug{
    static int flugnummer;
    String abflugOrt;
    String zielOrt;
    String abflugDatum;
    String ankunftsDatum;
    int verfügbarkeitSitze;
    String preis;

    public Flug(int flugnummer,
                String abflugOrt, 
                String zielOrt, 
                String abflugDatum, 
                String ankunftsDatum, 
                int verfügbarkeitSitze, 
                String preis){
        this.flugnummer = flugnummer;
        this.abflugOrt = abflugOrt;
        this.zielOrt = zielOrt;
        this.abflugDatum = abflugDatum;
        this.ankunftsDatum = ankunftsDatum;
        this.verfügbarkeitSitze = verfügbarkeitSitze;
        this.preis = preis;
    }
    public int getFlugNummer(){
        return flugnummer;
    }

}