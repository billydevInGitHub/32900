package b32900_Exp004_ObjectAdapterPattern;


class Source {  
	  
    public void method1() {  
        System.out.println("this is original method!");  
    }  
}  


interface Targetable {  
	  
    /* the same as original implementation*/  
    public void method1();  
  
    /*new methods*/  
    public void method2();  
}  


class Adapter implements Targetable {  
	private Source source ; 
	  
	public Adapter(Source sourceInput) {
		source=sourceInput; 
	}
	
	public void method1() {
		source.method1();
	}
   
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
}  

public class AdapterTest {

    public static void main(String[] args) { 
    	Source source = new Source(); 
        Targetable target = new Adapter(source);  
        target.method1();  
        target.method2();  
    }

}
