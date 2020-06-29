package main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import login.DAO;
import meeting.meetin;
import plusmoim.MoimSetting;
import java.awt.Font;

public class moim {

	private JFrame frame;
	private homeDAO dao = new homeDAO();
	DAO ao = new DAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					moim window = new moim();
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
	public moim() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lbl_moimmake = new JLabel("");
		lbl_moimmake.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				meetin.main(null);
			}
		});
		
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
		lbl_set.setBounds(314, 10, 29, 35);
		frame.getContentPane().add(lbl_set);
		lbl_exit.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\img (3)\\delete.PNG"));
		lbl_exit.setBounds(339, 10, 29, 35);
		frame.getContentPane().add(lbl_exit);
		lbl_moimmake.setBounds(258, 511, 110, 32);
		frame.getContentPane().add(lbl_moimmake);

		JLabel lbl_tab = new JLabel("");
		lbl_tab.setBounds(327, 74, 41, 45);
		frame.getContentPane().add(lbl_tab);

		JLabel moim1 = new JLabel("");
		moim1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		String text = dao.meetinter();
		moim1.setText(text);
		moim1.setBounds(23, 235, 196, 22);
		frame.getContentPane().add(moim1);

		JLabel moim2 = new JLabel("");
		moim2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		String text2 = dao.meetinter();
		moim2.setText(text2);
		moim2.setBounds(23, 305, 196, 22);
		frame.getContentPane().add(moim2);

		JLabel moim3 = new JLabel("");
		moim3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		String text3 = dao.meetinter();
		moim3.setText(text3);
		moim3.setBounds(23, 360, 196, 22);
		frame.getContentPane().add(moim3);

		JLabel moim4 = new JLabel("");
		moim4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		String text4 = dao.meetinter();
		moim4.setText(text4);
		moim4.setBounds(23, 422, 196, 22);
		frame.getContentPane().add(moim4);

		String path = "C:\\Users\\smhrd\\Downloads\\¼ö¾÷³»¿ëÁ¤¸®\\ÀÛ¾÷\\javaworkspace\\total\\src\\icon\\°ü½É¸ðÀÓÃ¢.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_SMOOTH)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 377, 553);
		frame.getContentPane().add(lblNewLabel);

		JLabel lbl_moim = new JLabel("");
		lbl_moim.setBounds(87, 74, 41, 45);
		frame.getContentPane().add(lbl_moim);

		JLabel lbl_home = new JLabel("");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				home.main(null);
			}
		});
		lbl_home.setBounds(23, 62, 41, 45);
		frame.getContentPane().add(lbl_home);

		JLabel lbl_search = new JLabel("");
		lbl_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				search.main(null);
			}
		});
		lbl_search.setBounds(150, 74, 41, 45);
		frame.getContentPane().add(lbl_search);

		JLabel lbl_book = new JLabel("");
		lbl_book.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				book.main(null);
			}
		});
		lbl_book.setBounds(213, 74, 41, 45);
		frame.getContentPane().add(lbl_book);

		JLabel lbl_chat = new JLabel("");
		lbl_chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				chat.main(null);
			}
		});
		lbl_chat.setBounds(274, 74, 41, 45);
		frame.getContentPane().add(lbl_chat);

	}
}
