//Write a program to sorting (Ascending order) given Array

class SortAscending{
public static void main(String args[])
{
	int arr[] = {2,45,34,89,674,773,2,45,23};
	int temp;
	int length;
	length = arr.length;
	temp = 0 ;
	for(int i = 0 ; i < length; i += 1)
	{
		for(int j = i + 1; j < length; j += 1)
		{
		if(arr[i] > arr[j])
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;	
		}
		}
	}
	for(int x : arr)
		System.out.print(x + " ");
}
}