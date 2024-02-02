package Flug;

public class BuchungNichtMoeglichException extends Exception{
    public void flightUnavailable(){
        System.out.println("Dieser Flug ist nicht verfügbar.");
    }
    public void notEnoughSeats(){
        System.out.println("Leider gibt es nicht mehr genügend Sitze in diesem Flug");
    }
}
