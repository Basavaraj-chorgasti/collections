package q12;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("1234432156788765", "BJP");
		hm.put("3234432156788765", "SHIVSENA");
		hm.put("4234452156788765", "NCP");
		hm.put("5234462156788765", "CONGRESS");
		hm.put("6234423456788765", "OTHERS");
		hm.put("7234422156788765", "BJP");
		hm.put("7234482156788765", "SHIVSENA");
		hm.put("8234402156788765", "NCP");
		hm.put("9234412156788765", "CONGRESS");
		hm.put("2232342156788765", "OTHERS");
		hm.put("1234462156788765", "BJP");
		hm.put("2234472156788765", "NCP");
		hm.put("8234442156788765", "SHIVSENA");
		hm.put("4234234r56788765", "OTHERS");
		hm.put("5234472156788765", "NCP");
		hm.put("6234492156788765", "BJP");
		hm.put("6234442156788765", "CONGRESS");
		hm.put("6234482156788765", "BJP");
		hm.put("7234480156788765", "SHIVSENA");
		hm.put("7234432156788765", "NCP");
		
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		
		Set<Entry<String, String>> ss = hm.entrySet();
		for(Entry<String, String> e:ss)
		{
			if(hm1.containsKey(e.getValue()))
			{
				int i=hm1.get(e.getValue());
				i++;
				hm1.put(e.getValue(), i);
			}
			else
			{
				hm1.put(e.getValue(), 1);
			}
		}
		Set<Entry<String, Integer>> s= hm1.entrySet();
		for(Entry<String, Integer> e:s)
		{
			System.out.println(e.getKey()+"  no of voters are  "+e.getValue());
		}
		
		
	}

}
