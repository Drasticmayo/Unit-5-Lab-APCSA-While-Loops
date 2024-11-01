public class Divisors
{
	public static String getDivisors( int number )
   
	{   String divisors= "";
        int placeholder = 1;
        do 
        {
            if (number % placeholder ==0)
            {
                divisors += placeholder + " ";
            }
            placeholder = (placeholder +1);
        }
        while (placeholder <= number);
		
		return divisors; 
	}
}
