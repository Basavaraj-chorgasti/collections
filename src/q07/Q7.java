package q07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Q7 
{
	
	public static void main(String[] args) 
	{
				
		Movie m=new Movie(101,"Tanhaji",4);
		Movie m1=new Movie(102,"Dil Bechara",5);
		Movie m2=new Movie(103,"KKKG",2);
		Movie m3=new Movie(104,"3Idiots",4);
		Movie m4=new Movie(105,"Street Dancer",3);
				
		Theatre t=new Theatre(1, "Abhiruchi", "Navale Bridge", m1);
		Theatre t1=new Theatre(2, "City Pride", "Deccan", m2);
		Theatre t2=new Theatre(3, "E-Square", "Satara Road", m3);
		Theatre t3=new Theatre(4, "Mangala", "Manapa", m4);
		Theatre t4=new Theatre(5, "Laxmi narayan", "Swargate", m);
		
		
		ArrayList<Theatre> al=new ArrayList<>();
		al.add(t);
		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		System.out.println(al);
		Comparator<Theatre> cc=new Comparator<Theatre>() 
		{
			public int compare(Theatre t1, Theatre t2) 
			{
				if(t1.getM().getRating()==t2.getM().getRating()) 
				{
				      return t1.getTheatrename().compareTo(t2.getTheatrename());
				}
				else 
				{
				       return t1.getM().getRating()-t2.getM().getRating();
				}
			};
		};
		Collections.sort(al,cc);
		Collections.reverse(al);
		System.out.println(al);

	}
}
