package Constructor;

public class A {
	
	public A(){
		System.out.println("Defalut constructors");
	}
	public A(int i){
		System.out.println("Single parameters " + i);
		System.out.println("Single parameter constructor");
	}
	public A(int i,int j){
		System.out.println("Single parameters " + i);
		System.out.println("Single parameters " + j);
		System.out.println("Two Parameters constructor");
	}
	
	public static void main(String args[]){
		A obj=new A();
		A obj1=new A(10);
		A obj2=new A(10,20);
		
	}

}
