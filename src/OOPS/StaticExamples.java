package OOPS;

public class StaticExamples {
	
	static int a=10;   // Static variable
	int b=20;  //Non static
	
	static void m(){
		System.out.println("This is static method ");
	}
	void m1(){
		System.out.println("This is non static method ");
	}
	
	void m3(){
		System.out.println("m2 method non static");
		System.out.println(a);
		System.out.println(b);
		m();
		m1();

	}

	public static void main(String[] args) {
		
		//1)Static method can acces only static stuff(directly with out create object).
		System.out.println(a);
		m();
		
		//static method can also access non static stuff but through object.
		
		StaticExamples se=new StaticExamples();  
		System.out.println(se.b);           //non static variable through object.
		se.m1();
		
		se.m3();
		

	}

}
