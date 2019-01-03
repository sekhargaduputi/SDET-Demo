package OOPS;

public class Calcutions {
	
	
	int x=10;
	int y=20;
	
	 /*void sum(){  // case1  not taking parameters and also not taking return any value
		System.out.println(x+y);
	}*/
	
	/* int sum(){  // case2  not taking parameters and  taking return any value
		 return (x+y);
			//System.out.println(x+y);
		}*/
	
	/*void sum(int a,int b){  // case3 taking parameters and also not taking return any value
		System.out.println(a+b);
	}*/
	 int sum(int a,int b){     //case4  taking parameters and  taking return any value
		 return (a+b);
	 }
	 
	
	public static void main(String args[]){
		
		Calcutions g=new Calcutions();
		//g.sum();// case1
		
		/*int res=g.sum();
		System.out.println(res);
		System.out.println(g.sum());*/  // case2
		
		//g.sum(10,20); // case 3
		System.out.println(g.sum(10, 20));  // case 4
		
		
		
	}
	
	
	

}
