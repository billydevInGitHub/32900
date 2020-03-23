package practice200322.visitor;

public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubjectResource() {
        return "this is just mimic of the resources!";
    }
}
