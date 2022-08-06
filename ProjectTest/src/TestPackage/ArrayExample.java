package TestPackage;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sigle dimensional array
		
		/*int arr[] = {10,20,30,40,50};
		System.out.println(arr[1]);//it will fetch 2nd element from array
		
		for (int i=0; i<5;i++) {
		
			//System.out.println(arr[i]);
		}*/
		
		// two dimentional array
		
		int twoDimArr[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		 //System.out.println(twoDimArr[1][2]); // accessing single value from 2-D Array
		 for (int i=0; i<=2;i++) {        //row pointer 
			for (int j=0; j<=2;j++) {    //column pointer 
				System.out.println(twoDimArr[i][j]);
		 }
		 
		
	    }
	}
}



