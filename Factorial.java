class Factorial{
	public static void main(String args[])
	{
		int num;
		int fact_num;
		num = 5;
		fact_num = 1;
		for(int i = 1 ; i <= num; i += 1)
			fact_num *= i;
		System.out.println(fact_num);
	}
}