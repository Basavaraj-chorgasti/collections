package q10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Student, List<Coursse>> hm = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the no of record to be add in a map");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			Student s = new Student();
			System.out.println(" enter the student id");
			s.setSid(sc.nextInt());
			System.out.println(" enter the student name");
			s.setSname(sc.next());
			ArrayList<Coursse> al = new ArrayList<>();
			
			System.out.println(" enter the numbers of course to be add");
			int d = sc.nextInt();
			
			for(int j=0;j<d;j++)
			{
				Coursse c = new Coursse();
				System.out.println(" enter the Course id");
				c.setCid(sc.nextInt());
				al.add(c);
			}
			
			hm.put(s, al);
		}
		System.out.println(hm);
		HashMap<Integer, List<Student>> hm1 = new HashMap<>();
		Set<Entry<Student, List<Coursse>>> s= hm.entrySet();
		for(Entry<Student, List<Coursse>> e:s)
		{
			List<Coursse> li= e.getValue();
			for(int i=0;i<li.size();i++)
			{
				Coursse c = li.get(i);
			
				if(hm1.containsKey(c.getCid()))
				{
					List<Student> as = hm1.get(c.getCid());
					as.add(e.getKey());
					hm1.put(c.getCid(), as);
				}
				
				else
				{
					ArrayList<Student> as = new ArrayList<>();
					as.add(e.getKey());
					hm1.put(c.getCid(),as);
				}
			}
		}
		Set<Entry<Integer, List<Student>>> ff= hm1.entrySet();
		System.out.println("COURSE ID___STUDENT LIST");
		for(Entry<Integer, List<Student>> e:ff)
		{
			System.out.println(e.getKey()+"        "+e.getValue());
		}

	}

}
