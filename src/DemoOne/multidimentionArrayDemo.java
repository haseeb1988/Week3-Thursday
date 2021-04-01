package DemoOne;

import java.util.Arrays;

public class multidimentionArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] twoDArray = new int[4][4];
		
		// 2 --> 0,0
		twoDArray [0][0] = 2; 
		twoDArray[0][1] = 5;
		
	int[][] a = {  {25,54},{89,47},{458,78},{5,5555}  };	
	 System.out.println(Arrays.deepToString( a ));
	
	
	 
	 
	 
	 for(int i = 0; i < a.length; i++)
	{
		for(int j = 0; j < a[i].length; j++) 
		{
			//System.out.println( a[i][j]);
			// System.out.println("lenght of row 0: " +   a[0].length);		
      //System.out.println("lenght of row 1: " +   a[1].length);		
      //System.out.println("lenght of row 2: " +   a[2].length);		
		}
	} 
      
      
	}

}
