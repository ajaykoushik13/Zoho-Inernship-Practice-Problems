//Write a program to find biggest number in a given Array

class BiggestNum{
public static void main(String args[])
{
int arr[] = { 1,21,4,45,172,245,3};
int large;
large = arr[0];
for(int x : arr)
{
if(x > large)
large = x;
}
System.out.println(large);
}
}
