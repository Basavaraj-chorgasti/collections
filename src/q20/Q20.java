package q20;

import java.util.ArrayList;
import java.util.TreeMap;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Player> al = new ArrayList<Player>();
		al.add(new Player(2,"watson","Australia","CSK"));
		al.add(new Player(1,"msdhoni","Australia","CSK"));
		al.add(new Player(2,"watson","Australia","CSK"));
		al.add(new Player(3,"smith","Australia","RR"));
		al.add(new Player(4,"warner","Australia","SRH"));
		al.add(new Player(5,"Finch","Australia","SRH"));
		al.add(new Player(6,"raina","india","CSK"));
		al.add(new Player(7,"rohit","india","MI"));
		//System.out.println(al);
		
		 
		TreeMap<String, Integer> tm = new TreeMap<>();
		String teamname=" ";
		int max = 0;
		for(int i=0;i<al.size();i++)
		{
			Player p = al.get(i);
			if(p.getCountry().equals("Australia"))
			{
				if(tm.containsKey(p.getTeam()))
				{
					//System.out.println("xvbnbvcdghnbvcfgbvf");
					int j = tm.get(p.getTeam());
					//System.out.println(j);
							j=j+1;
					tm.put(p.getTeam(),j);
					if(max<j)
					{
						max = j;
						teamname = p.getTeam();
					}
				}
				else {
					tm.put(p.getTeam(), 1);
				}
				
			}
		}
		//System.out.println(tm);		
		System.out.println("maximum player from "+ teamname +" team");

	}

}
