package Musikfestival;
import java.util.List;
import java.util.stream.Collectors;

public class KünstlerFilterUndSortierung {
    
    public static List<Künstler> filterUndSortiereKünstler(List<Künstler> künstlerListe, String genre, int minAuftritte) {
        return künstlerListe.stream()
                .filter(künstler -> künstler.getGenre().equals(genre) && künstler.getAuftritte() >= minAuftritte)
                .sorted((k1, k2) -> Integer.compare(k2.getAuftritte(), k1.getAuftritte())) 
                .collect(Collectors.toList());
    }
}
