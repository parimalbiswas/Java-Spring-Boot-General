//POJO
class JavaBeen{
    private int x;

    public int getX()
    {
        return x;
    }
    public void setX(int a)
    {
        x=a;
    }

    JavaBeen()
    {

    }

}

class AnotherJavaBeen{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public AnotherJavaBeen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public AnotherJavaBeen() {
    }

    public AnotherJavaBeen(int x) {
        this.x = x;
    }
}


public class P3 {
    public static void main(String[] args) {
        JavaBeen jb1= new JavaBeen();
        jb1.setX(5);
        System.out.println(jb1.getX());
    }
}
