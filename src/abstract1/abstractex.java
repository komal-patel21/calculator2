package abstract1;
abstract class Shape
{
	abstract void draw();
	{
		
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("circle----->");
	}
}
class Rec extends Shape
{
	void draw()
	{
		System.out.println("rectangle--->");
	}
}
public class abstractex {

	public static void main(String[] args) 
	{
		Shape s=new Circle();
				s.draw();

	}

}
