package ArrayPrograms;

public class SingleDimenisoal {

	public static void main(String args[]){
		
	/*	int a[]=new int[6];  //declare array with size
		
		//store values into array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		int i[]={10,20,30,40,50};  //Dynamic array declare array without specify size.
		
		/*System.out.println(i.length);  //print length/size
		
		System.out.println(i[3]);  //Specific value print 
		
		for(int b=0;b<i.length;b++){
			System.out.println(i[b]);*/
			
			//Advanced for loop/for each loop
			for(int a:i){
				System.out.println(a);
			}
			
		}
		
	}

