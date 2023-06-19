package drawingObjects;
import java.awt.color.*;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
import java.awt.*;

import geometry.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import geometry.Point;
import geometry.Line;
import geometry.Rectangle;
import geometry.Donut;
import geometry.Circle;
public class PnlDrawing extends JPanel {
	private FrmDrawing frame;
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	private Shape selected;
	private Point startPoint;

	/**
	 * Create the panel.
	 */
	
	public PnlDrawing() {
	}
	
	public PnlDrawing(FrmDrawing frame) {
		this.frame = frame;
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg) {
				thisMouseClicked(arg);
			}
		});
		}
	protected void thisMouseClicked(MouseEvent e) {
		Shape newShape = null;
		if (frame.getTglBtnSelect().isSelected()) {
			selected = null;
			Iterator<Shape> it = shapes.iterator();
			while(it.hasNext()) {
				Shape shape = it.next();
				shape.setSelected(false);
				if(shape.contains(e.getX(), e.getY()))
					selected = shape;
			}
			if (selected != null)
				selected.setSelected(true);
			} else if (frame.getTglBtnPoint().isSelected()) {
				newShape = new Point(e.getX(), e.getY());	
			} else if (frame.getTglBtnLine().isSelected()) {
				if (startPoint == null) 
					startPoint = new Point (e.getX(), e.getY());
				else {
					newShape = new Line (startPoint, new Point(e.getX(),e.getY()));
					startPoint = null;
				}
			}
		
	 else if (frame.getTglBtnRectangle().isSelected()) {
		 DlgRectangle dlg = new DlgRectangle();
		 dlg.setModal(true);
		 dlg.setRectangle (new Rectangle (new Point (e.getX(), e.getY()),-1,-1));
		dlg.setVisible(true);
		if(!dlg.isCommited())
			return;
		try {
			newShape = dlg.getRectangle();
		}catch (Exception ex) {
			JOptionPane.showMessageDialog(frame, "Wrong data type", "Error", JOptionPane.ERROR_MESSAGE);
		}
	 }else if (frame.getTglBtnCircle().isSelected()) {
			DlgCircle dlg = new DlgCircle ();
			dlg.setModal(true);
			dlg.setCircle(new Circle (new Point (e.getX(), e.getY()), -1));
			dlg.setVisible(true);
			
			if (!dlg.isCommited())
				return;
			
			try {
				newShape = dlg.getCircle();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(frame, "Wrong data type", "Error", JOptionPane.ERROR_MESSAGE);
			}
	 }else if (frame.getTglBtnDonut().isSelected()) {
			DlgDonut dlg = new DlgDonut ();
			dlg.setModal(true);
			dlg.setDonut(new Donut (new Point (e.getX(), e.getY()), -1, -1));
			dlg.setVisible(true);
			
			if (!dlg.isCommited())
				return;
			try {
				newShape = dlg.getDonut();
			}catch (Exception ex) {
				JOptionPane.showMessageDialog(frame,  "Wrong data type", "Error", JOptionPane.ERROR_MESSAGE);
			}
	 }
		if (newShape != null)
			shapes.add(newShape);
		repaint ();
	} 
	
	public void paint (Graphics g) {
		super.paint(g);
		Iterator<Shape> it = shapes.iterator();
		while (it.hasNext())
			it.next().draw(g);
	}
	
	public Shape getSelected() {
		return selected;
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}
}
		
	
	
	
	
		


	
	
	
	
		

