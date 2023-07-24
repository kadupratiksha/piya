
public class Gparents
{
	Gparents()
	{
		System.out.println("Gparent constructor");
	}
	int G=10;
	void display()
	{
		System.out.println("Gparaent class");
	}

}

 class parent extends Gparents
{
	parent()
	{
		System.out.println("parent constructor");
	}
	
	int a=10;
	void display()
	{
		System.out.println("parent class");
	}
	
	
	
	
	
}
