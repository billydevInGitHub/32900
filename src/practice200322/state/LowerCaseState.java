package practice200322.state;

public class LowerCaseState implements  State {
    private int count =0;
    @Override
    public void writeName(Context ctx, String msg) {
        System.out.println(msg.toLowerCase()+" count is:"+count);
        if (count++>0) {
            ctx.setState(new UpperCaseState());
        }

    }
}
