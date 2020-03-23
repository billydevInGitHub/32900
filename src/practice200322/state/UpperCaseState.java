package practice200322.state;

public class UpperCaseState implements State {
    @Override
    public void writeName(Context ctx, String msg) {
        System.out.println(msg.toUpperCase());
        ctx.setState(new LowerCaseState());
    }
}
