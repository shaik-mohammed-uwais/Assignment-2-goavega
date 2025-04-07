// 1) Create a list of 5 student names. Add a new name at the second position, remove the 4th

import java.util.HashMap;
import java.util.Map;

public class hashmapAssignment {

	public static void main(String[] args) {
		//creating a hashmap
		Map<String, Integer> marksdata=new HashMap<String, Integer>();
		marksdata.put("uwais", 70);
		marksdata.put("shaik", 80);
		marksdata.put("ronaldo", 40);
		marksdata.put("palmer", 60);
		marksdata.put("isak", 90);
		
		//update the marksdata
		marksdata.replace("uwais", 90);
		System.out.println(marksdata);
		
		//after removing shaik
		marksdata.remove("shaik");
		System.out.println(marksdata);	
	}
}
