package drawingObjects;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class DlgDonut extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldXcenter;
	private JTextField textFieldYcenter;
	private JTextField textFieldYDonut;
	private JTextField textFieldInner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDonut dialog = new DlgDonut();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDonut() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel lblDonut = new JLabel("Enter coordinates, radius and inner radius:");
				lblDonut.setHorizontalAlignment(SwingConstants.TRAILING);
				panel.add(lblDonut);
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
				JLabel lblXcenter = new JLabel("Enter x coordinate of center:");
				GridBagConstraints gbc_lblXcenter = new GridBagConstraints();
				gbc_lblXcenter.anchor = GridBagConstraints.EAST;
				gbc_lblXcenter.insets = new Insets(0, 0, 5, 5);
				gbc_lblXcenter.gridx = 1;
				gbc_lblXcenter.gridy = 1;
				panel.add(lblXcenter, gbc_lblXcenter);
			}
			{
				textFieldXcenter = new JTextField();
				GridBagConstraints gbc_textFieldXcenter = new GridBagConstraints();
				gbc_textFieldXcenter.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldXcenter.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldXcenter.gridx = 2;
				gbc_textFieldXcenter.gridy = 1;
				panel.add(textFieldXcenter, gbc_textFieldXcenter);
				textFieldXcenter.setColumns(10);
			}
			{
				JLabel lblYcenter = new JLabel("Enter y coordinate of center:");
				GridBagConstraints gbc_lblYcenter = new GridBagConstraints();
				gbc_lblYcenter.anchor = GridBagConstraints.EAST;
				gbc_lblYcenter.insets = new Insets(0, 0, 5, 5);
				gbc_lblYcenter.gridx = 1;
				gbc_lblYcenter.gridy = 2;
				panel.add(lblYcenter, gbc_lblYcenter);
			}
			{
				textFieldYcenter = new JTextField();
				GridBagConstraints gbc_textFieldYcenter = new GridBagConstraints();
				gbc_textFieldYcenter.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldYcenter.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldYcenter.gridx = 2;
				gbc_textFieldYcenter.gridy = 2;
				panel.add(textFieldYcenter, gbc_textFieldYcenter);
				textFieldYcenter.setColumns(10);
			}
			{
				JLabel lblRadiusDonut = new JLabel("Enter radius:");
				GridBagConstraints gbc_lblRadiusDonut = new GridBagConstraints();
				gbc_lblRadiusDonut.anchor = GridBagConstraints.EAST;
				gbc_lblRadiusDonut.insets = new Insets(0, 0, 5, 5);
				gbc_lblRadiusDonut.gridx = 1;
				gbc_lblRadiusDonut.gridy = 3;
				panel.add(lblRadiusDonut, gbc_lblRadiusDonut);
			}
			{
				textFieldYDonut = new JTextField();
				GridBagConstraints gbc_textFieldYDonut = new GridBagConstraints();
				gbc_textFieldYDonut.insets = new Insets(0, 0, 5, 0);
				gbc_textFieldYDonut.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldYDonut.gridx = 2;
				gbc_textFieldYDonut.gridy = 3;
				panel.add(textFieldYDonut, gbc_textFieldYDonut);
				textFieldYDonut.setColumns(10);
			}
			{
				JLabel lblInner = new JLabel("Enter inner radius:");
				GridBagConstraints gbc_lblInner = new GridBagConstraints();
				gbc_lblInner.anchor = GridBagConstraints.EAST;
				gbc_lblInner.insets = new Insets(0, 0, 0, 5);
				gbc_lblInner.gridx = 1;
				gbc_lblInner.gridy = 4;
				panel.add(lblInner, gbc_lblInner);
			}
			{
				textFieldInner = new JTextField();
				GridBagConstraints gbc_textFieldInner = new GridBagConstraints();
				gbc_textFieldInner.fill = GridBagConstraints.HORIZONTAL;
				gbc_textFieldInner.gridx = 2;
				gbc_textFieldInner.gridy = 4;
				panel.add(textFieldInner, gbc_textFieldInner);
				textFieldInner.setColumns(10);
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
