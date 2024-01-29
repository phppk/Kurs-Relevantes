package Bankkonto;

abstract class Kunde {
    private int kundennummer;
    private String name;

    public Kunde(int kundennummer, String name){
        this.kundennummer = kundennummer;
        this.name = name;
    }


    public int getKundenNummer(){
        return kundennummer;
    }
    
}
