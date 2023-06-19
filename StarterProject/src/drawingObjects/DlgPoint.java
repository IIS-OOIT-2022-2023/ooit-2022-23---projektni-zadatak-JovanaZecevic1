package drawingObjects;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.JTextField;

public class DlgPoint extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textPointX;
	private JTextField textPointY;
	private boolean isOk;
	private int x;
	private int y;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgPoint dialog = new DlgPoint();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgPoint() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel lblPoint = new JLabel("Enter coordinates:");
				panel.add(lblPoint);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblPointY = new JLabel("Enter x coordinate:");
				GridBagConstraints gbc_lblPointY = new GridBagConstraints();
				gbc_lblPointY.insets = new Insets(0, 0, 5, 5);
				gbc_lblPointY.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblPointY.gridx = 1;
				gbc_lblPointY.gridy = 1;
				panel.add(lblPointY, gbc_lblPointY);
			}
			{
				textPointX = new JTextField();
				GridBagConstraints gbc_textPointX = new GridBagConstraints();
				gbc_textPointX.anchor = GridBagConstraints.WEST;
				gbc_textPointX.insets = new Insets(0, 0, 5, 0);
				gbc_textPointX.gridx = 2;
				gbc_textPointX.gridy = 1;
				panel.add(textPointX, gbc_textPointX);
				textPointX.setColumns(10);
			}
			{
				JLabel lblPointY = new JLabel("Enter y coordinate:");
				GridBagConstraints gbc_lblPointY = new GridBagConstraints();
				gbc_lblPointY.anchor = GridBagConstraints.EAST;
				gbc_lblPointY.insets = new Insets(0, 0, 0, 5);
				gbc_lblPointY.gridx = 1;
				gbc_lblPointY.gridy = 2;
				panel.add(lblPointY, gbc_lblPointY);
			}
			{
				textPointY = new JTextField();
				GridBagConstraints gbc_textPointY = new GridBagConstraints();
				gbc_textPointY.anchor = GridBagConstraints.WEST;
				gbc_textPointY.gridx = 2;
				gbc_textPointY.gridy = 2;
				panel.add(textPointY, gbc_textPointY);
				textPointY.setColumns(10);
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

	public JTextField getTextXCoord() {
		return textPointX;
	}

	public void setTextXCoord(JTextField textXCoord) {
		this.textPointX = textXCoord;
	}

	public JTextField getTextYCoord() {
		return textPointY;
	}

	public void setTextYCoord(JTextField textYCoord) {
		this.textPointY = textYCoord;
	}

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean isOkay) {
		this.isOk = isOkay;
	}


	public void setPoint(geometry.Point point) {
		this.x = (int) point.getX();
		this.y = (int) point.getY();
	}

}
