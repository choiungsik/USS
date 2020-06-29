package main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import plusmoim.MoimSetting;

public class book {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					book window = new book();
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
	public book() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\book.png";
		      Image image = new ImageIcon(path).getImage();
		      frame.getContentPane().setLayout(null);
		      
		      JLabel lbl_exit = new JLabel("");
		      lbl_exit.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      		frame.dispose();
		      		logoutbox.main(null);
		      	}
		      });
		      
		      JLabel lbl_set = new JLabel("");
		      lbl_set.addMouseListener(new MouseAdapter() {
		      	@Override
		      	public void mouseClicked(MouseEvent e) {
		      		frame.dispose();
		      		MoimSetting.main(null);
		      	}
		      });
		      lbl_set.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\btn_setting.PNG"));
		      lbl_set.setBounds(310, 10, 29, 35);
		      frame.getContentPane().add(lbl_set);
		      lbl_exit.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\img (3)\\delete.PNG"));
		      lbl_exit.setBounds(333, 10, 32, 35);
		      frame.getContentPane().add(lbl_exit);
		      JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_SMOOTH)));
		      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		      lblNewLabel.setBounds(0, 0, 373, 561);
		      frame.getContentPane().add(lblNewLabel);
				JLabel lbl_moim = new JLabel("");
				lbl_moim.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						moim.main(null);
					}
				});
				lbl_moim.setBounds(79, 68, 50, 31);
				frame.getContentPane().add(lbl_moim);

				JLabel lbl_search = new JLabel("");
				lbl_search.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						search.main(null);
					}
				});
				lbl_search.setBounds(151, 68, 41, 45);
				frame.getContentPane().add(lbl_search);

				JLabel lbl_home = new JLabel("");
				lbl_home.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						book.main(null);
					}
				});
				lbl_home.setBounds(28, 57, 41, 45);
				frame.getContentPane().add(lbl_home);

				JLabel whole = new JLabel("");
			
				
				JLabel lbl_chat = new JLabel("");
				lbl_chat.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						chat.main(null);
					}
				});
				lbl_chat.setBounds(269, 68, 57, 31);
				frame.getContentPane().add(lbl_chat);
				
				JLabel lbl_tab = new JLabel("");
				lbl_tab.setBounds(327, 68, 50, 31);
				frame.getContentPane().add(lbl_tab);
				
				JLabel btn_fbook = new JLabel("");
				btn_fbook.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						bbuy.main(null);
					}
				});
				btn_fbook.setBounds(286, 203, 66, 31);
				frame.getContentPane().add(btn_fbook);
				
				JLabel btn_sbook = new JLabel("");
				btn_sbook.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						bbuy.main(null);
					}
				});
				btn_sbook.setBounds(286, 335, 66, 31);
				frame.getContentPane().add(btn_sbook);
				
				JLabel btn_tbook = new JLabel("");
				btn_tbook.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						bbuy.main(null);
					}
				});
				btn_tbook.setBounds(286, 461, 66, 45);
				frame.getContentPane().add(btn_tbook);
		      
				whole.setBounds(0, 0, 377, 553);
				frame.getContentPane().add(whole);
			
		      
		
		
	}

}
