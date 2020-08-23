package q03;
import java.util.ArrayList;
/*"Given a linked list of integers , find out number of missing elements in linked list. E.g. list
contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } . missing
elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list."
*/
import java.util.LinkedList;

public class Q3 {
	public static void main(String[] args) 
	{
		LinkedList<Integer> l=new LinkedList<>();
		l.add(3);
		l.add(13);
		l.add(7);
		l.add(2);
		System.out.println(l);
		ArrayList<Integer> al=new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<l.size();i++)
		{
			if(max<l.get(i))
			{
				max = l.get(i);
			}
			if(min>l.get(i))
			{
				min = l.get(i);
			}
		}
		System.out.println(max + "  "+min);	
		for(int i=min;i<=max;i++)
		{
			if(!(l.contains(i)))
			{
				al.add(i);
			}
		}
		
		System.out.println(al);
	}

}
