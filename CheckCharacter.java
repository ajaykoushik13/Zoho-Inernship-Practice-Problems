//Write a program to check the input character for uppercase, lowercase, no. of digits and Special chars
class CheckCharacter{
	public static void main(String []args)
	{
		char input = '$';
		if((input >= 65) && (input <= 90))
		System.out.println("Uppercase Character");
		else if((input >= 97) && (input <= 122))
		System.out.println("Lowercase Character");
		else if((input >=48) && (input <= 57))
		System.out.println("Digits");
		else
		System.out.println("Special Character");
	}
}