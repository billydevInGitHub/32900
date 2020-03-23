package practice200322.interpreter.implementOne;

public class Plus implements Expression{

    @Override
    public int interpret(Context ctx) {
        return ctx.getNum1() + ctx.getNum2();
    }
}
