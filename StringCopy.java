//Write a program  to  Copy a String to another

class StringCopy{
	public static void main(String args[])
	{
	String str = "Hello World!";
	String copy_str="" ;
	for(int i = 0 ; i < str.length(); i += 1)
	{
	copy_str  += str.charAt(i);
	}
	System.out.println(copy_str);
	}
}