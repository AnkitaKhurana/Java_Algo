import java.util.ArrayList;
import java.util.Scanner;

public class Heap_Sort {

	private void swap(ArrayList<Integer> a , int i , int j)
	{
		int temp = (int )a.get(i);
		a.set(i,a.get(j));
		a.set(j,temp);
		
	}
	
	
	private void heapsort(ArrayList<Integer> a,int n )
	{
		int size = a.size();
		for ( int i = n/2-1 ; i >=0;i-- )
		{
			heapify(a,size,i);
			
		}
		for(int h =n-1;h>=0;h-- )
		{
			swap(a,0,h);
			heapify(a,h,0);
		}
	}
	private void heapify(ArrayList<Integer> a , int n , int i)
	{
		int big = i ;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && a.get(l)>a.get(big))
			big = l;
		if(r<n && a.get(r)>a.get(big))
			big = r;
		if(big!=i)
		{
			swap(a,i,big);
			heapify(a,n,big);
		}
	}
 public static void main(String arg[])
	{
		String ans="y";
		Scanner s;
		s= new Scanner(System.in);
		int i = 0 ;
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(ans.equals("y"))
		{
			System.out.println("enter element "+(i+1));
			a.add(s.nextInt());
			i++;
			System.out.println("Want to continue ??");
			String h = s.next();
			 ans = h.toString();
		}
		
		Heap_Sort h = new Heap_Sort();
		h.heapsort(a,a.size());
		
		for(int  y = 0 ; y <a.size();y++ )
			System.out.println(a.get(y));
		
	}
	
	
	
}
