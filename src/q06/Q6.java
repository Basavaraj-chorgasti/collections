
/*"WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
Map where key will be marks and value will be List of RollNos where all those students
 who have same marks are together."
*/

package q06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q6 {
	public static void main(String[] args) {
		HashSet<Studmarks> ss=new HashSet<>();
		ss.add(new Studmarks(101, "nutan", 80));
		ss.add(new Studmarks(102, "Basavraj", 80));
		ss.add(new Studmarks(103, "renu", 75));
		ss.add(new Studmarks(104, "roshan", 75));
		ss.add(new Studmarks(105, "Atul", 60));
		
		HashMap<Integer, List<Integer>> hs=new HashMap<>();
		for(Studmarks s:ss) 
		{
			int id=s.getSid();
			int marks=s.getMarks();
			if(hs.containsKey(marks)) 
			{
				List<Integer> ls=hs.get(marks);
				ls.add(id);
			}
			else 
			{
				ArrayList< Integer> al=new ArrayList<>();
				al.add(id);
				hs.put(marks,al);
			}
		}
		
		System.out.println(hs);
	}

}
