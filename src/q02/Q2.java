package q02;
import java.util.ArrayList;
/*"Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in
same order in hashmap. E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {
“mno” ,2}
Given list is (“rst”) (“abc”) so it appears in same order. Output should be “true”
If given list is (“abc” ) (“pqr” ) then output should be “false”"
*/
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Q2 {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lm=new LinkedHashMap<>();
		lm.put("pqr", 12);
		lm.put("rst", 43);
		lm.put("abc", 4);
		lm.put("mno", 2);
		ArrayList<String> a = new ArrayList<>();
		for(String s:lm.keySet())
		{
			a.add(s);
		}
		ArrayList<String> al=new ArrayList<>();
		al.add("abc");
		al.add("mno");
		
		for(int i=0;i<al.size()-1;i++)
		{
			for(int j = 0;j<a.size()-1;j++)
			{
				if(al.get(i).equals(a.get(j)))
				{
					if(al.get(i+1).equals(a.get(j+1)))
					{
						System.out.println("true");
						break;
					}
					else
					{
						System.out.println("false");
						break;
					}
				}
			}
			
					
		}
	
	}
}
