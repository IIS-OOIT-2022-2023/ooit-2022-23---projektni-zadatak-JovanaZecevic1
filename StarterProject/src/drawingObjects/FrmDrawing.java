package drawingObjects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import drawing.DrawingPanel;
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
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		
		JToggleButton tglbtnPoint = new JToggleButton("POINT");
		tglbtnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnPoint);
		toolBar.add(tglbtnPoint);
		
		JToggleButton tglbtnLine = new JToggleButton("LINE");
		tglbtnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnLine);
		tglbtnLine.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBar.add(tglbtnLine);
		
		JToggleButton tglbtnRectangle = new JToggleButton("RECTANGLE");
		tglbtnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnRectangle);
		toolBar.add(tglbtnRectangle);
		
		JToggleButton tglbtnCircle = new JToggleButton("CIRCLE");
		tglbtnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnCircle);
		tglbtnCircle.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBar.add(tglbtnCircle);
		
		JToggleButton tglbtnDonut = new JToggleButton("DONUT");
		tglbtnDonut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(tglbtnDonut);
		tglbtnDonut.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBar.add(tglbtnDonut);
	}

}
