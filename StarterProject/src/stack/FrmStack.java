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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JList<Circle> listLst = new JList<>();
		listLst.setBackground(new Color(255, 255, 255));
		listLst.setForeground(new Color(0, 0, 0));
		contentPane.add(listLst, BorderLayout.CENTER);
		listLst.setModel(dlm);
		
		
		
		JButton btnAddCircle = new JButton("DODATI KRUG");
		btnAddCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgStack dlg = new DlgStack();
				dlg.setVisible(true);
				if(dlg.isOk() == true)
				{   try {
					int x = Integer.parseInt(dlg.getTextAddX().getText());
					int y = Integer.parseInt(dlg.getTextAddY().getText());
					int radius = Integer.parseInt(dlg.getTextRadius().getText());
					
					Circle circle = new Circle(new Point(x,y), radius);
					
					dlm.add(0, circle);
					}
				 catch (NumberFormatException ex) {
		                // Obrada izuzetka: unos nije moguće pretvoriti u broj
		                JOptionPane.showMessageDialog(null, "Nevažeći unos broja.", "Greška", JOptionPane.ERROR_MESSAGE);
				 }
				}
				}
		});
		panelSouth.add(btnAddCircle);
		
		JButton btnDelete = new JButton("OBRISATI");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int result = JOptionPane.showConfirmDialog(null, "Da li ste sigurni", "Potvrda", JOptionPane.OK_CANCEL_OPTION);
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
		
		JLabel lblTitle = new JLabel("New label");
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		
		
	
	}

}
