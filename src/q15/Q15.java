package q15;

import java.util.ArrayList;
import java.util.HashMap;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Member> am= new ArrayList<>();
		
		am.add(new Member(1,"A1001","atish"));
		am.add(new Member(1,"A1002","atul"));
		am.add(new Member(1,"A1002","amit"));
		am.add(new Member(1,"A1001","abhishek"));
		am.add(new Member(1,"B1001","basavaraj"));
		am.add(new Member(1,"B1001","vaishnavi"));
		
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		
		for(int i=0;i<am.size();i++)
		{
			Member m = am.get(i);
			if(hm.containsKey(m.getWingFlat_no()))
			{
				ArrayList al = hm.get(m.getWingFlat_no());
				al.add(m.getName());
				hm.put(m.getWingFlat_no(), al);
			}
			else 
			{
				ArrayList<String> al = new ArrayList<>();
				al.add(m.getName());
				hm.put(m.getWingFlat_no(), al);
			}
		}
		System.out.println(hm);
				
	}

}
