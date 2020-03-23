package practice200322.prototype;

import java.io.IOException;

public class ProtoTypeTest {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        Object clone1 = prototype.clone();
        Object clone2 = prototype.deepClone();
        System.out.println(clone1);

    }
}
