package practice200322.template;

public abstract class  AbstractCalculator {

    public abstract int calculate(int num1, int num2);

    public int calculate(String expression, String ops){
        int[] intArray=split(expression,ops);
        return calculate(intArray[0], intArray[1]);
    }

    public int[] split(String expression, String ops){
        String[] strings=expression.split(ops);
        int[] intArray = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            intArray[i] = Integer.parseInt(strings[i]);
        }
        return intArray;
    }

}
