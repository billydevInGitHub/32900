package practice200322.iterator;

public class MyCollection implements  Collection {

    String[] col = {"test1", "test2", "test3", "test4", "test5", "test6"};


    @Override
    public Object get(int i) {
        return col[i];
    }

    @Override
    public int size() {
        return col.length;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

}
