package practice200322.visitor;

public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject sub) {
        System.out.println("visiting the resource:"+sub.getSubjectResource());
    }
}
