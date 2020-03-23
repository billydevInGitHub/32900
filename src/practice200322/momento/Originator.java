package practice200322.momento;

public class Originator {
    String state;

    public static class Momento{
        private  String state;
        private void setState(String inputState){
            this.state=inputState;
        }
        private String getState(){
            return this.state;
        }

    }

    public Momento createMomento(){
        Momento momento = new Momento();
        momento.setState(state);
        return momento;
    }

    public void restoreState(Momento momento){
        this.state=momento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
