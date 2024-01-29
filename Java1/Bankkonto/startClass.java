package Bankkonto;

public class startClass {
    public static void main(String args[]){
        Kunde neuerKunde = new Privatkunde(1, "Herbert", "01.01.1999");
        Bank bank = new Bank();
        Bankkonto konto = bank.erzeugeKonto(neuerKunde, "Spar");
		// SparKonto sparkonto = new SparKonto(1, neuerKunde);
        // GiroKonto girokonto = new GiroKonto(2, neuerKunde);

		konto.einzahlen(1500);
        System.out.println("Dein Kontostand ist: " + konto.getKontoStand());
        System.out.println("Deine Kontoummer ist: " + konto.getKontoNummer());
        System.out.println("Dein Kontostand + Zinsen beträgt: "+ konto.aktualisiereKontostand());
		// sparkonto.einzahlen(1500);
		// sparkonto.abheben(500);
    	// double kontoStand = sparkonto.getKontoStand();
		// double zinsen = sparkonto.aktualisiereKontostand()-kontoStand;
		
		// System.out.println("Sparkonto:");
		// System.out.println("Dein Kontostand ist: "+kontoStand);
		// System.out.println("Die Zinsen betragen: "+zinsen);
		
		// girokonto.einzahlen(254.32);
		// girokonto.abheben(89.24);
		// kontoStand=girokonto.getKontoStand();
		// zinsen=girokonto.aktualisiereKontostand()-kontoStand;
		
		// System.out.println("Girokonto:");
		// System.out.println("Dein Kontostand ist: " + kontoStand);
		// System.out.println("Die Zinsen betragen: " + zinsen);
    }
}
