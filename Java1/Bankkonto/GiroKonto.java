package Bankkonto;

public class GiroKonto extends Bankkonto{

    public GiroKonto(int kontoNummer, Kunde kunde) {
		super(kontoNummer, kunde);
	}

    public double aktualisiereKontostand(){
        return this.getKontoStand();
    }
    
}
