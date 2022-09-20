class Mother{

}
class Daughter extends Mother{

}


public class _6UpCasting {
    public static void main(String[] args) {
        Mother mother = new Mother();
        Daughter daughter = new Daughter();
        // Base class (variable) can have subClass Reference
        Mother mother1 = new Daughter(); //Upcosting
        String str = "dhfjbdhjhfbjdbhfcjb";
        Object obj = "hdgbfb";  //Upcosting
        Object obj1 = new Mother();  //Upcosting
    }
}
