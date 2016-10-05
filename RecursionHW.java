/** 
 * This method prints the integers from 
 * 0 to n both inclusive, on separate lines
 * using recursion by 
 * @param n the largest integer printed on the screen
 */
public class RecursionHW 
{
	public static void main(String[] args)
	{
		printNum(5);
	}
	
	public static void printNum(int n)
	{
	if (n > 0)
		printNum(n - 1);
    System.out.println(n);
	}	
}