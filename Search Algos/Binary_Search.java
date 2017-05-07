import java.*;
import java.util.Scanner;

public class Binary_Search {

	public static int num ;
	
	
	private static Scanner s;
	 public static int binary_search(int[]  a, int start , int end , int num )
	 {
		 int mid = (start+end)/2;
		 if(a[mid] == num)
			 return mid ;
		 else if(mid< num )
		 {
			 start = mid+1 ;
			 binary_search(a,start , end , num);
			 
		 }
		 else
		 {
			 end = mid-1 ;
			 binary_search(a,start,end,num);
			 
		 }
		 
				 
		 
		 return -1;
		 
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		s = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size = s.nextInt();
		int array[]= new int[size];
		System.out.println("Enter Array in Ascending Order :");
		for(int i = 0 ; i < size ; i++)
		{
			array[i]=s.nextInt();
		}
		System.out.println("Enter Number to be Searched ");
		num = s.nextInt();
		
		int res = binary_search(array,0,size,num);
		if(res!=-1)
			System.out.println("Number Found at pos"+(res+1));
		else
			System.out.println("Not Found !");
		
		
		
	}

	
	
}
