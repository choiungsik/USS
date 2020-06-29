package join;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import login.DAO;
import login.login;
import login.vo;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class join {

	private JFrame frame;

	private JTextField txt_id;
	private JTextField txt_name;
	private JTextField txt_age;
	private JPasswordField txt_pw;
	private JRadioButton rd_woman;
	private JLabel btn_joincheck;
	private static String mem_id;
	private String mem_name;
	private static String mem_pw;
	private int mem_age;
	private String mem_sex;
	DAO dao = new DAO();
	private JLabel lbl_exit;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					join window = new join();
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
	public join() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lbl_exit = new JLabel("");
		lbl_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				login.main(null);
			}
		});
		lbl_exit.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\img (3)\\delete.PNG"));
		lbl_exit.setBounds(336, 10, 29, 35);
		frame.getContentPane().add(lbl_exit);

		txt_id = new JTextField();
		txt_id.setBounds(94, 115, 148, 37);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		txt_id.setOpaque(false);
		txt_id.setBorder(null);

		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(94, 243, 148, 31);
		frame.getContentPane().add(txt_name);
		txt_name.setOpaque(false);
		txt_name.setBorder(null);

		txt_age = new JTextField();
		txt_age.setForeground(SystemColor.controlText);
		txt_age.setColumns(10);
		txt_age.setBounds(85, 304, 157, 31);
		frame.getContentPane().add(txt_age);
		txt_age.setOpaque(false);
		txt_age.setBorder(null);

		txt_pw = new JPasswordField();
		txt_pw.setText("");
		txt_pw.setBounds(94, 175, 148, 37);
		frame.getContentPane().add(txt_pw);
		txt_pw.setOpaque(false);
		txt_pw.setBorder(null);

		JLabel id_check = new JLabel("");
		id_check.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 중복체크
				String id = txt_id.getText();
				boolean result = dao.duplibcateIdCheck(id);
				if (result == true) {
					id_doublecheck.main(null);
//					txt_id.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "아이디 사용이 가능합니다.", "아이디", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		id_check.setBounds(275, 115, 64, 25);
		frame.getContentPane().add(id_check);

		JRadioButton rd_man = new JRadioButton("");
		rd_man.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				mem_sex = "male";
			}
		});
		rd_man.setBounds(94, 359, 21, 44);
		rd_man.setOpaque(false);//라디오 버튼 배경 없애기
		frame.getContentPane().add(rd_man);

		rd_woman = new JRadioButton("");//라디오 버튼 배경 없애기
		rd_woman.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				mem_sex = "female";
			}
		});
		rd_woman.setBounds(197, 359, 21, 44);
		rd_woman.setOpaque(false);
		frame.getContentPane().add(rd_woman);

		ButtonGroup group = new ButtonGroup();
		group.add(rd_man);
		group.add(rd_woman);

		btn_joincheck = new JLabel("");
		btn_joincheck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mem_pw = txt_pw.getText();
				mem_name = txt_name.getText();
				mem_id = txt_id.getText();
				mem_age = Integer.parseInt(txt_age.getText());
				vo vo = new vo(mem_id, mem_pw, mem_name, mem_age,mem_sex);
				dao.join(vo);
				join_okay.main(null);
				frame.dispose();
				
			}
		});
		btn_joincheck.setBounds(135, 472, 107, 44);
		frame.getContentPane().add(btn_joincheck);

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\join.png";
		Image image = new ImageIcon(path).getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_SMOOTH)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 373, 561);
		frame.getContentPane().add(lblNewLabel);

	}
}
