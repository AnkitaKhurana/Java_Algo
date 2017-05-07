import java.*;
import java.util.Scanner;
public class Counting_Sort {

	public static void count (String s, int size)
	{
		int arr[]= new int[26];
		for ( int i = 0 ; i < size ; i ++)
			{
			
			String dig = s.substring(i,i+1);
			arr[dig.charAt(0)-65]++;
			
			}
		for(int i =0 ; i< 26 ; i ++)
		{
			while(arr[i]!=0)
			{
				System.out.print((char)(i+65));
				arr[i]--;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s;
		System.out.println("Enter a String to Sort ");
		s = new Scanner(System.in);
		String str = s.next();
		count(str,str.length());
		
		
		
		
	}

}
