package drawingObjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import drawing.DrawingPanel;
import geometry.Shape;

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		PnlDrawing panel = new PnlDrawing();
		frame.getContentPane().add(panel);
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBarNorth = new JToolBar();
		contentPane.add(toolBarNorth, BorderLayout.NORTH);
		
		
		JToggleButton tglbtnPoint = new JToggleButton("POINT");
		tglbtnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgPoint dlg = new DlgPoint();
				dlg.setVisible(true);
				if (dlg.isOk()== true) {
					
						
						
				}
			}
		});
		buttonGroup.add(tglbtnPoint);
		toolBarNorth.add(tglbtnPoint);
		
		JToggleButton tglbtnLine = new JToggleButton("LINE");
		tglbtnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnLine);
		tglbtnLine.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBarNorth.add(tglbtnLine);
		
		JToggleButton tglbtnRectangle = new JToggleButton("RECTANGLE");
		tglbtnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnRectangle);
		toolBarNorth.add(tglbtnRectangle);
		
		JToggleButton tglbtnCircle = new JToggleButton("CIRCLE");
		tglbtnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnCircle);
		tglbtnCircle.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBarNorth.add(tglbtnCircle);
		
		JToggleButton tglbtnDonut = new JToggleButton("DONUT");
		tglbtnDonut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnDonut);
		tglbtnDonut.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBarNorth.add(tglbtnDonut);
		
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

	public Shape getTglBtnSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shape getTglBtnPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shape getTglBtnLine() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shape getTglBtnRectangle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shape getTglBtnCircle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shape getTglBtnDonut() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
