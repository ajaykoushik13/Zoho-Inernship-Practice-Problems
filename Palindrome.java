//Write a program to find the given string is Palindrome or not

class Palindrome{
	public static void main(String args[])
	{
		String str = "malayalam";
		String rev = "";
		int strlen = str.length();
		for( int i = strlen - 1; i >= 0 ; i  -= 1)
		rev += str.charAt(i) ;
		if(str.equals(rev))
		System.out.println("The given String is Palindrome");
		else
		System.out.println("The given String is not a Palindrome");
	}
}