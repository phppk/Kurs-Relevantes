package Bankkonto;
public abstract class Bankkonto {
    private int kontonr;
    private double kontoStand;
    private Kunde kunde;

    public Bankkonto(int kontonr, Kunde kunde){
        this.kontonr = kontonr;
        kontoStand = 0.0;
        this.kunde = kunde;
    }
    public void einzahlen(double einzahlung) {
        kontoStand = kontoStand + einzahlung;
    }

    public double abheben(double auszBetrag){
        if(kontoStand >= auszBetrag){
            kontoStand = kontoStand - auszBetrag;
            return kontoStand;

        } else {
            return -1.0;
        }
    }
    public int getKontoNummer(){
        return kontonr;
    }
    public double getKontoStand(){
        return kontoStand;
    }

    public abstract double aktualisiereKontostand();
}
