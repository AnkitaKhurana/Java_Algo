import java.util.Scanner;

public class PigeonHole_Sort {

	private int a[];
	private int size ;
	private int min ;
	private int max;
	Scanner s ;
	PigeonHole_Sort()
	{
		s = new Scanner(System.in);
		System.out.println("Enter the Size of array : ");
		size = s.nextInt();
		a  = new int[size];
		min= Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		System.out.println("Now Enter Array ");
		for(int i = 0 ; i < size ; i ++)
		{
			a[i]=s.nextInt();
			if(a[i]<min)
				min = a[i];
			if(a[i]>max)
				max = a[i];
		}
		
	}
	
	public void display()
	{
		for(int h = 0 ; h < size ; h ++)
		{
			System.out.println(a[h]);
			
		}
	}
	private void sort()

	{
		int range = max - min+ 1;
		int[] holes = new int[range];
		
		for(int i = 0 ; i < size ; i++)
		{
			holes[a[i]-min]++;
		}
		int index1,j;
	
		for(j = 0, index1 = 0 ; j < range&&index1<size ; j ++)
		{
			while(holes[j]!=0)
			{
				a[index1]= j + min;
			  index1++;
			  holes[j]--;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	PigeonHole_Sort p  = new PigeonHole_Sort();
	p.sort();
	p.display();
		
		
	}

}
