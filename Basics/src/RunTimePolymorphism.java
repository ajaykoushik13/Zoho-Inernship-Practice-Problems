class Method1 {
	public void method()
	{
		System.out.println("Method 1");
	}
}
class Method2 extends Method1{
	public void method()
	{
		System.out.println("Method 2");
	}
}
public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		Method1 m = new Method2();
		m.method();
	}

}




