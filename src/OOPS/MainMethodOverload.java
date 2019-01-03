package OOPS;

public class MainMethodOverload {
	
	public static void main(int a,int b){
		System.out.println(a+b);
	}
	public static void main(double x,int b){
		System.out.println(x+b);
	}
	public static void main(String args[]){
		
		MainMethodOverload ob=new MainMethodOverload();
		ob.main(10,20);
		ob.main(20.5,2);
	}
	
}
