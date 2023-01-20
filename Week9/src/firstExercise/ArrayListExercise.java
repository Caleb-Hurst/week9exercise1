package firstExercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		ArrayListExercise arrayListExercise = new ArrayListExercise();
		List<String> chores = arrayListExercise.createArray();
		arrayListExercise.addChore(chores, "Wash Dishes");
		arrayListExercise.addChore(chores, "Fold Laundry");
		arrayListExercise.addChore(chores, "Code All Day");
		arrayListExercise.print(chores);
		arrayListExercise.removeChore(chores, "Wash Dishes");
		arrayListExercise.print(chores);
		arrayListExercise.updatedArray(chores, "Code for an hour",1);
		arrayListExercise.print(chores);
	}

	private List<String> createArray() {
		List<String> chores = new ArrayList<String>();
		return chores;
	}

	private void addChore(List<String> chores, String chore) {
		chores.add(chore);
	}

	private void print(List<String> chores) {
		for (String chore : chores) {
			System.out.println(chore);
		}
		System.out.println("");
		System.out.println("-------");
		System.out.println("");
	}

	private void updatedArray(List<String> chores, String chore, int a) {
		chores.set(a, chore);

	}

	private void removeChore(List<String> chores, String chore) {
		chores.remove(0);
	}
}
