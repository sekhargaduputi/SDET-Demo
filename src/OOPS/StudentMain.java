package OOPS;

public class StudentMain {
	public static void main(String args[]){
		
		StudentClass stu1=new StudentClass(1010,"Jhone",'S');
		
		/*//by assign using refrence variable
		stu1.sid=20;
		stu1.sname="sekhar";
		stu1.grade='A';*/
		
		//assign values by methods
		//stu1.getvalues(20, "chandu", 'B');
		stu1.display();
		
		
		
	}

}
