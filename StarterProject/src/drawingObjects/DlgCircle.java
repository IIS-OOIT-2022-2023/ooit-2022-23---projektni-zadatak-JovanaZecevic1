package drawingObjects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Point;
import geometry.Shape;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DlgCircle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldXCenter;
	private JTextField textFieldYCenter;
	private JTextField textFieldRadius;
	private boolean isOk;
	private Color innerColor;
	private Color outlineColor;
	private Circle circle;
	



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCircle dialog = new DlgCircle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCircle() {
		setModal(true);
		innerColor = Color.white;
		outlineColor = Color.black;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel lblCircles = new JLabel("Enter center and radius:");
				panel.add(lblCircles);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblXCenter = new JLabel("Enter x coordinate of center:");
				GridBagConstraints gbc_lblXCenter = new GridBagConstraints();
				gbc_lblXCenter.anchor = GridBagConstraints.EAST;
				gbc_lblXCenter.insets = new Insets(0, 0, 5, 5);
				gbc_lblXCenter.gridx = 1;
				gbc_lblXCenter.gridy = 1;
				panel.add(lblXCenter, gbc_lblXCenter);
			}
			{
				textFieldXCenter = new JTextField();
				GridBagConstraints gbc_textFieldXCenter = new GridBagConstraints();
				gbc_textFieldXCenter.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldXCenter.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldXCenter.gridx = 2;
				gbc_textFieldXCenter.gridy = 1;
				panel.add(textFieldXCenter, gbc_textFieldXCenter);
				textFieldXCenter.setColumns(10);
			}
			{
				JLabel lblYCenter = new JLabel("Enter y coordinate of center:");
				GridBagConstraints gbc_lblYCenter = new GridBagConstraints();
				gbc_lblYCenter.anchor = GridBagConstraints.EAST;
				gbc_lblYCenter.insets = new Insets(0, 0, 5, 5);
				gbc_lblYCenter.gridx = 1;
				gbc_lblYCenter.gridy = 2;
				panel.add(lblYCenter, gbc_lblYCenter);
			}
			{
				textFieldYCenter = new JTextField();
				GridBagConstraints gbc_textFieldYCenter = new GridBagConstraints();
				gbc_textFieldYCenter.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldYCenter.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldYCenter.gridx = 2;
				gbc_textFieldYCenter.gridy = 2;
				panel.add(textFieldYCenter, gbc_textFieldYCenter);
				textFieldYCenter.setColumns(10);
			}
			{
				JLabel lblRadius = new JLabel("Enter radius value:");
				GridBagConstraints gbc_lblRadius = new GridBagConstraints();
				gbc_lblRadius.anchor = GridBagConstraints.EAST;
				gbc_lblRadius.insets = new Insets(0, 0, 5, 5);
				gbc_lblRadius.gridx = 1;
				gbc_lblRadius.gridy = 3;
				panel.add(lblRadius, gbc_lblRadius);
			}
			{
				textFieldRadius = new JTextField();
				GridBagConstraints gbc_textFieldRadius = new GridBagConstraints();
				gbc_textFieldRadius.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldRadius.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldRadius.gridx = 2;
				gbc_textFieldRadius.gridy = 3;
				panel.add(textFieldRadius, gbc_textFieldRadius);
				textFieldRadius.setColumns(10);
			}
			{
				JButton btnNewButton = new JButton("Choose inner color");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						innerColor = JColorChooser.showDialog(null,
		                        "Choose a color", Color.WHITE);
					}
				});
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
				gbc_btnNewButton.gridx = 1;
				gbc_btnNewButton.gridy = 4;
				panel.add(btnNewButton, gbc_btnNewButton);
			}
			{
				JButton btnNewButton_1 = new JButton("Choose outline color");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						outlineColor = JColorChooser.showDialog(null,
		                        "Choose a color", Color.BLACK);
					}
				});
				GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
				gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
				gbc_btnNewButton_1.gridx = 1;
				gbc_btnNewButton_1.gridy = 5;
				panel.add(btnNewButton_1, gbc_btnNewButton_1);
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
						try {
							int x = Integer.parseInt(textFieldXCenter.getText());
							int y = Integer.parseInt(textFieldYCenter.getText());
							int radius = Integer.parseInt(textFieldRadius.getText());
						    circle = new Circle(new Point(x,y), radius);
						    setVisible(false);
							isOk=true;
							
						}catch(NumberFormatException exc){
							JOptionPane.showMessageDialog(null, "Enter number only!", "Error", JOptionPane.ERROR_MESSAGE);
						}catch(IllegalArgumentException ex)
						{
							JOptionPane.showMessageDialog(DlgCircle.this, "Must be positive!", "Error", JOptionPane.ERROR_MESSAGE);
						}
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



	public JTextField getTextFieldXCenter() {
		return textFieldXCenter;
	}

	public void setTextFieldXCenter(JTextField textFieldXCenter) {
		this.textFieldXCenter = textFieldXCenter;
	}

	public JTextField getTextFieldYCenter() {
		return textFieldYCenter;
	}

	public void setTextFieldYCenter(JTextField textFieldYCenter) {
		this.textFieldYCenter = textFieldYCenter;
	}

	public JTextField getTextFieldRadius() {
		return textFieldRadius;
	}

	public void setTextFieldRadius(JTextField textFieldRadius) {
		this.textFieldRadius = textFieldRadius;
	}

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}

	public Color getInnerColor() {
		return innerColor;
	}

	public void setInnerColor(Color innerColor) {
		this.innerColor = innerColor;
	}

	public Color getOutlineColor() {
		return outlineColor;
	}

	public void setOutlineColor(Color outlineColor) {
		this.outlineColor = outlineColor;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	
	

}
