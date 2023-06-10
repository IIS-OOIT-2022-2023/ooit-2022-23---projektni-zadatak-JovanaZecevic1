package test;
import geometry.Point;

public class TestGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intVar = 3;
		double doubleVar = 0.98;

		doubleVar = intVar;
		intVar = (int)doubleVar;

		String s = "1";
		int d = Integer.parseInt(s);

		boolean trueBool = true;
		boolean falseBool = false;

		//logicki operatori
		System.out.println(trueBool && falseBool); //false
		System.out.println(trueBool && !falseBool); //true
		System.out.println(trueBool || falseBool); //true
		System.out.println(trueBool ^ falseBool); //true

		//konkatenacija stringova
		String string1 = "ime ";
		String string2 = "prezime";
		System.out.println(string1+string2);

		Point point = new Point(); 
		System.out.println(point); 
		
		System.out.println(point.getX()); 
		System.out.println(point.isSelected());

		point.setX(10);
		System.out.println(point.getX());

		Point point2 = new Point(10,10);
		System.out.println("point2 iz main metode: " +point2);
		System.out.println("x=" + point2.getX() + ", y=" + point2.getY());

		Point point1 = new Point(20,20);
		System.out.println(point2.distance(point1));

	}

}