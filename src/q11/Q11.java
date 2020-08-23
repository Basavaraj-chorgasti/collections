package q11;

import java.util.ArrayList;
import java.util.HashMap;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		ArrayList<Order> al = new ArrayList<>();
		al.add(new Order(80,"Pav Bhajee",120.00,5));
		al.add(new Order(90,"Grilled Sandwitch",72.00,10));
		al.add(new Order(92,"Hakka Noodles",220.00,2));
		al.add(new Order(96,"Pav Bhajee",125.00,8));
		al.add(new Order(101,"Grilled Sandwitch",70.00,2));
		
		HashMap<String, Double> hm = new HashMap<>();
		
		for(int i=0;i<al.size();i++)
		{
			Order o = al.get(i);
			if(hm.containsKey(o.getOname()))
			{
				double d = hm.get(o.getOname());
				d = d+(o.getPrice()*o.getQty());
				hm.put(o.getOname(), d);
			}
			else 
			{
				double d = o.getPrice()*o.getQty();
				hm.put(o.getOname(), d);
			}
		}
		System.out.println(hm);
	}

}
