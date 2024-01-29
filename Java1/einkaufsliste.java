import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class einkaufsliste {
    public static void main(String args[]){
        ArrayList<String> einkaufsliste = new ArrayList<>();
        HashMap<String, Integer> preiseKatalog = new HashMap<String, Integer>();
        preiseKatalog.put("Apfel", 2);
        preiseKatalog.put("Doener", 5);
        Scanner scanner = new Scanner(System.in);
        boolean einkaufen = true;
        while(einkaufen){
            System.out.println("Was möchtest du einkaufen? (Exit zum verlassen)");
            String input = scanner.nextLine();
            if("exit".equalsIgnoreCase(input)){
                einkaufen = false;
                break;
            }
            else{
                if (preiseKatalog.containsKey(input)) {
                    einkaufsliste.add(input);
                    System.out.println(input + " wurde zur Einkaufsliste hinzugefügt.");
                } else {
                    System.out.println(input + " ist nicht im Preiskatalog vorhanden.");
                }
            }

        }
        calculatePrice(einkaufsliste, preiseKatalog);

        scanner.close();
    }

    private static void calculatePrice(ArrayList<String> einkaufsliste, HashMap<String, Integer> preiseKatalog) {
        int totalPrice = 0;

        System.out.println("\nEinkaufsliste:");
        for (String item : einkaufsliste) {
            int itemPrice = preiseKatalog.get(item);
            System.out.println(item + " - Preis: " + itemPrice);
            totalPrice += itemPrice;
        }

        System.out.println("Gesamtpreis: " + totalPrice);
    }
}