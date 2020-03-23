package practice200322.interpreter.implementationTwo;

import java.util.Stack;

public class TestNew {
    public static void main(String[] args) {
        String expressionInput="9 2 + 7 - 8 *";
        String[] tokens = expressionInput.split(" ");
        Stack<Expression> stack = new Stack<>();
        for (String token : tokens) {
            if(ExpressionUtil.isOperator(token)){
                Expression exp1=stack.pop();
                Expression exp2=stack.pop();
                Expression newExp = ExpressionUtil.newExpression(token, exp1, exp2);
                stack.push(new Number(newExp.interpret()));
            }else{
                stack.push(new Number(Integer.parseInt(token)));
            }
        }
        System.out.println(stack.pop().interpret());

    }
}
