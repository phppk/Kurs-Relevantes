package Bankkonto;
import java.util.ArrayList;

public class Bank {
    ArrayList<Bankkonto> konten = new ArrayList<Bankkonto>();
    public Bankkonto erzeugeKonto(Kunde kunde, String typ){
        Bankkonto konto = null;
        int kontonummer = konten.size() + 1;

        switch (typ) {
            case "Giro":
                konto = new GiroKonto(kontonummer, kunde);
                konten.add(konto);
                break;
            case "Spar":
                konto = new SparKonto(kontonummer, kunde);
                konten.add(konto);
                break;
            default: new GiroKonto(kontonummer, kunde);
        }
        return konto;
    }
}
