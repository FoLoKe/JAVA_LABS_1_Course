public class Primes
{
	public static void main(String[] args)
	{
		for (int i=0;i<100;i++)
		{
			if(i<2)
			{
				System.out.print(i);
				System.out.println(" ");
			}
			if(i>1 && isPrime(i))
			{
				System.out.print(i);
				System.out.println(" ");
			}
		}
	}

	public static boolean isPrime(int n)
	{
		for (int i=n;i<100;i++)
		{
	  	 	 if(n%i==0)
          		 return true;
		}
		return false;
	}
}