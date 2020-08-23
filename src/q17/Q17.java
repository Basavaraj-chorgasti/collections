package q17;

import java.util.ArrayList;
import java.util.HashMap;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> all = new ArrayList<>();
		all.add("a+2");
		all.add("b+2");
		all.add("c+23");
		all.add("d+12");
		all.add("a+123");
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i=0;i<all.size();i++)
		{
			String s1[] = all.get(i).split("\\+");
			
			int d = Integer.parseInt(s1[1]);
			if(hm.containsKey(s1[0]))
			{
				int j = hm.get(s1[0]);
				j=j+d;
				hm.put(s1[0], j);
			}
			else
			{
				
				hm.put(s1[0], d);
			}
		}
		System.out.println(hm);
				
	}

}
