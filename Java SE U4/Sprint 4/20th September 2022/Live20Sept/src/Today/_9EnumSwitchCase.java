package Today;

import java.awt.*;
enum Color1{
    RED,PINK,BLACk,YELLOW;
}
public class _9EnumSwitchCase {
    public static void main(String[] args) {
            Color1 color1 = Color1.BLACk;
            switch (color1)
            {
                case RED -> System.out.println("red");
                //case BLACk -> System.out.println("Black");
                case PINK -> System.out.println("pink it");
                case YELLOW -> System.out.println("Yellow");
                default -> System.out.println("None");
            }
    }
}
