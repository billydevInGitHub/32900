package practice200322.iterator;

public class MyIterator implements  Iterator {
    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    Collection collection;

    int pos=-1;



    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public Object first() {
        pos=0;
        return collection.get(pos);
    }
}
