package q01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		Book b=new Book(1,"john",120.55);
		Book b1=new Book(2,"Smith",550.50);
		Book b2=new Book(3,"Balguruswamy",650.55);
		Book b3=new Book(4,"Jodern",320.55);
		Book b4=new Book(5,"james",850.55);
		ArrayList<Booksale> bs=new ArrayList<>();
		bs.add(new Booksale(b, 10));
		bs.add(new Booksale(b1, 5));
		bs.add(new Booksale(b2, 15));
		bs.add(new Booksale(b3, 10));
		bs.add(new Booksale(b, 5));
		bs.add(new Booksale(b1, 4));
		
		HashMap<Integer,Double> hm=new HashMap<>();
		
		for(Booksale s:bs) {
			int bid=s.getB().getBid();
			double amt=s.getB().getPrice();
			int copies=s.getCopisold();
			double total_amt=amt*copies;
			if(hm.containsKey(bid)) {
				double d=hm.get(bid);
				d=d+total_amt;
				hm.put(bid, d);
			}
			else {
				hm.put(bid, total_amt);
			}
		}
		
	
	System.out.println(bs);
	System.out.println(hm);
	}
}

