package Flashcards;
import java.util.HashMap;
public class Cards {
    HashMap<String, String> questionsAndAnswers = new HashMap<>();
    public void addQnA(String question, String answer){
        questionsAndAnswers.put(question,answer);
    }
    public HashMap<String, String> returnQnA(){
        return questionsAndAnswers;
    }
        

    
    
}
