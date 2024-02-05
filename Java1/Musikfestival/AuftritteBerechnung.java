package Musikfestival;

class AuftritteBerechnung {
    public static int gesamtAuftritte(Künstler[] künstlerArray) {
        int gesamtAuftritte = 0;
        for (Künstler künstler : künstlerArray) {
            gesamtAuftritte += künstler.getAuftritte();
            if (künstler instanceof Band) {
                Band band = (Band) künstler;
                gesamtAuftritte *= band.bandMitglieder;
            }
        }
        return gesamtAuftritte;
    }
}