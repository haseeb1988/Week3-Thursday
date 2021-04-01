package DemoOne;

import java.util.Scanner;

public class CheckValueinARray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter your 4 digit pin number");
		int[] number = {1928,2563,4155, 5442,8521,7854,2145};
		Scanner sc = new Scanner(System.in);
		int toFind = sc.nextInt();
		//int toFind =100;
		boolean found = false;
		for(int n = 0; n < number.length; n++)
		{
			if(number[n] == toFind) // compare index position with number is being search
			{
				found = true;
				break;
			}
		}
		
		if(found == true)
		{
			System.out.println(toFind + " login sucessfully");
		}
		else 
		{
			System.out.println(toFind + ":Your pin in incorrect");
		}
	}

}
