package drawingObjects;

import java.awt.BorderLayout;
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

public class DlgRectangle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldXLeft;
	private JTextField textFieldY;
	private JTextField textFieldWidth;
	private JTextField textFieldHeight;

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
				textFieldXLeft = new JTextField();
				GridBagConstraints gbc_textFieldXLeft = new GridBagConstraints();
				gbc_textFieldXLeft.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldXLeft.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldXLeft.gridx = 2;
				gbc_textFieldXLeft.gridy = 1;
				panel.add(textFieldXLeft, gbc_textFieldXLeft);
				textFieldXLeft.setColumns(10);
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
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public void SetRectangle(Rectangle rectangle) {
		
		
	}

	public boolean isCommited() {
		// TODO Auto-generated method stub
		return false;
	}

	public Shape getRectangle() {
		// TODO Auto-generated method stub
		return null;
	}

}
