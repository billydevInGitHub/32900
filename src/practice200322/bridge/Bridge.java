package practice200322.bridge;

public abstract class  Bridge {
    Sourceable  source ;

    public void setSource(Sourceable source) {
        this.source=source;
    }

    public Sourceable getSource(){
        return source;
    }

    public abstract void method();


}
