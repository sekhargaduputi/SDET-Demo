package OOPS;

public class Constructor {
	
	int x;
	int y;
	
	/*Constructor(){  //default constructor
		x=10;
		y=20;
	}*/
	
	Constructor(int a,int b){
		x=a;
		y=b; 
		
	}
	void print(){
		System.out.println(x+y);
	}
	
	
	
	public static void main(String args[]){
		//Constructor b=new Constructor(); //default constructor
		//b.print();
		
		Constructor b=new Constructor(100,200);// parametrized constructor
		b.print();
		
		
		
	}

}
