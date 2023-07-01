package stack;
import java.awt.EventQueue;
import geometry.Circle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import geometry.Point;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FrmStack extends JFrame {
	private DefaultListModel<Circle> dlm = new DefaultListModel();
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStack frame = new FrmStack();
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
	public FrmStack() {
		setTitle("Zecevic Jovana IT41/22");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(2, 50, 70));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(new Color(255, 255, 255));
		contentPane.add(panelSouth, BorderLayout.SOUTH);

		JList<Circle> listLst = new JList<>();
		listLst.setBackground(new Color(255, 255, 255));
		listLst.setBackground(new Color(246, 246, 246));
		listLst.setForeground(new Color(0, 0, 0));
		contentPane.add(listLst, BorderLayout.CENTER);
		listLst.setModel(dlm);



		
		JButton btnAddCircle = new JButton("ADD ");
		btnAddCircle.setForeground(new Color(255, 255, 255));
		btnAddCircle.setBackground(new Color(2, 50, 70));
		btnAddCircle.setFont(new Font("Georgia", Font.PLAIN, 10));
		btnAddCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgStack dlg = new DlgStack();
				dlg.setVisible(true);
				if(dlg.isOk() == true)
					if(dlg.isOk() == true)
					{   try {
					    if (dlg.getTextAddX().getText().isEmpty() || dlg.getTextAddY().getText().isEmpty() || dlg.getTextRadius().getText().isEmpty()) {
					        JOptionPane.showMessageDialog(null, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
					        return;
					    }

					    int x = Integer.parseInt(dlg.getTextAddX().getText());
					    int y = Integer.parseInt(dlg.getTextAddY().getText());
					    int radius = Integer.parseInt(dlg.getTextRadius().getText());

					    Circle circle = new Circle(new Point(x, y), radius);

					    dlm.add(0, circle);
					} catch (NumberFormatException ex) {
					    JOptionPane.showMessageDialog(null, "Invalid number input.", "Error", JOptionPane.ERROR_MESSAGE);
					} catch (IllegalArgumentException ex) {
					    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					}
					}
					}
			});
		panelSouth.add(btnAddCircle);

		
		JButton btnDelete = new JButton("DELETE ");
		btnDelete.setForeground(new Color(0, 64, 128));
		btnDelete.setBackground(new Color(232, 235, 228));
		btnDelete.setFont(new Font("Georgia", Font.PLAIN, 10));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int   result = JOptionPane.showConfirmDialog(null, "Da li ste sigurni", "Potvrda", JOptionPane.OK_CANCEL_OPTION);
				if (result == JOptionPane.OK_OPTION) {
			                Circle removedCircle = dlm.get(0); // Pretpostavka: Brisanje prve stavke
			                dlm.removeElement(removedCircle);
			               
					 }
				}
				catch(Exception eks) {
					JOptionPane.showInternalMessageDialog(null, "List is empty", "Information", JOptionPane.INFORMATION_MESSAGE );
				}
			}
				
				
			
		});
		panelSouth.add(btnDelete);

		
		JLabel lblTitle = new JLabel("CIRCLES");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setBackground(new Color(80, 86, 104));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
		contentPane.add(lblTitle, BorderLayout.NORTH);


		
	
	}
}