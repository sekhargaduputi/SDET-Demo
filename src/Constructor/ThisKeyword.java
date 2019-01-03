package Constructor;

public class ThisKeyword {
	
	String name;
	int age;
	
	public ThisKeyword(String name,int age){
		
		this.name=name;
		this.age=age;
		System.out.println("Local names");
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String args[]){
		ThisKeyword obj=new ThisKeyword("Sekhar",10);
	}

}
