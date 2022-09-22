import java.util.*;
import java.util.Map;

public class _5MapDemo {
    public static void main(String[] args) {
        Map<String,Double> countryToPopulation = new LinkedHashMap<>();
        countryToPopulation.put("India",1.3);
        countryToPopulation.put("China",1.4);
        countryToPopulation.put("TH",0.7);
        System.out.println(countryToPopulation);



    }
}
