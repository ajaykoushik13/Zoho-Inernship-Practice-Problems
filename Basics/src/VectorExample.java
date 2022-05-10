
import java.util.Vector;

public class VectorExample{

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<Integer>();
		System.out.println("The initial size of the Vector = " + vec.size());
		System.out.println();
		vec.add(11);
		vec.add(18);
		vec.add(1);
		vec.add(87);
		vec.add(19);
		vec.add(11);
		System.out.println("The Vector vec : ");
		System.out.println(vec);
		System.out.println("Size of vec : " + vec.size());
		System.out.println();
		vec.remove(2);
		System.out.println("The Vector vec after removing element at 2 : ");
		System.out.println(vec);
		System.out.println();
		vec.clear();
		System.out.println("The Vector vec after using clear : ");
		System.out.println(vec);
	}

}
