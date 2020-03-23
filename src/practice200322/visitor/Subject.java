package practice200322.visitor;

public interface Subject {
    void accept(Visitor visitor);
    String getSubjectResource();
}
