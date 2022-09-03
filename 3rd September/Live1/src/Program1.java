
public class Program1 {
    public static void main(String[] args) {
        byte myByte = 10;
        int  myInt = myByte;

        int i=10;
//        explicit type casting
        byte b = (byte) i;
        System.out.println(b);


        char c = 'A';  // ASCII of A is c;
        int anotherInteger = c;
        System.out.println(anotherInteger);
        int asciiValueofZ = 'z';
        System.out.println(asciiValueofZ);


        byte b1=10;
        byte b2=20;
        byte b3 = (byte) (b1+b2);  //|| -128 to 127
        System.out.println(b3);

        byte a1=125;
        byte a2=4;
        byte a3 = (byte) (a1+a2);  //|| -128 to 127
        System.out.println(a3);


//        Standered Practise is
//        always use int
//        use Long if no is too long


    }
}
