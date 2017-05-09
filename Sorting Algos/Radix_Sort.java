import java.util.ArrayList;

import java.util.Scanner;

public class Radix_Sort {

	private ArrayList<Integer> a ;
	private int size ;
	
	
	public void print()
	{
		for(int i = 0 ; i < size;i++)
			System.out.println(a.get(i));
		
	}
	
	
	public void sort()
	{
		
		ArrayList<Integer>[] bucket = new ArrayList[10];
		for ( int i = 0 ; i < 10 ; i ++)
		{
			bucket[i]= new ArrayList<Integer>();
		}
		boolean flag = false;
		int divisor = 1 ;
		int tmp ;
		while(!flag)
		{
			flag = true ;
			
			for(Integer i : a )
			{
				tmp = i / divisor ;
				bucket[tmp%10].add(i);
				
				if(flag&& tmp>0)
				{
					flag = false;
				}
				
			}
			int i = 0 ;
		for(int y = 0 ; y < 10 ; y ++)
		{
			for ( Integer f : bucket[y])
			{
				a.set(i, f);
				i++;
			}
			bucket[y].clear();
		}
			
			
			divisor = divisor *10;
		}
		
		
		
		
		
		
		
		
	}
	public int getArray()
	{
		
		a = new ArrayList();
		a.clear();
		System.out.println("How many numbers you want to add?");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		int max= Integer.MIN_VALUE,temp;
		for ( int i = 0 ; i < size; i ++)
		{
			
			temp = s.nextInt();
			a.add(temp);
			
			if(temp > max)
				max = temp;
			
		}
		
		return max;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Radix_Sort r = new Radix_Sort();
		int max = r.getArray();
		
		r.sort();
		r.print();
		
	}

}
