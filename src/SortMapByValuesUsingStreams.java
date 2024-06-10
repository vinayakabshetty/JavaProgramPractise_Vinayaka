import java.util.HashMap;
import java.util.Map;

public class SortMapByValuesUsingStreams {

	public static void main(String[] args) {
		// Creating a hashmap (fruit name -> key, price -> value)
		HashMap<String, Integer> hashmap = new HashMap<>();

		// Inserting elements
		hashmap.put("A", 10);
		hashmap.put("B", 50);
		hashmap.put("C", 100);
		hashmap.put("D", 150);
		hashmap.put("E", 75);
		hashmap.put("F", 25);

		// Using forEach loop to print the elements
		// Before sorting
		System.out.println("The original array before sorting:");
		System.out.println(hashmap.entrySet());


		// Sorting in the reversed order
		System.out.println("\nAfter sorting in increasing order of their prices:");
		hashmap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
				.forEach((str) -> System.out.println(str.getKey() + " -> " + str.getValue()));
	}

}
