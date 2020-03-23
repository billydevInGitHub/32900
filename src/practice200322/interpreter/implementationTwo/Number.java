package practice200322.interpreter.implementationTwo;

public class Number implements Expression   {
    int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return  num;
    }
}
