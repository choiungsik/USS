package plusmoim;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class byem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					byem window = new byem();
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
	public byem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 352, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  JLabel yes = new JLabel("");
		  yes.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent e) {
		  		frame.dispose();
		  		realbye.main(null);
		  	}
		  });
	      yes.setBounds(58, 105, 89, 48);
	      frame.getContentPane().add(yes);
	      
	      JLabel no = new JLabel("");
	      no.addMouseListener(new MouseAdapter() {
	      	@Override
	      	public void mouseClicked(MouseEvent e) {
	      		frame.dispose();
	      		MoimSetting.main(null);
	      	}
	      });
	      no.setBounds(185, 94, 89, 48);
	      frame.getContentPane().add(no);
		
		
		
		
		   String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img (3)\\byemoim.png";
		      Image image = new ImageIcon(path).getImage();
		      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(245, 120, image.SCALE_SMOOTH)));
		      lblNewLabel.setBounds(0, 0, 336, 188);
		      lblNewLabel.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      	}
		      });
		      frame.getContentPane().setLayout(null);
		      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		      frame.getContentPane().add(lblNewLabel);
		      
		    
		
	}

}
