package drawing;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import geometry.*;


public class DrawingPanel extends JPanel {

	
	private ArrayList<Shape> shapes = new ArrayList<Shape>();


	public DrawingPanel() {
		
		shapes.add(new Point(80, 100));
		shapes.add(new Line(new Point(200, 80), new Point(250, 180)));
		shapes.add(new Circle(new Point(50,50), 40));
		shapes.add(new Rectangle(new Point(130,30), 40, 20));
		shapes.add(new Donut(new Point(100, 150), 40, 20));

		//VEZBE 8 Zadatak 1
		Iterator<Shape> it=shapes.iterator();
		while(it.hasNext()) {
			it.next().moveBy(10, 0);
		}
	}


	public void paint(Graphics g) {
		super.paint(g);
		
		
		for(int i=0; i<shapes.length; i++) {
			shapes[i].draw(g);
		
			}
			shapes[i].draw(g);
			
		

		

		Iterator<Shape> it=shapes.iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}




	}

}