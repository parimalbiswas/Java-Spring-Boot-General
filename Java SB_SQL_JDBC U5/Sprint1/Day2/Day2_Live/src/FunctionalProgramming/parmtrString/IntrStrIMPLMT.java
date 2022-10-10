package FunctionalProgramming.parmtrString;

public class IntrStrIMPLMT implements IntrStr{
    @Override
    public String sayHellow(String name) {
        return "Welcome : "+name.toUpperCase();
    }
}
