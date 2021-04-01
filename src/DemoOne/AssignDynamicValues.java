package DemoOne;

import java.util.Arrays;
import java.util.Scanner;

public class AssignDynamicValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = new int[5];
		
		for(int i =0; i < 5; i++)
		{
			values[i] = i + i;
			//System.out.println(values[i]);
		}
		
		
		System.out.print("Enter number for Array initialization");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String[] arr = new String[number];
		System.out.print(arr.length);
		
		System.out.print("Enter your name");
		String name= sc.next();
		
		System.out.print("Enter your username");
		
		String username= sc.next();
		
		System.out.print("Enter your password");
	
		String password= sc.next();
		
		arr[0] = name;
		arr[1] = username;
		arr[2] = password;
	    System.out.println(Arrays.toString(arr));
	     
	     
	    int[] unsortedArray = {2,5,4,7,8,0,7,5,32,9,11,22,0};
	    Arrays.sort(unsortedArray);
	    System.out.println(Arrays.toString(unsortedArray));
	}

}
