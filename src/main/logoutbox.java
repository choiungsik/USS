package main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import login.login;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class logoutbox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logoutbox window = new logoutbox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public logoutbox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 352, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\logout.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(296, 148, image.SCALE_FAST)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(-16, 0, 352, 227);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbl_cancel = new JLabel("New label");
		lbl_cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				home.main(null);
				
				
			}
		});
		lbl_cancel.setBounds(12, 115, 146, 57);
		frame.getContentPane().add(lbl_cancel);
		
		JLabel lbl_ok = new JLabel("New label");
		lbl_ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				login.main(null);
				
			}
		});
		lbl_ok.setBounds(161, 115, 146, 57);
		frame.getContentPane().add(lbl_ok);
				
	}

}
