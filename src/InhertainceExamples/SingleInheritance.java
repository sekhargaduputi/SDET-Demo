package InhertainceExamples;

//import InhertainceExamples.A.B;

class A{          // A is Parent class/Super class
	int a;
	void m(){
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
}
class B extends A{   // B is child class/Sub Class
		int b;
		void m1(){
			System.out.println(b);
		}
	}
	

public class SingleInheritance {
	public static void main(String args[]){
	 A obj=new A();
	 obj.a=100;
	 obj.m();
	 
	 B n=new B();
	 n.b=20;
	 n.a=10;
	 n.m1();
	 n.m();
	 
	}
}
