package ArrayPrograms;

public class SingledimensioalString {
	
	public static void main(String args[]){
		
		String a[]={"Sekhar","Raju","chandu","Balu"};
		
		System.out.println(a.length);
		System.out.println(a[2]);
		
	/*	for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}*/
		
		for(String i:a){
			System.out.println(i);
		}
	}

}
