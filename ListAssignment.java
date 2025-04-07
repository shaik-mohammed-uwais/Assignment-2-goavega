//3) Create a map of students and their grades, update a grade, remove a student, and print the map.
import java.util.ArrayList;

public class ListAssignment {

	public static void main(String[] args) {
		
		//creating a arraylist 
		ArrayList<String> students=new ArrayList<String>();
		
		students.add("ronaldo");
		students.add("ozil");
		students.add("hazard");
		students.add("bale");
		students.add("benzima");
		
		//printing all the existing stundents
		System.out.println(students);
		
		// updating student at 2nd position from "hazard" to "zidane"
		students.add(2, "zidane");
		
		//printing after update
		System.out.println(students);
		
		//removing the last element
		students.remove(3);
		System.out.println(students);
	}
}
