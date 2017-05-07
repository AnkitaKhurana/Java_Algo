import java.util.*;

public class Selection_Sort {

	public static void swap(ArrayList<Integer> a , int i , int j)
	{
		int temp = (int )a.get(i);
		a.set(i,a.get(j));
		a.set(j,temp);
		
	}
	
	public static void sel(ArrayList<Integer> a , int size)
	{
		for ( int i = 0 ;  i< size ; i ++)
			for ( int j = i+1 ; j < size ; j ++)
			{
				
				if((int )a.get(i)>(int)a.get(j))
					swap(a,i,j);
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
		
		sel(a,a.size());
		
		
		for ( int k = 0 ; k < a.size(); k ++)
		{
			System.out.println(a.get(k));
		}
		
		
	}

}
