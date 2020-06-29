package moimmain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import chart.ChartView;
import login.DAO;
import main.home;
import plusmoim.JoinBeforeError;
import plusmoim.JoinMeetMember2;
import plusmoim.JoinMeetPicture2;
import plusmoim.MoimSetting;
import review.ReviewDAO;
import java.awt.Font;

public class JoinMeetReview {

	private JFrame frame;
	private JTextField text_name;
	private JTextField text_name2;
	private JTextField text_name3;
	private JTextField text_name4;
	private JTextField text_title1;
	private JTextField text_title2;
	private JTextField text_title3;
	private JTextField text_title4;
	private JTextField text_cont1;
	private JTextField text_cont2;
	private JTextField text_cont3;
	private JTextField text_cont4;
	ReviewDAO dao = new ReviewDAO();
	DAO ao = new DAO();
	private JLabel lbl_evltn;
	private JLabel lbl_exit;
	private JLabel lbl_set;
	private JLabel lbl_chart;
	private JTextField text_moimname;
	private JLabel lbl_nameblock;
	private JLabel lbl_countblock;
	private JTextField text_count;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinMeetReview window = new JoinMeetReview();
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
	public JoinMeetReview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\review.png";
		Image image = new ImageIcon(path).getImage();
		String path1 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\star1.png";
		Image image_star1 = new ImageIcon(path1).getImage();

		String path2 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\star2.png";
		Image image_star2 = new ImageIcon(path2).getImage();

		String path3 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\star3.png";
		Image image_star3 = new ImageIcon(path3).getImage();

		String path4 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\star4.png";
		Image image_star4 = new ImageIcon(path4).getImage();

		String path5 = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\star5.png";
		Image image_star5 = new ImageIcon(path5).getImage();
		
		frame.getContentPane().setLayout(null);
		
		JLabel btn_sec = new JLabel("");
		btn_sec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ao.JoinMeetCheck(home.moim_id)) {
					frame.dispose();
					JoinMeetShare.main(null);
				} else {
					JoinBeforeError.main(null);
				}
			}
		});
		
		lbl_exit = new JLabel("");
		lbl_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				home.main(null);
			}
		});
		
		lbl_set = new JLabel("");
		lbl_set.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	      		frame.dispose();
	      		MoimSetting.main(null);
			}
		});
		
		text_count = new JTextField();
		text_count.setText("0");
		text_count.setEditable(false);
		text_count.setColumns(10);
		text_count.setBorder(null);
		text_count.setBounds(105, 50, 14, 25);
		frame.getContentPane().add(text_count);
		text_count.setBorder(null);
		text_count.setText(ao.MoimCountGet(home.moim_id)+"");
		
		lbl_countblock = new JLabel("New label");
		lbl_countblock.setBounds(104, 51, 14, 22);
		frame.getContentPane().add(lbl_countblock);
		
		text_moimname = new JTextField();
		text_moimname.setText("");
		text_moimname.setHorizontalAlignment(SwingConstants.CENTER);
		text_moimname.setFont(new Font("굴림", Font.BOLD, 15));
		text_moimname.setEditable(false);
		text_moimname.setColumns(10);
		text_moimname.setBorder(null);
		text_moimname.setBounds(8, 28, 127, 29);
		frame.getContentPane().add(text_moimname);
		text_moimname.setText(ao.MoimNameGet(home.moim_id));
		text_moimname.setBorder(null);
		
		lbl_nameblock = new JLabel("");
		lbl_nameblock.setBounds(8, 30, 127, 26);
		frame.getContentPane().add(lbl_nameblock);
		lbl_set.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\btn_setting.PNG"));
		lbl_set.setBounds(293, 26, 29, 35);
		frame.getContentPane().add(lbl_set);
		lbl_exit.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\img (3)\\delete.PNG"));
		lbl_exit.setBounds(320, 26, 29, 35);
		frame.getContentPane().add(lbl_exit);
		
		lbl_evltn = new JLabel("");
		lbl_evltn.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\btn_evltn.PNG"));
		lbl_evltn.setBounds(252, 111, 89, 24);
		frame.getContentPane().add(lbl_evltn);
		btn_sec.setBounds(77, 62, 40, 39);
		frame.getContentPane().add(btn_sec);
		
		JLabel btn_third = new JLabel("");
		btn_third.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ao.JoinMeetCheck(home.moim_id)) {
					frame.dispose();
					JoinMeetPicture2.main(null);
				} else {
					frame.dispose();
					JoinBeforeError.main(null);
				}
				
			}
		});
		btn_third.setBounds(139, 62, 34, 39);
		frame.getContentPane().add(btn_third);
		
		JLabel btn_four = new JLabel("");
		btn_four.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ao.JoinMeetCheck(home.moim_id)) {
					frame.dispose();
					JoinMeetChat.main(null);
				} else {
					frame.dispose();
					JoinBeforeError.main(null);
				}
				
			}
		});
		btn_four.setBounds(185, 62, 45, 39);
		frame.getContentPane().add(btn_four);
		
		JLabel btn_five = new JLabel("");
		btn_five.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetReview.main(null);
			}
		});
		btn_five.setBounds(252, 62, 49, 39);
		frame.getContentPane().add(btn_five);
		
		JLabel btn_six = new JLabel("");
		btn_six.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (ao.JoinMeetCheck(home.moim_id)) {
					frame.dispose();
					JoinMeetMember2.main(null);
				} else {
					frame.dispose();
					JoinBeforeError.main(null);
				}
			}
		});
		btn_six.setBounds(307, 62, 57, 39);
		frame.getContentPane().add(btn_six);
		
		JLabel lbl_inter = new JLabel("");
		lbl_inter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				if (ao.JoinMeetCheck(home.moim_id)) {
					frame.dispose();
					JoinMeetAfter.main(null);
				} else {
					frame.dispose();
					JoinMeetBefore.main(null);
				}
			}
		});
		lbl_inter.setBounds(23, 62, 42, 39);
		frame.getContentPane().add(lbl_inter);
		
		text_name = new JTextField();
		text_name.setHorizontalAlignment(SwingConstants.RIGHT);
		text_name.setEditable(false);
		text_name.setColumns(10);
		text_name.setBorder(null);
		text_name.setBackground(new Color(242, 242, 242));
		text_name.setBounds(87, 146, 70, 34);
		frame.getContentPane().add(text_name);
		
		text_name2 = new JTextField();
		text_name2.setHorizontalAlignment(SwingConstants.RIGHT);
		text_name2.setEditable(false);
		text_name2.setColumns(10);
		text_name2.setBorder(null);
		text_name2.setBackground(new Color(242, 242, 242));
		text_name2.setBounds(87, 230, 70, 34);
		frame.getContentPane().add(text_name2);
		
		text_name3 = new JTextField();
		text_name3.setHorizontalAlignment(SwingConstants.RIGHT);
		text_name3.setEditable(false);
		text_name3.setColumns(10);
		text_name3.setBorder(null);
		text_name3.setBackground(new Color(242, 242, 242));
		text_name3.setBounds(87, 308, 70, 34);
		frame.getContentPane().add(text_name3);
		
		text_name4 = new JTextField();
		text_name4.setHorizontalAlignment(SwingConstants.RIGHT);
		text_name4.setEditable(false);
		text_name4.setColumns(10);
		text_name4.setBorder(null);
		text_name4.setBackground(new Color(242, 242, 242));
		text_name4.setBounds(91, 379, 66, 34);
		frame.getContentPane().add(text_name4);
		
		text_title1 = new JTextField();
		text_title1.setEditable(false);
		text_title1.setColumns(10);
		text_title1.setBorder(null);
		text_title1.setBackground(new Color(242, 242, 242));
		text_title1.setBounds(82, 174, 75, 40);
		frame.getContentPane().add(text_title1);
		
		text_title2 = new JTextField();
		text_title2.setEditable(false);
		text_title2.setColumns(10);
		text_title2.setBorder(null);
		text_title2.setBackground(new Color(242, 242, 242));
		text_title2.setBounds(90, 258, 67, 40);
		frame.getContentPane().add(text_title2);
		
		text_title3 = new JTextField();
		text_title3.setEditable(false);
		text_title3.setColumns(10);
		text_title3.setBorder(null);
		text_title3.setBackground(new Color(242, 242, 242));
		text_title3.setBounds(89, 329, 68, 40);
		frame.getContentPane().add(text_title3);
		
		text_title4 = new JTextField();
		text_title4.setEditable(false);
		text_title4.setColumns(10);
		text_title4.setBorder(null);
		text_title4.setBackground(new Color(242, 242, 242));
		text_title4.setBounds(90, 408, 67, 40);
		frame.getContentPane().add(text_title4);
		
		text_cont1 = new JTextField();
		text_cont1.setHorizontalAlignment(SwingConstants.CENTER);
		text_cont1.setEditable(false);
		text_cont1.setColumns(10);
		text_cont1.setBorder(null);
		text_cont1.setBackground(new Color(242, 242, 242));
		text_cont1.setBounds(157, 174, 207, 43);
		frame.getContentPane().add(text_cont1);
		
		text_cont2 = new JTextField();
		text_cont2.setHorizontalAlignment(SwingConstants.CENTER);
		text_cont2.setEditable(false);
		text_cont2.setColumns(10);
		text_cont2.setBorder(null);
		text_cont2.setBackground(new Color(242, 242, 242));
		text_cont2.setBounds(157, 258, 207, 43);
		frame.getContentPane().add(text_cont2);
		
		text_cont3 = new JTextField();
		text_cont3.setHorizontalAlignment(SwingConstants.CENTER);
		text_cont3.setEditable(false);
		text_cont3.setColumns(10);
		text_cont3.setBorder(null);
		text_cont3.setBackground(new Color(242, 242, 242));
		text_cont3.setBounds(157, 326, 207, 43);
		frame.getContentPane().add(text_cont3);
		
		text_cont4 = new JTextField();
		text_cont4.setHorizontalAlignment(SwingConstants.CENTER);
		text_cont4.setEditable(false);
		text_cont4.setColumns(10);
		text_cont4.setBorder(null);
		text_cont4.setBackground(new Color(242, 242, 242));
		text_cont4.setBounds(157, 405, 207, 43);
		frame.getContentPane().add(text_cont4);
		
		JLabel lbl_star1 = new JLabel("");
		lbl_star1.setBounds(161, 146, 101, 24);
		frame.getContentPane().add(lbl_star1);
		
		JLabel lbl_star2 = new JLabel("");
		lbl_star2.setBounds(157, 230, 101, 24);
		frame.getContentPane().add(lbl_star2);
		
		JLabel lbl_star3 = new JLabel("");
		lbl_star3.setBounds(157, 308, 101, 24);
		frame.getContentPane().add(lbl_star3);
		
		JLabel lbl_star4 = new JLabel("");
		lbl_star4.setBounds(157, 379, 101, 24);
		frame.getContentPane().add(lbl_star4);
		
		try {

			text_name.setText(dao.reviewNameSelect(0));

			text_title1.setText(dao.reviewTitleSelect(0));

			text_cont1.setText(dao.reviewContSelect(0));

			text_name2.setText(dao.reviewNameSelect(1));

			text_title2.setText(dao.reviewTitleSelect(1));

			text_cont2.setText(dao.reviewContSelect(1));

			text_name3.setText(dao.reviewNameSelect(2));

			text_title3.setText(dao.reviewTitleSelect(2));

			text_cont3.setText(dao.reviewContSelect(2));

			text_name4.setText(dao.reviewNameSelect(3));

			text_title4.setText(dao.reviewTitleSelect(3));

			text_cont4.setText(dao.reviewContSelect(3));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("널값생김");
		}
		
		int star1 = dao.reviewStarSelect(0);
		starMake(image_star1, image_star2, image_star3, image_star4, image_star5, lbl_star1, star1);
		int star2 = dao.reviewStarSelect(1);
		starMake(image_star1, image_star2, image_star3, image_star4, image_star5, lbl_star2, star2);
		int star3 = dao.reviewStarSelect(2);
		starMake(image_star1, image_star2, image_star3, image_star4, image_star5, lbl_star3, star3);	
		int star4 = dao.reviewStarSelect(3);
		starMake(image_star1, image_star2, image_star3, image_star4, image_star5, lbl_star4, star4);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(344, 502, image.SCALE_SMOOTH)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 376, 553);
		frame.getContentPane().add(lblNewLabel);
		
		lbl_chart = new JLabel("");
		lbl_chart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ChartView.main(null);
			}
		});
		lbl_chart.setBounds(142, 31, 57, 24);
		frame.getContentPane().add(lbl_chart);
		lbl_chart.setBounds(142, 31, 57, 24);
		frame.getContentPane().add(lbl_chart);

	}
	
	private void starMake(Image image_star1, Image image_star2, Image image_star3, Image image_star4, Image image_star5,
			JLabel lbl_star1, int star1) {
		if (star1 == 1) {
			lbl_star1.setIcon(new ImageIcon(image_star1.getScaledInstance(94, 24, image_star1.SCALE_SMOOTH)));
		} else if (star1 == 2) {
			lbl_star1.setIcon(new ImageIcon(image_star2.getScaledInstance(93, 22, image_star2.SCALE_SMOOTH)));
		} else if (star1 == 3) {
			lbl_star1.setIcon(new ImageIcon(image_star3.getScaledInstance(92, 19, image_star3.SCALE_SMOOTH)));
		} else if (star1 == 4) {
			lbl_star1.setIcon(new ImageIcon(image_star4.getScaledInstance(90, 21, image_star4.SCALE_SMOOTH)));
		} else if (star1 == 5) {
			lbl_star1.setIcon(new ImageIcon(image_star5.getScaledInstance(92, 21, image_star5.SCALE_SMOOTH)));
		}
	}
}
