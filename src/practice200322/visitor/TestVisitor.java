package practice200322.visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Subject sub= new MySubject();
        sub.accept( new MyVisitor());
    }
}
