package practice200322.interpreter.implementationTwo;

public class ExpressionUtil {
    public static  boolean isOperator(String token){
        if(token.equals("+")||token.equals("-")||token.equals("*")){
            return true;
        }
        return false;
    }

    public static Expression newExpression(String token, Expression exp1, Expression exp2){
        Expression retExp=null;
        switch (token) {
            case "+":
                retExp = new Plus(exp1, exp2);
                break;
            case "-":
                retExp = new Minus(exp1, exp2);
                break;
            case "*":
                retExp = new Times(exp1, exp2);
                break;
        }
        return retExp;
    }
}
