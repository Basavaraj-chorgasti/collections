package q08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> as = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of student");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			Student s = new Student();
			System.out.println(" enter the student id");
			s.setSid(sc.nextInt());
			System.out.println(" enter the name");
			s.setSname(sc.next());
			ArrayList<String> al = new ArrayList<>();
			System.out.println("enter the number of hobbies");
			int d = sc.nextInt();
			for(int j=0;j<d;j++)
			{	
				System.out.println("enter the hobby  "+(j+1));
				al.add(sc.next());
			}
			s.setHobby(al);
			as.add(s);
		}
		HashMap<String, List<String>> hm = new HashMap<>();
		
		for(int i=0;i<as.size();i++)
		{
			Student s = as.get(i);
			List<String> li = s.getHobby();
			for(int j=0;j<li.size();j++)
			{
				if(hm.containsKey(li.get(j)))
				{
					List<String> ls=hm.get(li.get(j));
					ls.add(s.getSname());
					hm.put(li.get(j), ls);
				}
				else 
				{
					ArrayList<String> a = new ArrayList<>();
					a.add(s.getSname());
					hm.put(li.get(j), a);
				}
			}
		}
		Set<Entry<String,List<String>>> ss = hm.entrySet();
		int max=0;
		String hobby="";
		for(Entry<String,List<String>> e:ss)
		{
			if(max<e.getValue().size())
			{
				max = e.getValue().size();
				hobby = e.getKey();
			}
		}
		
		System.out.println(as);
		System.out.println(hm);
		System.out.println(" most common hobby is:" + hobby);
		
		
		
		
		

	}

}
