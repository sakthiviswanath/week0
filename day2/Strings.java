package week0.day2;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Strings {

	
	public static void main(String[] args)
	{
				String str ="welcome to egmore";
				int count=0;
               char[] charArray = str.toCharArray();
//				 for (char c : charArray) {
//					 
//					 if(c=='e')
//					 {
//						 
//					 }
//					System.out.print(c);
//		
//				}
				
			for (char i=0; i<charArray.length; i++)	 
		
			{
				if(str.charAt(i) =='e')
				{
					count=count+1;
				}
			}
			
			System.out.println(count);

			
			
				
	}
	
	
	
	
	}
	
	


