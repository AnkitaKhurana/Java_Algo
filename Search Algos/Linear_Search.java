import java.util.*;
import java.*;
public class Linear_Search {

public static int num ;
	
	
	private static Scanner s;
	 public static int linear_search(int[]  a, int start , int end , int num )
	 {
		 for ( int i  = start ; i < end  ; i ++)
		 {
			 if(a[i]==num)
				 return i ;
			 
		 }
				 
		 
		 return -1;
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		s = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size = s.nextInt();
		int array[]= new int[size];
		System.out.println("Enter Array  :");
		for(int i = 0 ; i < size ; i++)
		{
			array[i]=s.nextInt();
		}
		System.out.println("Enter Number to be Searched ");
		num = s.nextInt();
		
		int res = linear_search(array,0,size,num);
		if(res!=-1)
			System.out.println("Number Found at pos"+(res+1));
		else
			System.out.println("Not Found !");
		
		
		
	}


}
