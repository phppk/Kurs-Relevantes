public class Figur {
    private char figureShort;
    private int figWert;
    private int anzahl;
    private int currAnzahl;

    public Figur(char name, int wert, int maxAnzahl,int anzahl){
        figureShort = name;
        figWert = wert;
        anzahl = maxAnzahl;
        currAnzahl = anzahl;
    }
    public char getFigur(){
        return figureShort;
    }
    public int figurenWert(){
        return figWert;
    }
    public int maxAnzahl(){
        return anzahl;
    }
    public int anzahl(){
        return currAnzahl;
    }
}
