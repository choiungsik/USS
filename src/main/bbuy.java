package main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bbuy {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bbuy window = new bbuy();
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
	public bbuy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 352, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	      JLabel lbl_yes = new JLabel("");
	      lbl_yes.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		frame.dispose();
	      		buyok.main(null);
	      		
	      	}
	      });
	      lbl_yes.setBounds(53, 102, 95, 40);
	      frame.getContentPane().add(lbl_yes);
	      
	      JLabel lbl_no = new JLabel("");
	      lbl_no.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		frame.dispose();
	      		buycancel.main(null);
	      	}
	      });
	      lbl_no.setBounds(182, 102, 95, 40);
	      frame.getContentPane().add(lbl_no);
		
		 String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\bbuy.png";
	      Image image = new ImageIcon(path).getImage();
	      frame.getContentPane().setLayout(null);
	      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(251,119, image.SCALE_SMOOTH)));
	      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	      lblNewLabel.setBounds(0, 0, 336,188);
	      frame.getContentPane().add(lblNewLabel);
	     
	      
	}
}
