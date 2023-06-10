package drawing;

import javax.swing.JFrame;

public class TestFrame {


	public static void main(String[] args) {
		JFrame frame = new JFrame();
		DrawingPanel panel = new DrawingPanel();
		frame.getContentPane().add(panel);
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);

	}

}