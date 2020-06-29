package moimmain;

import java.awt.EventQueue;
import java.awt.Font;
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
import plusmoim.JoinMeetMember2;
import plusmoim.JoinMeetPicture2;
import plusmoim.MoimSetting;

public class JoinMeetMember {

	private JFrame frame;
	private JTextField text_moimname;
	DAO dao = new DAO();
	private JTextField text_count;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinMeetMember window = new JoinMeetMember();
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
	public JoinMeetMember() {
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
		
		
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\멤버확인.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_exit = new JLabel("");
		lbl_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				home.main(null);
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
		
		text_count = new JTextField();
		text_count.setText("0");
		text_count.setEditable(false);
		text_count.setColumns(10);
		text_count.setBorder(null);
		text_count.setBounds(105, 50, 14, 25);
		frame.getContentPane().add(text_count);
		text_count.setBorder(null);
		text_count.setText(dao.MoimCountGet(home.moim_id)+"");
		
		JLabel lbl_countblock = new JLabel("New label");
		lbl_countblock.setBounds(103, 51, 14, 22);
		frame.getContentPane().add(lbl_countblock);
		
		text_moimname = new JTextField();
		text_moimname.setText("");
		text_moimname.setHorizontalAlignment(SwingConstants.CENTER);
		text_moimname.setFont(new Font("굴림", Font.BOLD, 15));
		text_moimname.setEditable(false);
		text_moimname.setColumns(10);
		text_moimname.setBorder(null);
		text_moimname.setBounds(9, 25, 127, 29);
		frame.getContentPane().add(text_moimname);
		text_moimname.setText(dao.MoimNameGet(home.moim_id));
		text_moimname.setBorder(null);
		
		JLabel lbl_nameblock = new JLabel("");
		lbl_nameblock.setBounds(8, 26, 127, 26);
		frame.getContentPane().add(lbl_nameblock);
		lbl_set.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\btn_setting.PNG"));
		lbl_set.setBounds(308, 28, 29, 35);
		frame.getContentPane().add(lbl_set);
		lbl_exit.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\img (3)\\delete.PNG"));
		lbl_exit.setBounds(335, 28, 29, 35);
		frame.getContentPane().add(lbl_exit);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(344, 502, image.SCALE_FAST)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 376, 553);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel btn_sec = new JLabel("");
		btn_sec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetShare.main(null);
			}
		});
		btn_sec.setBounds(77, 62, 40, 39);
		frame.getContentPane().add(btn_sec);
		
		JLabel btn_third = new JLabel("");
		btn_third.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetPicture2.main(null);
			}
		});
		btn_third.setBounds(139, 62, 34, 39);
		frame.getContentPane().add(btn_third);
		
		JLabel btn_four = new JLabel("");
		btn_four.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				JoinMeetChat.main(null);
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
				frame.dispose();
				JoinMeetMember2.main(null);
			}
		});
		btn_six.setBounds(307, 62, 57, 39);
		frame.getContentPane().add(btn_six);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispose();
				JoinMeetAfter.main(null);
			}
		});
		lblNewLabel_1.setBounds(23, 62, 42, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lbl_chart = new JLabel("");
		lbl_chart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ChartView.main(null);
			}
		});
		lbl_chart.setBounds(139, 28, 57, 24);
		frame.getContentPane().add(lbl_chart);
	}
}
