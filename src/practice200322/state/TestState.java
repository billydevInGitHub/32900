package practice200322.state;

public class TestState {
    public static void main(String[] args) {
        Context ctx = new Context(new LowerCaseState());
        ctx.writeName("Monday");
        ctx.writeName("Tuesday");
        ctx.writeName("Wednesday");
        ctx.writeName("Thursday");
        ctx.writeName("Friday");
        ctx.writeName("Saturday");
        ctx.writeName("Sunday");
    }
}
