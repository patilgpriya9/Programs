package ArrayList;

import java.util.ArrayList;

public class GrocceryList {

	private ArrayList<String> groccerylist = new ArrayList<String>();

	public void addItem(String item) {
		groccerylist.add(item);
	}

	public void printGrocceryList() {
		System.out.println("Total items " + groccerylist.size());

		for (int i = 0; i < groccerylist.size(); i++) {

			System.out.println(i + 1 + " " + groccerylist.get(i));
		}

	}

	public void modifyGrocceryItem(int position, String newItem) {
		groccerylist.set(position, newItem);
		System.out.println("Item " + position + 1 + "modified");

	}

	public void removeGrocceryItem(int position) {

		String noItem = groccerylist.get(position);
		groccerylist.remove(position);

	}

	public int findItem(String searchItem) {

		boolean exists = groccerylist.contains(searchItem);
		int position = groccerylist.indexOf(searchItem);
		if (position >= 0) {
			return position + 1;
		}
		return 0;
	}

}
