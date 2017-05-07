import java.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Insertion_Sort {

	public static void swap(ArrayList<Integer> a , int i , int j)
	{
		int temp = (int )a.get(i);
		a.set(i,a.get(j));
		a.set(j,temp);
		
	}
	
	public static void ins(ArrayList<Integer> a , int size)
	{
		int j ;
		for(int i = 1 ; i < size ; i++)
		{
			int num = a.get(i);
			j = i - 1 ; 
			while(j>=0&&a.get(j)>num)
			{
				swap(a,j,j+1);
				j = j - 1;
			}
			a.set(j+1,num);
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
		
		ins(a,a.size());
		
		
		for ( int k = 0 ; k < a.size(); k ++)
		{
			System.out.println(a.get(k));
		}
		
		
	}
}