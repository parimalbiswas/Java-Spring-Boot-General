package Today;

//IF U WRITE LIKE THIS
enum Direction{
    EAST,WEST,NORTH,SOUTH;
}

//JVM WILL COMPILE INTERNALLY LIKE THIS


//final class Directions extends Enum{
//    public static final Directions EAST = new Directions();
//    public static final Directions WEST = new Directions();
//    public static final Directions NORTH = new Directions();
//    public static final Directions SOUTH = new Directions();
//
//}



enum Color{
    RED,GREEN,BLUE,QUEEN_BLUE;
}
public class _8Enums {
    public static void main(String[] args) {
        Direction direction ;
        direction=Direction.EAST;

        Direction direction1;
        direction1=Direction.WEST;

        System.out.println(direction1==direction);
        System.out.println(direction1==Direction.WEST);

    }

}
