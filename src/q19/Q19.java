package q19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import q20.Player;

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student(1,"atish","bsc",2016,true));
		hs.add(new Student(2,"atul","be",2018,false));
		hs.add(new Student(3,"abhishek","bca",2019,true));
		hs.add(new Student(4,"aksahay","bcs",2020,false));
		hs.add(new Student(5,"ajay","be",2017,true));
		hs.add(new Student(6,"amit","bca",2019,false));
		
		
		ArrayList<Student> placed = new ArrayList<>();
		ArrayList<Student> unplaced = new ArrayList<>();
		
		Iterator<Student> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			Student s = itr.next();
			if(s.isPlaced())
			{
				placed.add(s);
			}
			else
			{
				unplaced.add(s);
			}
		}
		System.out.println(placed);
		System.out.println(unplaced);

	}

}
