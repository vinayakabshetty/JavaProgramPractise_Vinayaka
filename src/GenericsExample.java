import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		GenericClassPrintMessage<Integer> print = new GenericClassPrintMessage<>(1);
		print.msg();
		
		// Array of Objects
		ArrayList<Object> al = new ArrayList<Object>();
		
		// Object class hierarchy - open declaration of .equals method 
		//ge.equals(ge);
		
		List<Object> intList = new ArrayList<>();
		
	}

}
