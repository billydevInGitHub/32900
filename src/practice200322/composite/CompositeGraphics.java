package practice200322.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphics implements  Graphic {
    List<Graphic> children = new ArrayList<>();

    public void addChild(Graphic child){
        children.add(child);
    }

    public void removeChild(Graphic child){
        children.remove(child);
    }
    @Override
    public void print() {

        System.out.println("printing children...");
        for (Graphic child : children) {
            child.print();

        }
    }
}
