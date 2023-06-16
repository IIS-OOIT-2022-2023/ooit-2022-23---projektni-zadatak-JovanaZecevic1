package drawingObjects;
import java.awt.color.*;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

import geometry.Shape;

public class PnlDrawing extends JPanel {
	private FrmDrawing frame;
	private ArrayList<Shape> shapes = new ArrayList<Shape>();

	/**
	 * Create the panel.
	 */
	public PnlDrawing() {
		

	}
	
	public PnlDrawing(FrmDrawing frame){
		this.frame = frame;
		

}
}
