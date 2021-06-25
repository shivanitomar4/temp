class Tet
{
	/*Tet(Tet t)
	{
	System.out.println("ada");
	}*/

	void m1(Tet t )
	{
	System.out.println("ada");
	}
	void m2()
	{
	m1(this);
	}
public static void main(String args[])
	{
	Tet t = new Tet();
	t.m2();
	}

}