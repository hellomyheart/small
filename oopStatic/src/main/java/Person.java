
public class Person {

	// TODO

	String name;
	private static int count=0;

	public static int getCount() {
		return count;
	}

	public Person(String name) {
		this.name = name;
		count++;
	}
}
