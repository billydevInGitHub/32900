package practice200322.template;

public class TestTemplate {
    public static void main(String[] args) {
        AbstractCalculator cal = new Plus();
        System.out.println(cal.calculate("4+5", "\\+"));
    }
}
