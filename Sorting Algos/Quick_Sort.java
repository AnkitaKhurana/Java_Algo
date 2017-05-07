
import java.util.ArrayList;
import java.util.Scanner;
public class Quick_Sort {
	
	public static void swap(ArrayList<Integer> a , int i , int j)
	{
		int temp = (int )a.get(i);
		a.set(i,a.get(j));
		a.set(j,temp);
		
	}
	
	
	static int partition(ArrayList<Integer>a,int l ,int h )
	{
		int pivot = a.get(h);
		int i = l-1,j;
		for (j=l ; j <h;j++ )
		{
			if(a.get(j)<=pivot)
			{
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,h);
		return(i+1);
		
		
	}
	
	static void quicksort(ArrayList<Integer>a,int l , int h )
	{
		if ( l < h )
		{
			int i = partition(a,l,h);
			quicksort(a,l,i-1);
			quicksort(a,i+1,h);
		}
	}
	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
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
		
		quicksort(a,0,a.size()-1);
		int size = a.size();
		for(int h = 0 ; h < size;h++)
		{
			System.out.println(a.get(h));
		}
		
		
		
		
	}
}