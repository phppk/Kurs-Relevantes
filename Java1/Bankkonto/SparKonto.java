package Bankkonto;

public class SparKonto extends Bankkonto {

    public SparKonto(int kontoNummer, Kunde kunde) {
		super(kontoNummer, kunde);
	}

    public double aktualisiereKontostand() {
		this.einzahlen(this.getKontoStand()*0.03);
		return this.getKontoStand();
    }
}
