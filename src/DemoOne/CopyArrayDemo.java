package DemoOne;

import java.util.Arrays;

public class CopyArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// =========================== clone=====================		
		int intArray[] = {1,2,3};
		
		int CloneArray[]= intArray.clone(); 


//	====================== arraycopy(source aray, srcPos, dest array, dest pos, lenght)
		
		int arr1[] = {0,1,2,3,4,5,6};
		int arr2[] = {10,9,44,11,7,8};
		
		System.arraycopy(arr1,1, arr2, 0, 3);
		
		System.out.println(arr2[0] + " ");
		System.out.println(arr2[1] + " ");
		System.out.println(arr2[2] + " ");
		System.out.println(arr2[3] + " ");
		System.out.println(arr2[4] + " ");
		System.out.println(arr2[5] + " ");
//=============================== Arrays.copyof----------------	
		int[] values = {1, 2, 3};
		
		int[] arrayB = Arrays.copyOf(values, 8);
		
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(arrayB));
		
		
		}  
	

}
