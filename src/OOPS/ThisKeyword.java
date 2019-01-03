package OOPS;

public class ThisKeyword {
	
	int a,b;
	
	void add(int x,int y){
		a=x;
		b=y;
	}
	void print(){
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String args[]){
		ThisKeyword ob=new ThisKeyword();
		ob.add(10, 20);
		ob.print();
		
	}

}
