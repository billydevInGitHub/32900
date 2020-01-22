package b32900_Exp021_VisitorPattern;

interface Visitor {  
    public void visit(Subject sub);  
}  

class MyVisitor implements Visitor {  
	  
    @Override  
    public void visit(Subject sub) {  
        System.out.println("visit the subject："+sub.getSubject());  
    }  
}  


interface Subject {  
    public void accept(Visitor visitor);  
    public String getSubject();  
}  


class MySubject implements Subject {  
	  
    @Override  
    public void accept(Visitor visitor) {  
        visitor.visit(this);  
    }  
  
    @Override  
    public String getSubject() {  
        return "love";  
    }  
}  

public class Test {

	 public static void main(String[] args) {  
         
	        Visitor visitor = new MyVisitor();  
	        Subject sub = new MySubject();  
	        sub.accept(visitor);      
	    }  
	 
}
