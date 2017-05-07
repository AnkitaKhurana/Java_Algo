import java.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Bubble_Sort {

	public static void swap(ArrayList<Integer> a , int i , int j)
	{
		int temp = (int )a.get(i);
		a.set(i,a.get(j));
		a.set(j,temp);
		
	}
	
	public static void bub(ArrayList<Integer> a , int size)
	{
	
		int flag = 0 ;
		int n = size ;
		for (int i = 0 ; i < size-1  ; i ++ )
		{
			//if(flag==0)
			for ( int h = 0 ; h  < n-i-1  ; h ++)
			{
				if(a.get(h)>a.get(h+1))
					{swap(a,h,h+1);
					flag++;
					}
				
			}
			if(flag == 0 )
				break;
			
		}
		
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		bub(a,a.size());
		
		
		for ( int k = 0 ; k < a.size(); k ++)
		{
			System.out.println(a.get(k));
		}
		
		
	}
}
