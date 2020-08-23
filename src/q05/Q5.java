package q05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> al = new ArrayList<>();
		al.add(new Customer(1,"atish",new int[]{1,2,3}));
		al.add(new Customer(2,"ankur",new int[]{4,2}));
		al.add(new Customer(3,"amey",new int[]{1}));
		al.add(new Customer(1,"atish",new int[]{4,5,3}));
		al.add(new Customer(5,"amit",new int[]{1,2,3,4,8}));
		
		HashSet<Customer> hs = new HashSet<>();
	
		for(int i=0;i<al.size();i++)
		{
			Customer c = al.get(i);
			int[] a = c.getItems();
			int[] a1 = null;
			if(hs.contains(c))
			{
				//System.out.println(" dfghj");
				Iterator<Customer> itr = hs.iterator();
				while(itr.hasNext())
				{
					Customer c1=itr.next();
					//System.out.println("sdfghfd");
					if(c.getCid()==c1.getCid())
					{
						//System.out.println("sdfgvdfgv");
						a1 = c1.getItems();
						//System.out.println(a1);
						break;
					}
				}
				hs.remove(c);
				int[] a2 = new int[a1.length+a.length];
				int ct=0;
			for(Integer j:a1)
			{
				System.out.println(j);
				a2[ct++] = j;
			}
			for(Integer j:a)
			{
				a2[ct++] = j;
			}	
			hs.add(new Customer(c.getCid(),c.getCname(),a2));
			}
			else
			{
				hs.add(c);
			}
		}
		System.out.println(hs);
		ArrayList<Customer> ac = new ArrayList<>(hs);
		Collections.sort(ac,Collections.reverseOrder());
		System.out.println(ac);
	}

}
