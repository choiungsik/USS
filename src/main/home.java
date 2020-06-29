package main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import login.DAO;
import meeting.meetin;
import moimmain.JoinMeetAfter;
import moimmain.JoinMeetBefore;
import plusmoim.MoimSetting;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class home {

	JFrame frame;
	private homeDAO dao = new homeDAO();
	DAO ao = new DAO();
	public static int moim_no = 0;
	public static int moim_id;
	boolean flag = false;
	boolean flag2 = false;
	boolean flag3 = false;
	boolean flag4 = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
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
	public home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbl_makemoim = new JLabel("");
		lbl_makemoim.setBounds(247, 508, 118, 35);
		lbl_makemoim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				meetin.main(null);
			}
		});

		JLabel lbl_exit = new JLabel("");
		lbl_exit.setBounds(336, 10, 29, 35);
		lbl_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				logoutbox.main(null);

			}
		});

		JLabel lbl_set = new JLabel("");
		lbl_set.setBounds(312, 10, 29, 35);
		lbl_set.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MoimSetting.main(null);
			}
		});
		frame.getContentPane().setLayout(null);
		lbl_set.setIcon(new ImageIcon(
				"C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\btn_setting.PNG"));
		frame.getContentPane().add(lbl_set);
		lbl_exit.setIcon(new ImageIcon(
				"C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img (3)\\delete.PNG"));
		frame.getContentPane().add(lbl_exit);

		JLabel lblNewLabel_1 = new JLabel(
				"\uC624\uB298 \uC2DC\uC791\uD560 \uBAA8\uC784\uC744 \uB0B4\uC77C\uB85C \uBBF8\uB8E8\uC9C0 \uB9D0\uB77C  ");
		lblNewLabel_1.setBounds(38, 121, 296, 21);
		lblNewLabel_1.setFont(new Font("HY중고딕", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lbl_makemoim);

		JLabel lbl_tab = new JLabel("");
		lbl_tab.setBounds(327, 74, 41, 45);
		frame.getContentPane().add(lbl_tab);

		JLabel lbl_mname1 = new JLabel("");
		lbl_mname1.setBounds(90, 227, 200, 31);
		lbl_mname1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				moim_id = ao.MoimIdSelect(lbl_mname1.getText());
				moim_no = ao.MoimNoSelect(lbl_mname1.getText());
				if (ao.JoinMeetCheck(moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_mname1.setFont(new Font("맑은 고딕", Font.BOLD, 12));

		String text = dao.meetName();
		lbl_mname1.setText(text);
		frame.getContentPane().add(lbl_mname1);

		JLabel lbl_mname2 = new JLabel("");
		lbl_mname2.setBounds(90, 293, 200, 31);
		lbl_mname2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				moim_id = ao.MoimIdSelect(lbl_mname2.getText());
				moim_no = ao.MoimNoSelect(lbl_mname2.getText());
				if (ao.JoinMeetCheck(moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_mname2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		String text2 = dao.meetName();
		lbl_mname2.setText(text2);
		frame.getContentPane().add(lbl_mname2);

		JLabel lbl_mname3 = new JLabel("");
		lbl_mname3.setBounds(90, 353, 200, 31);
		lbl_mname3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				moim_id = ao.MoimIdSelect(lbl_mname3.getText());
				moim_no = ao.MoimNoSelect(lbl_mname3.getText());
				frame.dispose();
				if (ao.JoinMeetCheck(moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_mname3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		String text3 = dao.meetName();
		lbl_mname3.setText(text3);
		frame.getContentPane().add(lbl_mname3);

		JLabel lbl_mname4 = new JLabel("");
		lbl_mname4.setBounds(90, 416, 200, 31);
		lbl_mname4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				moim_id = ao.MoimIdSelect(lbl_mname4.getText());
				moim_no = ao.MoimNoSelect(lbl_mname4.getText());
				if (ao.JoinMeetCheck(moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_mname4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		String text4 = dao.meetName();
		lbl_mname4.setText(text4);
		frame.getContentPane().add(lbl_mname4);

		String path2 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\grayheart.png";
		Image image2 = new ImageIcon(path2).getImage();
		JLabel heart_2 = new JLabel(new ImageIcon(image2.getScaledInstance(45, 36, image2.SCALE_SMOOTH)));
		heart_2.setBounds(302, 293, 45, 36);
		heart_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(heart_2);

		String path3 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\grayheart.png";
		Image image3 = new ImageIcon(path3).getImage();
		JLabel heart_3 = new JLabel(new ImageIcon(image3.getScaledInstance(45, 36, image3.SCALE_SMOOTH)));
		heart_3.setBounds(302, 353, 45, 45);
		heart_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(heart_3);

		String path4 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\grayheart.png";
		Image image4 = new ImageIcon(path4).getImage();
		JLabel heart_4 = new JLabel(new ImageIcon(image4.getScaledInstance(45, 36, image4.SCALE_SMOOTH)));
		heart_4.setBounds(298, 411, 52, 50);
		heart_4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(heart_4);

		String path5 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\grayheart.png";
		Image image5 = new ImageIcon(path5).getImage();
		
		
		JLabel heart_1 = new JLabel(new ImageIcon(image5.getScaledInstance(45, 36, image5.SCALE_SMOOTH)));
		heart_1.setBounds(301, 223, 45, 43);
		heart_1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(heart_1);
		
				JLabel gray1 = new JLabel("");
				gray1.setBounds(303, 225, 35, 35);
				gray1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (flag) {
							heart_1.setVisible(true);
						} else {
							heart_1.setVisible(false);
						}
						flag = !flag;
					}
				});
				frame.getContentPane().add(gray1);
		

		JLabel gray2 = new JLabel("");
		gray2.setBounds(302, 291, 35, 35);
		gray2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (flag2) {
					heart_2.setVisible(true);
				} else {
					heart_2.setVisible(false);
				}
				flag2 = !flag2;
			}
		});
		
		frame.getContentPane().add(gray2);

		JLabel gray3 = new JLabel("");
		gray3.setBounds(307, 359, 35, 35);
		gray3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (flag3) {
					heart_3.setVisible(true);
				} else {
					heart_3.setVisible(false);
				}
				flag3 = !flag3;
			}
		});
		frame.getContentPane().add(gray3);

		JLabel gray4 = new JLabel("");
		gray4.setBounds(310, 417, 35, 35);
		gray4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (flag4) {
					heart_4.setVisible(true);
				} else {
					heart_4.setVisible(false);
				}
				flag4 = !flag4;
			}
		});
		
		frame.getContentPane().add(gray4);

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\메인창.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 377, 553);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);

		JLabel lbl_moim = new JLabel("");
		lbl_moim.setBounds(79, 68, 50, 31);
		lbl_moim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				moim.main(null);
			}
		});
		frame.getContentPane().add(lbl_moim);

		JLabel lbl_search = new JLabel("");
		lbl_search.setBounds(150, 74, 41, 45);
		lbl_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				search.main(null);
			}
		});
		frame.getContentPane().add(lbl_search);

		JLabel lbl_book = new JLabel("");
		lbl_book.setBounds(213, 74, 41, 45);
		lbl_book.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				book.main(null);
			}
		});
		frame.getContentPane().add(lbl_book);

		JLabel lbl_chat = new JLabel("");
		lbl_chat.setBounds(274, 74, 41, 45);
		lbl_chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				chat.main(null);
			}
		});
		frame.getContentPane().add(lbl_chat);

	}
}
