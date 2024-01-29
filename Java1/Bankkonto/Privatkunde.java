package Bankkonto;

public class Privatkunde extends Kunde{
    private String geburtsDatum;
    public Privatkunde(int kundennummer, String name, String geburtsDatum){
        super (kundennummer,name);
        this.geburtsDatum = geburtsDatum;
        

    }
}
