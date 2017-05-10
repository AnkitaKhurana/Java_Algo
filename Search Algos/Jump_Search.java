import java.util.Scanner;

public class Jump_Search {

	private int a [];
	private int  size ;
	private int num ;
	private Scanner s ;
	Jump_Search()
	{
		s=new Scanner(System.in);
		System.out.println("Enter Number of elements ");
		size=s.nextInt();
		a = new int[size];
		
	}
	
	public void add ()
	{
		System.out.println("Enter sorted Array  ");
		for(int i = 0 ; i < size ; i++)
			a[i]=s.nextInt();
				
	}
	private void linearsearch(int index)
	{int flag = 1;
		for(int in = index ; in < size ; in++)
		{
			if(a[in]==num)
				{System.out.println("Element Found at pos : "+(in+1));
				flag = 0 ;
				}
		}
	if(flag == 1 )
		System.out.println("Element not found ! ");
	}
	public void search ( )
	{
		System.out.println("Enter Element to search ");
		num = s.nextInt();
		int jump = (int) Math.sqrt(size);
		for(int i = 0 ; i < size ; i+=jump)
		{
			if(a[i]>num)
			{
				i = i - jump ;
				linearsearch(i);
				break;
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jump_Search j = new Jump_Search();
		
		j.add();
		j.search();
		
	}

}
