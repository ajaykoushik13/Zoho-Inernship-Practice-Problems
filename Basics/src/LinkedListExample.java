
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("This");
		ll.add("is");
		ll.add("a");
		ll.add("LinkedList");
		System.out.println("The contents of ll : ");
		for(int i = 0; i < ll.size(); i++)
		{
			System.out.print(ll.get(i) + " ");
		}
		ll.remove(0);
		ll.remove(1);
		System.out.println("\n\nThe contents of ll after remove operation : ");
		for(int i = 0; i < ll.size(); i++)
		{
			System.out.print(ll.get(i) + " ");
		}
		
	}

}
