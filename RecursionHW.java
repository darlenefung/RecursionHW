/** 
 * this program prints ints 0 to n
 * @author Darlene Fung
 */
public class RecursionHW 
{
	public static void main(String[] args)
	{
		printNum(5);
	}
	
	
	/** 
	 * This method prints the integers from 
 	 * 0 to n both inclusive, on separate lines
	 * using recursion by subtracting one from int n
	 * @param n the largest integer printed on the screen
	 */	
	public static void printNum(int n)
	{
	if (n > 0)
		printNum(n - 1);
    System.out.println(n);
	}	
}