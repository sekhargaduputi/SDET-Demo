package ArrayPrograms;

public class TwoDimansionalArray {

	public static void main(String args[]){
		
		int j[][]=new int[2][2];
		
		//int k[][]={{100,200},{300,400}};
		
		j[0][0]=100;
		j[0][1]=200;
		
		j[1][0]=300;
		j[1][1]=400;
		
		/*System.out.println(j.length); // number of rows printing
		System.out.println(j[0].length); //number columns printing
*/		
		/*for(int i=0;i<j.length;i++){
			
			for(int k=0;k<j[i].length;k++){
				System.out.println(j[i][k]);
			}

		}*/
		
		for(int k[]:j){
			for(int i:k){
				System.out.println(i);
			}
			
		}
	}
}
