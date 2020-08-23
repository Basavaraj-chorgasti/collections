package q16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;



public class Q16{
	
	public static void main(String ar[])
	{
		ArrayList<Test> al = new ArrayList<>();
		//int[] a = {12,34,56,78};
		al.add(new Test(1,1,new int[] {12,34,45,67}));
		al.add(new Test(2,2,new int[] {12,33,32,56}));
		al.add(new Test(1,1,new int[] {23,78,67,65}));
		al.add(new Test(1,1,new int[] {34,64,85,37}));
		al.add(new Test(1,1,new int[] {72,84,65,27}));
		
		HashSet<Student> hs = new HashSet<>();
		
 		for(int i=0;i<al.size();i++)
		{
 			Test t = al.get(i);
			int[] a = t.getMark();
			int sum = 0;
			for(int j=0;j<a.length;j++)
			{
				sum = sum+a[j];
			}
			hs.add(new Student(t.getSid(),sum));
		}
		
		
		System.out.println(hs);
		
		ArrayList<Student> as = new ArrayList<>(hs);
		
		Collections.sort(as);
		Collections.reverse(as);
		
		System.out.println(as);
		
		
		
	
	}

	
}
