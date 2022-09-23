
public class _8HasCodeMethod {
    public static void main(String[] args) {
        Plant plant = new Plant(10,"rose");
        int i = plant.hashCode();
        System.out.println(i);


        Integer num = 13;
        System.out.println(num.hashCode());

    }
}
