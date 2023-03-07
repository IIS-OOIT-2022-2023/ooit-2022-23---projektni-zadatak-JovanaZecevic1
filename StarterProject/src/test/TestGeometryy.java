package test;
import geometry.$missing$;
import geometry.Point;

public class TestGeometryy {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int x=5;
		Point point = new Point ();
		System.out.println(point);
		System.out.println(point.getX());
		System.out.println(point.y);
		point.setX(4);
		System.out.println(point.get(x));
		
		Point point1 = new Point();
		point1.y = 5;
		System.out.println(point.y);
		
		Point point2 = new Point(10,10);
		System.out.println("point2 iz main metode: " +point2.x);
		System.out.println("x=" +point2.getX() + "y= "+ point2.get(y));
		
		Point point1 = new Point (20,20);
		point2.distance(point1);

		

	}

}
