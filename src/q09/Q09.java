package q09;

import java.util.ArrayList;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> ae = new ArrayList<>();
		
		ae.add(new Employee(1,"pranav",0));
		ae.add(new Employee(2, "medha", 1));
		ae.add(new Employee(3,"deepa",1));
		ae.add(new Employee(4,"priyanka",2));
		ae.add(new Employee(5,"sonal",3));
		
		for(int i=0;i<ae.size();i++)
		{
			Employee e1 = ae.get(i);
			for(int j=0;j<ae.size();j++)
			{
				Employee e2 = ae.get(j);
				if(e1.getMid()==e2.getEid())
				{
					System.out.println(e2.getEname()+" is a manager of "+e1.getEname());
					break;
				}
				else if(e1.getMid()==0)
				{
					System.out.println(e1.getEname()+" sir is head of company");
					break;
				}
			}
		}
		
	}
}
