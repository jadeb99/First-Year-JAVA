public class FindMinNum
{
	public static void main(String[] args)
	{
		int a = 11;
		int b = 6;
		int c = 0;
		
		double d = 1500;
		double e = 100000;
		double f = 0;
		
		c = minFunction(a,b);
		f = minFunction(d,e);
		
		System.out.println("Minimum value is " + c);
		System.out.println("Other minimum value is " + f);
	}
	
	//you need static to call the function (or make an object)
	public static int minFunction(int n1, int n2)
	{
		int min = 0;
		if (n1>n2)
		{
			min = n2;
		}
		else
		{
			min = n1;
		}
		return min;
	}
	
	//two functions can have the same name as long as the parameters are different (method overloading)
	public static double minFunction(double n1, double n2)
	{
		double min = 0;
		if (n1>n2)
		{
			min = n2;
		}
		else
		{
			min = n1;
		}
		return min;
	}
}