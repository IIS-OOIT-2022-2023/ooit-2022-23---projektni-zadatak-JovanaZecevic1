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
import javax.swing.JTextField;

public class DlgPoint extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textXCoord;
	private JTextField textYCoord;

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
				JLabel lblXCoord = new JLabel("Enter x coordinate:");
				GridBagConstraints gbc_lblXCoord = new GridBagConstraints();
				gbc_lblXCoord.insets = new Insets(0, 0, 5, 5);
				gbc_lblXCoord.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblXCoord.gridx = 1;
				gbc_lblXCoord.gridy = 1;
				panel.add(lblXCoord, gbc_lblXCoord);
			}
			{
				textXCoord = new JTextField();
				GridBagConstraints gbc_textXCoord = new GridBagConstraints();
				gbc_textXCoord.anchor = GridBagConstraints.WEST;
				gbc_textXCoord.insets = new Insets(0, 0, 5, 0);
				gbc_textXCoord.gridx = 2;
				gbc_textXCoord.gridy = 1;
				panel.add(textXCoord, gbc_textXCoord);
				textXCoord.setColumns(10);
			}
			{
				JLabel lblYCoord = new JLabel("Enter y coordinate:");
				GridBagConstraints gbc_lblYCoord = new GridBagConstraints();
				gbc_lblYCoord.anchor = GridBagConstraints.EAST;
				gbc_lblYCoord.insets = new Insets(0, 0, 0, 5);
				gbc_lblYCoord.gridx = 1;
				gbc_lblYCoord.gridy = 2;
				panel.add(lblYCoord, gbc_lblYCoord);
			}
			{
				textYCoord = new JTextField();
				GridBagConstraints gbc_textYCoord = new GridBagConstraints();
				gbc_textYCoord.anchor = GridBagConstraints.WEST;
				gbc_textYCoord.gridx = 2;
				gbc_textYCoord.gridy = 2;
				panel.add(textYCoord, gbc_textYCoord);
				textYCoord.setColumns(10);
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

}
