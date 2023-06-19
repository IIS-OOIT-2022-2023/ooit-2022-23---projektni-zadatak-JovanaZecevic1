package drawingObjects;

import java.awt.BorderLayout;
import geometry.Point;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Rectangle;
import geometry.Shape;

import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgRectangle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldX;
	private JTextField textFieldY;
	private JTextField textFieldWidth;
	private JTextField textFieldHeight;
	private boolean isOk;
	private int x;
	private int y;
	private int width;
	private int height;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRectangle dialog = new DlgRectangle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRectangle() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel lblRectangle = new JLabel("Enter coordinates, width and height:");
				panel.add(lblRectangle);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblXleft = new JLabel("Enter x coordinate:");
				GridBagConstraints gbc_lblXleft = new GridBagConstraints();
				gbc_lblXleft.anchor = GridBagConstraints.EAST;
				gbc_lblXleft.insets = new Insets(0, 0, 5, 5);
				gbc_lblXleft.gridx = 1;
				gbc_lblXleft.gridy = 1;
				panel.add(lblXleft, gbc_lblXleft);
			}
			{
				textFieldX = new JTextField();
				GridBagConstraints gbc_textFieldX = new GridBagConstraints();
				gbc_textFieldX.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldX.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldX.gridx = 2;
				gbc_textFieldX.gridy = 1;
				panel.add(textFieldX, gbc_textFieldX);
				textFieldX.setColumns(10);
			}
			{
				JLabel lblYLeft = new JLabel("Enter y coordinate:");
				GridBagConstraints gbc_lblYLeft = new GridBagConstraints();
				gbc_lblYLeft.anchor = GridBagConstraints.EAST;
				gbc_lblYLeft.insets = new Insets(0, 0, 5, 5);
				gbc_lblYLeft.gridx = 1;
				gbc_lblYLeft.gridy = 2;
				panel.add(lblYLeft, gbc_lblYLeft);
			}
			{
				textFieldY = new JTextField();
				GridBagConstraints gbc_textFieldY = new GridBagConstraints();
				gbc_textFieldY.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldY.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldY.gridx = 2;
				gbc_textFieldY.gridy = 2;
				panel.add(textFieldY, gbc_textFieldY);
				textFieldY.setColumns(10);
			}
			{
				JLabel lblWidth = new JLabel("Enteer width:");
				GridBagConstraints gbc_lblWidth = new GridBagConstraints();
				gbc_lblWidth.anchor = GridBagConstraints.EAST;
				gbc_lblWidth.insets = new Insets(0, 0, 5, 5);
				gbc_lblWidth.gridx = 1;
				gbc_lblWidth.gridy = 3;
				panel.add(lblWidth, gbc_lblWidth);
			}
			{
				textFieldWidth = new JTextField();
				GridBagConstraints gbc_textFieldWidth = new GridBagConstraints();
				gbc_textFieldWidth.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldWidth.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldWidth.gridx = 2;
				gbc_textFieldWidth.gridy = 3;
				panel.add(textFieldWidth, gbc_textFieldWidth);
				textFieldWidth.setColumns(10);
			}
			{
				JLabel lblHeight = new JLabel("Enter height:");
				GridBagConstraints gbc_lblHeight = new GridBagConstraints();
				gbc_lblHeight.anchor = GridBagConstraints.EAST;
				gbc_lblHeight.insets = new Insets(0, 0, 0, 5);
				gbc_lblHeight.gridx = 1;
				gbc_lblHeight.gridy = 4;
				panel.add(lblHeight, gbc_lblHeight);
			}
			{
				textFieldHeight = new JTextField();
				GridBagConstraints gbc_textFieldHeight = new GridBagConstraints();
				gbc_textFieldHeight.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldHeight.gridx = 2;
				gbc_textFieldHeight.gridy = 4;
				panel.add(textFieldHeight, gbc_textFieldHeight);
				textFieldHeight.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isOk = true;
						setVisible(false);
							
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}




	public boolean isCommited() {
		// TODO Auto-generated method stub
		return false;
	}

	public Shape getRectangle() {
		DlgRectangle dlg = new DlgRectangle();
		
		int x = Integer.parseInt(dlg.getTextFieldX().getText());
		int y = Integer.parseInt(dlg.getTextFieldY().getText());
		int width = Integer.parseInt(dlg.getTextFieldWidth().getText());
		int height = Integer.parseInt(dlg.getTextFieldHeight().getText());
		
		Rectangle rectangle = new Rectangle(new Point(x,y), width,  height);
		return rectangle;
		
	}

	public JTextField getTextFieldX() {
		return textFieldX;
	}

	public void setTextFieldX(JTextField textFieldX) {
		this.textFieldX = textFieldX;
	}

	public JTextField getTextFieldY() {
		return textFieldY;
	}

	public void setTextFieldY(JTextField textFieldY) {
		this.textFieldY = textFieldY;
	}

	public JTextField getTextFieldWidth() {
		return textFieldWidth;
	}

	public void setTextFieldWidth(JTextField textFieldWidth) {
		this.textFieldWidth = textFieldWidth;
	}

	public JTextField getTextFieldHeight() {
		return textFieldHeight;
	}

	public void setTextFieldHeight(JTextField textFieldHeight) {
		this.textFieldHeight = textFieldHeight;
	}

	public boolean isOk() {
		return isOk;
	}

	public void setOkay(boolean isOk) {
		this.isOk = isOk;
	}

	

	public void setRectangle(Rectangle rectangle) {
	    this.y = rectangle.getUpperLeftPoint().getY();
	    this.width = rectangle.getWidth();
	    this.height = rectangle.getHeight();
		
	}

	

	

}
