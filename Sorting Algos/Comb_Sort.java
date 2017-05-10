import java.util.Scanner;
public class Comb_Sort {

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
	private void swap ( int i , int j )
	{
		int temp;
		temp = a[i];
		a[i]= a[j];
		a[j]=temp;
	}
	public void sort ()
	{
		int gap = (int) (size / 1.3);
		
		boolean flag = true;
		for ( int g = gap ; g >=1||flag==true; g = (int) (g*10/13))
		for ( int i = 0 ; (i+g)<size  ; i++ )
		{
			flag = false;
			if(a[i]>a[i+g])
				{swap(i,i+g);
				flag = true;
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
		Comb_Sort s = new Comb_Sort();
		s.get();
		s.sort();
		s.display();
		
		
	}

}
