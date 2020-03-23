package practice200322.proxy;

import com.sun.management.VMOption;

import javax.crypto.spec.PSource;

public class Proxy implements Sourceable {
    @Override
    public void method() {
        System.out.println("before");
        new Originator().method();
        System.out.println("after");
    }
}
