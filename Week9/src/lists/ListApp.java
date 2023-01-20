package lists;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		
		
		List<String> elements = new ArrayList<String>();
			elements.add("caleb hurst");
			elements.add("john doe");
			elements.add("jane doe");
			elements.add("elon musk"); 
			printArrayLst(elements);
			
			elements.remove(1); //removes item 2 from the list
			printArrayLst(elements);

	}

	private static void printArrayLst(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
	}

}
