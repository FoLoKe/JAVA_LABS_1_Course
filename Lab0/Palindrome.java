public class  Palindrome
{
	public static String reverseString(String s)
	{
		String g="";
		int i=s.length();
		for(int j=i-1;j>=0;j--)
		{
			g+=s.charAt(j);
		}
		return g;
	}

	public static boolean isPalindrome(String s,String k)
	{
		String g="";
		int i=s.length();
		for(int j=i-1;j>=0;j--)
		{
			g+=s.charAt(j);
		}
		return g.equals(k);
	}
	
	public static void main(String[] args)
	{
		for (int i = 0; i < args.length; i++) 
		{
 			String s = args[i];
			String k=reverseString(s);
			System.out.println(k);
			System.out.print(isPalindrome(s,k));
		}				
	}

}