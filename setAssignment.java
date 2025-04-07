//2) Create a set of 5 subjects, add a duplicate, and check if a specific subject exists in the set.
import java.util.HashSet;
import java.util.Set;
public class setAssignment {

	public static void main(String[] args) {
		//creating a set
		Set<String> subjects= new HashSet<String>();	
		subjects.add("physics");
		subjects.add("biology");
		subjects.add("english");
		subjects.add("math");
		subjects.add("chemistry");
		
		//printing existing students after adding dublicate
		subjects.add("physics");
		System.out.println(subjects);
		
		//checking if certain subjects exists or not
		System.out.println(subjects.contains("math"));	
	}
}
