import java.awt.*;
public class RectProgram {
	public static void main(String[] args) {
		Rectangle rect1= new Rectangle(4,6,15,10);
		System.out.println("Rectangle 1 (original): "+rect1);
		Rectangle rect2= new Rectangle(-3,-8,8,7);
		System.out.println("Rectangle 2 (original): "+rect2);
		rect1.translate(3,-2);
		double xCoord1=rect1.getX();
		double yCoord1=rect1.getY();
		System.out.println();
		System.out.println("Rectangle 1 Coordinates (after translation): ("+xCoord1+","+yCoord1+")");
		rect2.setLocation(-2,-4);
		boolean statement1= rect2.intersects(rect1);
		if(statement1)
		{
			System.out.println();
			System.out.println("The rectangles intersect");
			Rectangle inter=rect2.intersection(rect1);
			Rectangle intersectedRect=inter;
			System.out.println();
			System.out.println("Intersected rectangle: "+intersectedRect);
		}
		else
		{
			System.out.println();
			System.out.println("The rectangles do not intersect");
		}
		
	}

}

