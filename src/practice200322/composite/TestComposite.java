package practice200322.composite;

public class TestComposite {
    public static void main(String[] args) {
        Graphic ellipse1 = new Ellipse();
        Graphic ellipse2 =new Ellipse();
        Graphic ellipse3 = new Ellipse();
        CompositeGraphics compgraph1= new CompositeGraphics();
        CompositeGraphics compgraph2= new CompositeGraphics();

        compgraph1.addChild(ellipse1);;
        compgraph1.addChild(compgraph2);
        compgraph2.addChild(ellipse2);
        compgraph2.addChild(ellipse3);
        compgraph1.print();


    }
}
