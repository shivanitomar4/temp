class Demo
{
	Demo()
	{
	this(10);
	System.out.println("no arg constroctor");
	
	}
	Demo(int a)
	{
	//this();

	System.out.println("peramatrised constroctor");
	}
	public static void main(String args[])
	{
	Demo d = new Demo();	
	//Demo d1 = new Demo(10);
	}
}