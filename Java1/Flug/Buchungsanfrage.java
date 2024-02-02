package Flug;

public class Buchungsanfrage {
    Flug flug;
    Passagier passagier;
    int gewünschteSitze;
    public Buchungsanfrage(Flug flug, Passagier passagier, int gewünschteSitze){
        this.flug = flug;
        this.passagier = passagier;
        this.gewünschteSitze = gewünschteSitze;
    }
}
