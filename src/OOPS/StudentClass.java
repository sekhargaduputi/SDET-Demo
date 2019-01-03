package OOPS;

public class StudentClass {
	
	int sid;
	String sname;
	char grade;
	
	StudentClass(int id,String name,char g){
		sid=id;
		sname=name;
		grade=g;
		
		
	}
	
	void display(){
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	void getvalues(int id,String name,char g){
		sid=id;
		sname=name;
		grade=g;
		
	}
}
