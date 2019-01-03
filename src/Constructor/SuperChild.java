package Constructor;

public class SuperChild extends SuperKeyword{
		
	public SuperChild(){
		super(10);
		System.out.println("Child Class ");
	}


	public static void main(String args[]){
		SuperChild obj=new SuperChild();
		
	}
}
