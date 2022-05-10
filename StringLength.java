//Write a program to find given string length

class StringLength{
	public static void main(String args[])
	{
		String str = "Write a program to find given string length";
		int length;
		length = 0;
		char [] ch = str.toCharArray();
		for(char c : ch)
			length += 1;
		System.out.println(length);
	}
}