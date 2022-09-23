import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Plant implements Comparable<Plant>{
    int height;
    String color;


    public Plant(int height, String color) {
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return height == plant.height && Objects.equals(color, plant.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, color);
    }

    @Override
    public int compareTo(Plant that) {
        if (that.height == that.height)
        {
            return 0;
        }
        if(that.height>that.height)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}

public class _3WEProblemArrayList {

    public static void main(String[] args) {
        Plant snakePlant = new Plant(12,"Yellow");
        Plant Dreasina = new Plant(15,"Black");

        List<Plant> plantList = new ArrayList<>();
        plantList.add(snakePlant);
        plantList.add(Dreasina);

        plantList.forEach(plant -> System.out.println(plant));
    }

}
