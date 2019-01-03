package OOPS;

public class ConstructorLoading {
	
	ConstructorLoading(int a,double b){//1
		System.out.println(a+b);
	}
	ConstructorLoading(double x,double a){ //2
		System.out.println(x+a);
		
	}
	ConstructorLoading(int a,int b,int c){  //3
		System.out.println(a+b+c);
	}
	
	
	
	
	
	public static void main(String args[]){
		ConstructorLoading obj=new ConstructorLoading(10,20,30); //3
		ConstructorLoading obj1=new ConstructorLoading(2.3,2.5);
		
	}

}
