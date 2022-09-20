package Today;

public class _10EnumSwitch {

    enum Day{
        SUNDAY,MONDAY,FRIDAY;
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;

        switch (day){
            case FRIDAY :
                System.out.println("Friday");
                break;
            case SUNDAY :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("None");
        }

    }
}
