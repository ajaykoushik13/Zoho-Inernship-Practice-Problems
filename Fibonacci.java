//Write a program to print the Fibonacci series  

class Fibonacci{
	public static void main(String args[])
	{
		int num;
		num = 10;
		int n1;
		int n2;
		int n3;
		n1 = 0;
		n2 = 1;
		System.out.print(n1 + " " +n2);
		for(int i = 2 ; i < num; i += 1)
		{
		n3 = n1 + n2;
		System.out.print(" " + n3);
		n1 = n2;
		n2 = n3;
		}
	}
}
		