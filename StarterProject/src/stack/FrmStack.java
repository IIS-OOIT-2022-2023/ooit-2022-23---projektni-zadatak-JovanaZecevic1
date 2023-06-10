package stack;

import java.awt.EventQueue;

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

public class FrmStack extends JFrame {
	private DefaultListModel<String> dlm = new DefaultListModel();
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblCircle = new JLabel("Krugovi");
		panel.add(lblCircle);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnAddCircle = new JButton("DODATI KRUG");
		btnAddCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgStack dlg = new DlgStack();
				dlg.setVisible(true);
				if(dlg.isOk() == true)//Ako je korisnik potvrdio unos u okviru dijaloga
				{
					dlm.addElement(dlg.getTextAddX().getText() + " " +
				                   dlg.getTextAddY().getText() + " " +
				                   dlg.getTextRadius().getText());
				}
			}
		});
		panel_1.add(btnAddCircle);
		
		JButton btnDelete = new JButton("OBRISATI");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Da li ste sigurni", "Potvrda", JOptionPane.QUESTION_MESSAGE);
				
				
			}
		});
		panel_1.add(btnDelete);
		
		JList listLst = new JList();
		contentPane.add(listLst, BorderLayout.EAST);
		listLst.setModel(dlm);
	}

}
