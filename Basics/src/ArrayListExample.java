import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(12);
        arr.add(25);
        arr.add(19);
        arr.add(11);
        arr.add(3);
        System.out.println(arr);
        arr.remove(1);
        arr.remove(4);
        System.out.println(arr);
        if(arr.contains(25))
        {
            System.out.println("The ArrayList contains 25");
        }
        else
        {
            System.out.println("No such element exists");
        }
        int elementAt1 = arr.get(1);
        System.out.println("The Element at index 1 now is " + elementAt1);     
    }
 
}