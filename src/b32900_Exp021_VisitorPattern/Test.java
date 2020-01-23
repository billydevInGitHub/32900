package b32900_Exp021_VisitorPattern;

interface Visitor {  
    public void visit(Subject sub);  
}  

class MyVisitor implements Visitor {  
	  
    @Override  
    public void visit(Subject sub) {  
        System.out.println("visit the subject:"+sub.getSubject());  
        //sub.getSomePrivateInfo(); visitor is not allow to see this private info
    }  
}  


interface Subject {  
    public void accept(Visitor visitor);  
    public String getSubject();  
}  


class MySubject implements Subject {  
	  
    @Override  
    public void accept(Visitor visitor) {  
        visitor.visit(this);  //Billy: I think when MySubject is implemented
                               //like iterate through file tree, it will only give the visitor parameters
                               //so visitor can only access the resource it is given and that resouce's public method
                               //I think the implementation is calling back the visitor's methods !!
    }  
  
    @Override  
    public String getSubject() {  
        return "love";  
    }  
    //the following added by billy
    private String getSomePrivateInfo() {
    	return "private information of MySubject";
    }
}  

public class Test {

	 public static void main(String[] args) {  
         
	        Visitor visitor = new MyVisitor();  
	        Subject sub = new MySubject();  
	        sub.accept(visitor);      
	    }  
	 
}
