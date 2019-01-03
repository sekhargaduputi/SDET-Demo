package OOPS;

public class Overloading {

	 void sum(int x,int y){
		 System.out.println(x+y);
	 }
	 void sum(double a,double b){
		 System.out.println(a+b);
	 }
	 void sum(String sekhar,String chandu){
		 System.out.println(sekhar+chandu);
	 }
	
	 public static void main(String args[]){
		 
		 Overloading obj= new Overloading();
		 obj.sum(10, 20);
		 obj.sum(22.33,22.66);
	 }
	
}
