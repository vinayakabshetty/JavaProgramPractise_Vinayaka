import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingImplementation {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student("Vinayaka", 25);
		Student s2 = new Student("Pooja", 75);
		Student s3 = new Student("Rakesh", 50);
		Student s4 = new Student("Deepika", 125);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("*********** Before sorting ***************");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getMarks());
		}
		
		Comparator comp = new SortStudentByMarks();
		Collections.sort(list, comp);
		
		System.out.println("*********** After sorting ***************");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getMarks());
		}
	}

}
