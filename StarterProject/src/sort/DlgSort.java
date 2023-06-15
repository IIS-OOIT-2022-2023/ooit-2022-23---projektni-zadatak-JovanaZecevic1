package sort;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgSort extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textX;
	private JTextField textY;
	private JTextField textRadius;
	private boolean isOkay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgSort dialog = new DlgSort();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgSort() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		setModal(true);
		{
			JPanel panelTitle = new JPanel();
			contentPanel.add(panelTitle, BorderLayout.NORTH);
			{
				JLabel lblTitleSort = new JLabel("SORT CIRCLES");
				panelTitle.add(lblTitleSort);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblAddX = new JLabel("Enter x coordinate:");
				GridBagConstraints gbc_lblAddX = new GridBagConstraints();
				gbc_lblAddX.insets = new Insets(0, 0, 5, 5);
				gbc_lblAddX.gridx = 1;
				gbc_lblAddX.gridy = 1;
				panel.add(lblAddX, gbc_lblAddX);
			}
			{
				textX = new JTextField();
				GridBagConstraints gbc_textX = new GridBagConstraints();
				gbc_textX.insets = new Insets(0, 0, 5, 5);
				gbc_textX.fill = GridBagConstraints.HORIZONTAL;
				gbc_textX.gridx = 2;
				gbc_textX.gridy = 1;
				panel.add(textX, gbc_textX);
				textX.setColumns(10);
			}
			{
				JLabel lblAddY = new JLabel("Enter y coordinate:");
				GridBagConstraints gbc_lblAddY = new GridBagConstraints();
				gbc_lblAddY.insets = new Insets(0, 0, 5, 5);
				gbc_lblAddY.gridx = 1;
				gbc_lblAddY.gridy = 2;
				panel.add(lblAddY, gbc_lblAddY);
			}
			{
				textY = new JTextField();
				GridBagConstraints gbc_textY = new GridBagConstraints();
				gbc_textY.insets = new Insets(0, 0, 5, 5);
				gbc_textY.fill = GridBagConstraints.HORIZONTAL;
				gbc_textY.gridx = 2;
				gbc_textY.gridy = 2;
				panel.add(textY, gbc_textY);
				textY.setColumns(10);
			}
			{
				JLabel lblAddRadius = new JLabel("Enter radius value:");
				GridBagConstraints gbc_lblAddRadius = new GridBagConstraints();
				gbc_lblAddRadius.insets = new Insets(0, 0, 0, 5);
				gbc_lblAddRadius.gridx = 1;
				gbc_lblAddRadius.gridy = 3;
				panel.add(lblAddRadius, gbc_lblAddRadius);
			}
			{
				textRadius = new JTextField();
				GridBagConstraints gbc_textRadius = new GridBagConstraints();
				gbc_textRadius.insets = new Insets(0, 0, 0, 5);
				gbc_textRadius.fill = GridBagConstraints.HORIZONTAL;
				gbc_textRadius.gridx = 2;
				gbc_textRadius.gridy = 3;
				panel.add(textRadius, gbc_textRadius);
				textRadius.setColumns(10);
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
						isOkay=true;
						setVisible(false);
						
					}
				});
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

	public boolean isOkay() {
		return isOkay;
	}

	public void setOkay(boolean isOkay) {
		this.isOkay = isOkay;
	}

	public JTextField getTextX() {
		return textX;
	}

	public JTextField getTextY() {
		return textY;
	}

	public JTextField getTextRadius() {
		return textRadius;
	}


	

}
