package b32900_Exp008_ProxyPattern;

interface Sourceable {  
    public void method();  
}  

class Source implements Sourceable {  
	  
    @Override  
    public void method() {  
        System.out.println("the original method!");  
    }  
}  

class Proxy implements Sourceable {  
	  
    private Source source;  
    public Proxy(){  
        super();  
        this.source = new Source();  //BL: attention here: Source object newly created here !! 
    }  
    @Override  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }  
}  


public class ProxyTest {

	public static void main(String[] args) {  
        Sourceable source = new Proxy();  
        source.method();  
    }  
	
}
