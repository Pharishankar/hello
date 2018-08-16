interface B
{
	void show();
}
class A implements B
{
	public void show()
	{
		System.out.println("A class show method");
	}
}
class C implements B
{
	public void show()
	{
		System.out.println("C class show method");
	}
}
public class Test
{	
	public static void main(String[] args) {
		B b=new A();
		b.show();
		B b1=new C();
		b1.show();
	}
}