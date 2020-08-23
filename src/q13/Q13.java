package q13;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			LinkedHashSet<Student> lhs1 = new LinkedHashSet<>();
			LinkedHashSet<Student> lhs2 = new LinkedHashSet<>();
			
			lhs1.add(new Student(1,"atish"));
			lhs1.add(new Student(2,"nutan"));
			lhs1.add(new Student(3,"basavaraj"));
			lhs1.add(new Student(4,"amit"));
			
			lhs2.add(new Student(1,"atish"));
			lhs2.add(new Student(4,"amit"));
			lhs2.add(new Student(3,"basavaraj"));
			lhs2.add(new Student(2,"nutan"));
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println(" enter the student id: ");
			int n = sc.nextInt();
			int pos=0;
			int pos1= 0;
			Iterator<Student> itr = lhs1.iterator();
			Iterator<Student> i = lhs2.iterator();
			int c=0,d=0;
			while(itr.hasNext())
			{
				Student s = itr.next();
				c++;
				if(n==s.getSid())
				{
					pos = c;
				}
			}
			
			while(i.hasNext())
			{
				Student s = i.next();
				d++;
				if(n==s.getSid())
				{
					pos1 = d;
				}
			}
			
			if(pos==pos1)
			{
				System.out.println("student are in same position");
			}
			else
			{
				System.out.println(" student are in different postion");
			}
			
			
			}
	}


