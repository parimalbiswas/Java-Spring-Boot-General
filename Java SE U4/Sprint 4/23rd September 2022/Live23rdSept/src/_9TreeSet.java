import java.util.Set;
import java.util.TreeSet;

public class _9TreeSet {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();  //Sorted Set
        treeSet.add("Delhi");
        treeSet.add("rfgt");
        treeSet.add("dg");
        treeSet.add("Delhi"); // Duplicate Not inseted
        treeSet.add("uuu");
        //treeSet.add(null);
        treeSet.add("ll");

        System.out.println(treeSet);




        Plant snakePlant1 = new Plant(12,"Yellow");
        Plant moneyPlant1 = new Plant(15,"Black");

        Plant anotherPlant1 = new Plant(15,"Blue");

        Set<Plant> plantTreeSet = new TreeSet<>();
        plantTreeSet.add(snakePlant1);
        plantTreeSet.add(moneyPlant1);
        plantTreeSet.add(anotherPlant1);

        System.out.println(plantTreeSet);


    }
}
