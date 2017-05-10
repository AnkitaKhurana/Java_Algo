import java.util.Scanner;
public class Shell_Sort {

	private int a[];
	private int size ;
	
	public void get ()
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Total Numbers :");
		this.size = sc.nextInt();
		a = new int[size];
		for(int i = 0 ; i < size ; i ++)
			{
						a[i]=sc.nextInt();
			}
	}
	public void sort ()
	{
		int right ;
		for ( int gap = size/2 ; gap> 0 ; gap = gap / 2)
		{
			for ( int i = gap  ; i < size ; i ++)
			{
				int var = a[i];
				for (  right = i ; right >=gap  ; )
				{
					if(a[right-gap]>var  )
					{	a[right]= a[right-gap];
					
						right = right - gap;
					}	
					else 
						break;
				}
				a[right]= var ;
			}
		}
		
		
	}
	public void display()
	{
		for(int h = 0 ; h < size ; h ++)
			System.out.println(a[h]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shell_Sort s = new Shell_Sort();
		s.get();
		s.sort();
		s.display();
		
		
	}

}
