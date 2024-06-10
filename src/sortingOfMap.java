import java.util.*;

public class sortingOfMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("E", 35);
		map.put("C", 10);
		map.put("D", 150);
		map.put("A", 100);
		map.put("B", 55);
		map.put("F", 25);
		System.out.println("Values in map is "+map.entrySet()+"\n");
		
		System.out.println("*** Sorting map by value ***");
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		
		list.forEach((fruit)->System.out.println(fruit.getKey() + " -> " + fruit.getValue()));
	}
}