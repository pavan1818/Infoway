

//Method Overloading
public class Addition {

	int add(int a, int b)
	{
		return a+b;
	}
	
	void add(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println(" Addition of "+a+" "+b+" "+c+" is : "+sum);
	}
	
	double add (float a, float b)
	{
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		Addition a = new Addition();
		
		int aa = a.add(12, 13);
		System.out.println(" Addition of first method is "+aa);

		a.add(8,9,7);
		//System.out.println(" Addition of second method is "+a.add(8,9,7));//will not work it will give + is undifined
		
		double cc = a.add(15.4f, 48.2f);
		System.out.println(" Addition of third method is "+cc);
	}

}
