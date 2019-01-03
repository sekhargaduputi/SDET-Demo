package Programms;

public class Operators {

	public static void main(String args[]){
		
		int a=10;
		int b=30;
		//int c=a+b;
		System.out.println("Sum of a and b:" +(a+b));
		System.out.println("Dif of a and b:" +(a-b));
		System.out.println("Mul of a and b:" +(a*b));
		System.out.println("mod of a and b:" +(a%b));
		
		//Relational operators (Comparison operators)----->  == < > <= >= !=
		System.out.println(a==b); // false
		System.out.println(a<b);  //True
		System.out.println(a>b);  //false
		System.out.println(a<=b); //true
		System.out.println(a>=b);  //flase
		System.out.println(a!=b);  //true
		
		//Incremental/Dremental operators---> ++ --
		a=10;
		a++;   //a+1
		System.out.println(a);
		
		b=20;
		b--;  //b=b-1;
		System.out.println(b);
		
		//Swap two number
		
		int x=20;
		int y=30;
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println(x);
		System.out.println(y);
		
		/*x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);*/
		
		
	}
}
