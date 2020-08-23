package q18;

import java.util.ArrayList;

public class Q18 {
	
	public static int mi(String s)
	{
		ArrayList<String> al = new ArrayList<>();
				al.add("A+2");
				al.add("B+1");al.add("C+3");al.add("D+4");al.add("A+3");
				int flag = 0;
				for(int i = 0;i<al.size();i++)
				{
					String s1[] = al.get(i).split("\\+");
					if(s1[0].equalsIgnoreCase(s))
					{
						int p = Integer.parseInt(s1[1]);
						return p;
					}
				}
				return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Q18.mi("g"));

	}

}
