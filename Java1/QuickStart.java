import java.util.Random;
import java.util.Scanner;

public class QuickStart {

    public static void main(String[] args){randomnr(100);}
    public static void randomnr(int max){
        Random random = new Random();
        boolean continuegame = true;
        while(continuegame == true){
            int Zielzahl = random.nextInt(max) + 1;
            System.out.println(Zielzahl);
            System.out.println("Rate eine Zahl");
            try (Scanner scanner = new Scanner(System.in)) {
                int guesses = 0;
                int guess = 0;
                do{
                    guess = scanner.nextInt();
                    System.out.println(String.format("das hier ist der guess: %d", guess));
                    if(Zielzahl > guess){
                        System.out.println("Das war zu niedrig, versuche es noch einmal");
                        guesses = guesses + 1;

                    }
                    else if(Zielzahl < guess){
                        System.out.println("Das war zu groß, versuche es noch einmal");
                        guesses = guesses + 1;
                    }   
                    else{
                        System.out.println(String.format("Das war richtig, super. Du hast so viele Versuche gebraucht %d:", guesses));
                        guesses = guesses + 1;
                        break;
                    }
                }while(Zielzahl != guess);
            
                System.out.println("Möchtest du nochmal spielen?");
                String antwort = scanner.nextLine(); 
                switch(antwort){
                    case "nein":
                    continuegame = false;


                }
            }
        }   
    }
}
