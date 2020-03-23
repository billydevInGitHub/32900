package practice200322.interpreter.implementOne;

public class Test {
    public static void main(String[] args) {
        int exp= new Plus().interpret(new Context(
                new Minus().interpret(new Context(9,2)), 9
        ));
        System.out.println(exp);
    }
}
