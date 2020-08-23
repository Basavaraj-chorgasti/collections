package q04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;


public class Q4 {
	public static void main(String[] args) 
	{
		HashMap<StudCourse, Integer> hm=new HashMap<>();
		hm.put(new StudCourse(1,"atish","java"), 75);
		hm.put(new StudCourse(2,"rahul","java"), 70);
		hm.put(new StudCourse(3,"aksahay","angular"), 60);
		hm.put(new StudCourse(4,"basavaraj","angular"), 75);
		hm.put(new StudCourse(5,"roshan","java"), 45);
		hm.put(new StudCourse(6,"abhinav","angular"), 50);
		HashSet<StudCourse> java=new HashSet<>();
		HashSet<StudCourse> angular=new HashSet<>();
		Set<Entry<StudCourse,Integer>> s=hm.entrySet();
		for(Entry<StudCourse,Integer> ob:s) 
		{
			String cname=ob.getKey().getCourse();
			int marks=ob.getValue();
			if(cname.equals("java")&& marks>=50) {
                 java.add(ob.getKey());				
			}
			if(cname.equals("angular") && marks>=60) {
				angular.add(ob.getKey());
			}
			
		}
		System.out.println(java);
		System.out.println(angular);
		
	}

}
