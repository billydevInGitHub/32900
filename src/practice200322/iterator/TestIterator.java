package practice200322.iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection col= new MyCollection();
        Iterator it= col.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
