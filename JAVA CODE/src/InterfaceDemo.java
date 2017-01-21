interface Shape_
{
	void caluculateArea();
};

class Square implements Shape_
{
	private int side;
	private int area;

	public void setSide(int side)
	{
		this.side=side;
		
	}
	public void printSquareArea()
	{
		System.out.println("Square area: " + area);
	}

	public void caluculateArea()
	{
		area = side * side;

	}
}

public class  InterfaceDemo
{
	public static void main(String[] args) 
	{
			
		Square sqrshp=new Square();
		sqrshp.setSide(10);
		sqrshp.caluculateArea();
		sqrshp.printSquareArea();
	
	}
}

