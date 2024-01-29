public class chess {

    public static void main(String args[]){
        int anzahlFiguren = (int) (Math.random() * 16);
        Figur[] figurenListe = {
        new Figur('B', 1, 8, 0),
        new Figur('S', 3, 2, 0), 
        new Figur('L', 3, 2, 0), 
        new Figur('T', 5, 2, 0), 
        new Figur('D', 9, 1, 0), 
        new Figur('K', 0, 1, 0)
    };
        Figur[][] schachbrett = new Figur[8][8];
        for(int i = 0; i < anzahlFiguren; i++){
            char currFigur = figurenListe[(int) (Math.random() * 5)].getFigur();


        }
    }
}

