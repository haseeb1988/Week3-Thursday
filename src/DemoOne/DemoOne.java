package DemoOne;

import java.util.Arrays;

public class DemoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datatype variabename[] = new datatype[]
		
		int[] myarray = new int[10]; // declaration, initialization, instance
		int mysecoundArray[] = new int[20];
		byte[] be = new byte[10];
		short[] sh = new short[5];
		boolean[] bo = new boolean[6];
		float[] fl = new float[4];
		double[] db = new double[45];
		char[] charray = new char[12];
		String[] st = new String[5];
		Object obj[] ;
		
		st[0] = "Haseeb"; 
		st[1] = "Perscholas";
		st[2] = "USA";
		st[3] = "ABC";
		st[4] = "XyZ";
		
		int[] arr = {1,26,5,6,8,4,7,2,6,9,2,4,55,44,77}; // Declarationg and initialzation of value , size 15
		
		//System.out.println(db.length);
		
		for(int i = 0;  i < arr.length; i++) {
				
	 System.out.println(arr[i]);
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
		//System.out.println(arr[14]);
		}
		
		// foreach loop
		
//		foreach loop print the array elements one by one, it holds an array elements in a variable, 
	//	 then executes the body of the loop
		
		/*for(datatype varibale: arrayVariable)
		{
			// body of the loop
		}
		*/
		
	int[] abc = {4,33,44,55,66,7,88,99,00,11,12,12,21,34}	;
	
	for(int a :abc)
	{
		//System.out.println(a); 
	}
	
	 System.out.print(Arrays.toString(abc));
		
	}

}
