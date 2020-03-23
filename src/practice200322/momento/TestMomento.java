package practice200322.momento;

import java.util.ArrayList;
import java.util.List;

public class TestMomento {
    public static void main(String[] args) {
        List<Originator.Momento> states= new ArrayList<>();
        Originator originator = new Originator();
        originator.setState("State1");
        System.out.println("Originaltor state before save: "+originator.getState());
        states.add(originator.createMomento());
        originator.setState("State2");
        originator.setState("State3");
        System.out.println("Originator state after setting several times: "+originator.getState());
        originator.restoreState(states.get(0));
        System.out.println("Originator state after restore: "+originator.getState());


    }
}
