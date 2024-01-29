package Bankkonto;

public class Unternehmenskunde extends Kunde{
    private String firmenname;
    private String steuernummer;
    public Unternehmenskunde(int kundennummer, String name, String firmenname, String steuernummer){
        super(kundennummer, name);
        this.firmenname = firmenname;
        this.steuernummer = steuernummer;
    }
}
