
import java.util.ArrayList;
import java.util.Scanner;
public class Merge_Sort {

	
	public static void merge(ArrayList<Integer> a,int start, int mid , int end)
	{
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		
		int start1 = start ;
		int start2 = mid+1;
		int end1 = mid;
		int end2= end;
		while(start1<=end1&&start2<=end2)
		{
			if(a.get(start1)<a.get(start2))
			{
				
				sorted.add(a.get(start1));
				start1++;
				
			}
			else
			{
				sorted.add(a.get(start2));
				start2++;
				
			}
		}
		while(start1<=end1)
		{
			sorted.add(a.get(start1));
			start1++;
			
		}
		while(start2<=end2)
		{
			sorted.add(a.get(start2));
			start2++;
			
		}
		
		for ( int k = start, f = 0  ; k < end; k ++,f++)
		{
			a.set(k, sorted.get(f));
		}
		
		
			
	}
	
	
	public static void mergesort ( ArrayList<Integer> a,int start , int end)
	{
		if(start<end)
		{int mid = (end+start)/2;
		mergesort(a,start,mid);
		mergesort(a,mid+1,end);
		merge(a,start,mid,end);
		}	
		
	}
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String ans="y";
		Scanner s;
		s= new Scanner(System.in);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(ans.equals("y"))
		{
			System.out.println("enter element :");
			a.add(s.nextInt());
		
			System.out.println("Want to continue ??");
			String h = s.next();
			 ans = h.toString();
		}
		
		mergesort(a,0,a.size()-1);
		int size = a.size();
		
		for(int  y = 0 ; y <size;y++ )
			System.out.println(a.get(y));
		
	}
}