package practice200322.interpreter.implementOne;

public class Minus implements  Expression {
    @Override
    public int interpret(Context ctx) {
        return ctx.getNum1()-ctx.getNum2();
    }
}
