package practice200322.state;

public class Context {
    State current;

    public Context(State current) {
        this.current = current;
    }

    public void writeName(String msg){
        current.writeName(this, msg);
    }

    public void setState(State state){
        current=state;
    }
}
