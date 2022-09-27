import java.util.Scanner;
 
public class MinimumElement 
{
 
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		readInteger();
		readElements(readInteger());
		System.out.println(findMin(readElements(readInteger())));
	}
 
	private static int readInteger() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of member");
		int number = scanner.nextInt();
		return number;
	}
 
	private static int[] readElements(int number) 
	{
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[number];
		System.out.println("Please enter the number up to " + number);
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}
 
	private static int findMin(int[] array) 
	{
		int min = Integer.MAX_VALUE;
 
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}