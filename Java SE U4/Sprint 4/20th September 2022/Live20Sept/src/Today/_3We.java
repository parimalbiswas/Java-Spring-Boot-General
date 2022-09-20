package Today;
interface Printer{  // Super Type
    void print();
}

class FilePrinter implements Printer{ // SubType Type

    @Override
    public void print() {
        System.out.println("FilePrinter is Printer");
    }
}

class ConsolePrinter implements Printer{ // SubType Type
    @Override
    public void print(){
        System.out.println("ConsolePrinter is Printer");
    }
}
public class _3We {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.print();

        FilePrinter filePrinter = new FilePrinter();
        filePrinter.print();

        System.out.println(filePrinter instanceof Printer);
        System.out.println(consolePrinter instanceof Printer);
    }
}
