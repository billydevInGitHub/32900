package practice200322.interpreter.implementationTwo;

public class Minus implements Expression {
    Expression exp1;
    Expression exp2;

    public Minus(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public int interpret() {
        return exp1.interpret()-exp2.interpret();
    }
}
