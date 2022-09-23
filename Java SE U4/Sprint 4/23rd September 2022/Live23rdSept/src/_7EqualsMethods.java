

public class _7EqualsMethods {
    public static void main(String[] args) {
        Plant snakePlant = new Plant(12,"Yellow");
        Plant moneyPlant = new Plant(15,"Black");

        System.out.println(snakePlant.equals(moneyPlant));

        Plant moneyPlant2 = new Plant(15,"Black");

        // By default, false. But We cast it to true in Plant Methods
        System.out.println(moneyPlant.equals(moneyPlant2));




    }
}
