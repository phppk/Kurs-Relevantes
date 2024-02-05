package Flashcards;

import java.util.HashMap;

public class Flashcards{
    public static void main(String[] args) {
        Questions nrOne = new Questions("Was ist 3 mal 3?");
        Answers ansrOne = new Answers("Drei mal Drei ist 9!");
        String questio = nrOne.returnQuestion();
        String answr = ansrOne.returnAnswer();
        Cards cards = new Cards();
        cards.addQnA(questio, answr);
        HashMap<String, String> cardsMap = cards.returnQnA();

        cardsMap.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    
    }
}