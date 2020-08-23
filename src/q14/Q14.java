package q14;

import java.util.LinkedList;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		LinkedList<Integer> l3 = new LinkedList<>();
		
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l2.add(11);
		l2.add(12);
		l2.add(13);
		l2.add(14);
		l2.add(15);
		l2.add(16);
		l2.add(17);
		int i;
		for(i = 0; i < l1.size() && i < l2.size() ;i++)
		{
			l3.add(l1.get(i));
			l3.add(l2.get(i));
		}
		
		if(l2.size() > l1.size())
		{
			for( ; i < l2.size();i++)
			{
				l3.add(l2.get(i));
			}
		}
		else if(l1.size() > l2.size())
		{
			for( ; i < l1.size();i++)
			{
				l3.add(l1.get(i));
				
			}
		}
		
		System.out.println();
		
		for(i = 0; i< l3.size();i++)
		{
			System.out.print(l3.get(i) + " ");
		}


	}

}
