package drawingObjects;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import drawing.DrawingPanel;
import geometry.Shape;
import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;

import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDrawing extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private PnlDrawing drawingPanel = new PnlDrawing();
	private int isOk;
	private JToggleButton tglBtnPoint = new JToggleButton("Point");
	private JToggleButton tglBtnLine = new JToggleButton("Line");
	private JToggleButton tglBtnCircle = new JToggleButton("Circle");
	private JToggleButton tglBtnRect = new JToggleButton("Rectangle");
	private JToggleButton tglBtnDonut = new JToggleButton("Donut");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDrawing frame = new FrmDrawing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmDrawing() {
		 contentPane = new JPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBarNorth = new JToolBar();
		contentPane.add(toolBarNorth, BorderLayout.NORTH);
		
		JToggleButton tglBtnPoint = new JToggleButton("Point");
		tglBtnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	
		buttonGroup.add(tglBtnPoint);
		toolBarNorth.add(tglBtnPoint);
		
		JToggleButton tglBtnLine = new JToggleButton("Line");
		tglBtnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglBtnLine);
		toolBarNorth.add(tglBtnLine);
		
		JToggleButton tglBtnCircle = new JToggleButton("Circle");
		tglBtnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglBtnCircle);
		toolBarNorth.add(tglBtnCircle);
		
		JToggleButton tglBtnRect = new JToggleButton("Rectangle");
		tglBtnRect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgRectangle dlg = new DlgRectangle();
				dlg.setVisible(true);
				if(dlg.isOk() == true) {
					try {
						if(dlg.getTextFieldX().getText().isEmpty() || dlg.getTextFieldY().getText().isEmpty() || dlg.getTextFieldWidth().getText().isEmpty() || dlg.getTextFieldHeight().getText().isEmpty()) { 
							JOptionPane.showMessageDialog(null, "All fields must be filled!!","Error", JOptionPane.ERROR_MESSAGE);
							return;
					}
							int x = Integer.parseInt(dlg.getTextFieldX().getText());
							int y = Integer.parseInt(dlg.getTextFieldY().getText());
							int width = Integer.parseInt(dlg.getTextFieldWidth().getText());
							int height = Integer.parseInt(dlg.getTextFieldHeight().getText());
							
							Rectangle rect = new Rectangle(new Point(x,y), width, height);
							if(rect.getWidth()<=0 || rect.getHeight() <=0) {
								JOptionPane.showMessageDialog(null, "Height and width must be greater than zero!", "Error", JOptionPane.ERROR_MESSAGE);
							return;
							}
							
							
						
					}catch(NumberFormatException exc) {
						JOptionPane.showInternalMessageDialog(null, "Please enter numbers only!", "Warning", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		buttonGroup.add(tglBtnRect);
		toolBarNorth.add(tglBtnRect);
		
		JToggleButton tglBtnDonut = new JToggleButton("Donut");
		tglBtnDonut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglBtnDonut);
		toolBarNorth.add(tglBtnDonut);

		
		JToolBar toolBarSouth = new JToolBar();
		contentPane.add(toolBarSouth, BorderLayout.SOUTH);
		
		JToggleButton tglbtnSelect = new JToggleButton("SELECT");
		tglbtnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnSelect);
		tglbtnSelect.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBarSouth.add(tglbtnSelect);
		
		JToggleButton tglbtnModify = new JToggleButton("MODIFY");
		tglbtnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnModify);
		toolBarSouth.add(tglbtnModify);
		
		JToggleButton tglbtnDelete = new JToggleButton("DELETE");
		tglbtnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnDelete);
		toolBarSouth.add(tglbtnDelete);
	}
	protected void delete() {
	    Shape selected = drawingPanel.getSelected();
	    if (selected != null)
	        drawingPanel.getShapes().remove(selected);
	    drawingPanel.repaint();
	}
	protected void modify() {
		Shape selected =  drawingPanel.getSelected();
		if(selected != null) {
			if(selected instanceof Point) {
				Point point = (Point) selected;
				DlgPoint dlg = new DlgPoint();
				dlg.setPoint(point);
				dlg.setModal(true);
				dlg.setVisible(true);
			}else if(selected instanceof Line) {
				Line line = (Line) selected;
				DlgLine dlg =new DlgLine();
				dlg.setLine(line);
				dlg.setModal(true);
				dlg.setVisible(true);
			}else if(selected instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) selected;
				DlgRectangle dlg = new DlgRectangle();
				dlg.setRectangle(rectangle);
				dlg.setModal(true);
			    dlg.setVisible(true);	
			}else if(selected instanceof Circle) {
				Circle circle = (Circle) selected;
				DlgCircle dlg = new DlgCircle();
				dlg.setCircle(circle);
				dlg.setModal(true);
				dlg.setVisible(true);
			}else if(selected instanceof Donut) {
				Donut donut = (Donut) selected;
				DlgDonut dlg = new DlgDonut();
				dlg.setDonut(donut);
				dlg.setModal(true);
				dlg.setVisible(true);
			}
		}
		drawingPanel.repaint();
	}
	
	public Shape getTglBtnSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	public JToggleButton getTglBtnPoint() {
		// TODO Auto-generated method stub
		return tglBtnPoint;
	}

	public JToggleButton getTglBtnLine() {
		// TODO Auto-generated method stub
		return tglBtnLine;
	}

	public JToggleButton getTglBtnRectangle() {
		// TODO Auto-generated method stub
		return tglBtnRect;
	}

	public JToggleButton getTglBtnCircle() {
		// TODO Auto-generated method stub
		return tglBtnCircle;
	}

	public JToggleButton getTglBtnDonut() {
		// TODO Auto-generated method stub
		return tglBtnDonut;
	}

	

	
	
	

}
