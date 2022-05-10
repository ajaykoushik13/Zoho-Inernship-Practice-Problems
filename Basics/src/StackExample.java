
import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Stack");
		stack.push("a");
		stack.push("is");
		stack.push("This");
		System.out.println("The size of the Stack is : " + stack.size());
		
		System.out.println("\nThe elements of the stack are : ");
		String temp;
		int num = stack.size();
		for(int i = 1; i <= num; i++)
		{
			temp = stack.peek();
			System.out.print(temp + " ");
			stack.pop();

		}
		
	}

}
