package main;

public class Examples {

	// Main method, always required
	public static void main(String[] args) {
		basics();
		variables();
		classes();
	}

	public static void basics() {
		// for-loop
		for (int i = 0; i < 20; i++) {
		}
		// looping through a collection
		String array[] = { "A", "B", "C" };
		for (String str : array) {
			System.out.println(str);
		}
	}

	public static void variables() {

	}

	public static void classes() {
		Box box = new Box(20);
		box.size = Box.Size.MEDIUM;
		System.out.println(box.getWeight());
	}

}


// Example class
class Box {
	enum Size {
		SMALL, MEDIUM, LARGE
	}

	Size size;
	private int weight;

	// Constructor
	public Box(int weight) {
		this.weight = weight;
		incrWt();
	}

	/*	METHOD TYPES
	 * 		> Visible in - 	Class Package Subclass World
	 * 		public				Y		Y		 Y	   Y	
	 * 		private				Y		N		 N	   N
	 * 		protected			Y		Y		 Y	   N
	 * 		no modifier			Y		Y		 N	   N
	 */

	public int getWeight() {
		return this.weight;
	}

	private void incrWt() {
		this.weight += 1;
	}
}

