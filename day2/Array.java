package week0.day2;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
		int[] num = {3,2,11,4,6,7};
		
	Arrays.sort(num);
	
	for (int i=0 ; i <= num.length -1 ; i++) 
	{
		
		if( i == num.length-2)
		{
			System.out.println("The second largest number is" +" "+num[i] );
		}
		//System.out.println(num[num.length-2]);
	}

	}

}
