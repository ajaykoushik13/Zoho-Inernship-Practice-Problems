//Write a program to sorting String array

class StringArraySort{
	public static void main(String args[])
	{
		String []names = {"ram" , "gopi" , "jeeva" , "vicky"};
		String temp;
		int arr_length;
		arr_length = names.length;
		for(int i = 0 ; i < arr_length  - 1 ; i += 1)
		{
		for(int j = i + 1; j < arr_length ; j += 1)
		{
			if((names[i].compareTo(names[j])) > 0)
			{
			temp = names[i];
			names[i] = names[j];
			names[j] = temp;
			}
		}
		}
		for(String x : names)
			System.out.print(x + " ");
	}
}