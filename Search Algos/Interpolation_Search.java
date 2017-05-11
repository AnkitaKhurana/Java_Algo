import java.*;
import java.util.Scanner;

public class Interpolation_Search {

	public static int num ;
	
	
	private static Scanner s;
	
	public static int interpolationSearch(int[] array,  int from, int to,int value){
	    
	 int index=0;
	    //probable position of the searched value
	 	if((to==from)&&array[to]!=value)
	 		return -1;
	 
		if(array[to] - array[from]!=0)
			 index = from + ((to - from)/(array[to] - array[from])) * (value - array[from]);
	    if(index > to ||array[to] - array[from]==0)
	    	index = (to + from)/2;
	   
	    if(array[index] == value) return index;//found
	    //continue in the right part of the array
	    else if(array[index] < value) return interpolationSearch(array,index + 1, to,value);
	    //continue in the left part of the array
	    else return interpolationSearch(array,  from,index - 1, value);
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
		
		int res = interpolationSearch(array,0,size-1,num);
		if(res!=-1)
			System.out.println("Number Found at pos "+(res+1));
		else
			System.out.println("Not Found !");
		
		
		
	}

	
	
}