import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "This");
		hashMap.put(2, "is");
		hashMap.put(3, "HashMap");
		System.out.println("Contents of hashMap : ");
		System.out.print(hashMap.entrySet());
		hashMap.put(3, "Duplicate");
		hashMap.put(4, "This");
		System.out.println("\nContents of hashMap after adding duplicate : ");
		System.out.print(hashMap.entrySet());
    }

}
