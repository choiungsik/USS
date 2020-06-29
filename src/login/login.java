package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import join.join;

import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login {

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	DAO dao = new DAO();
	public static String log_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
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

		JLabel btn_login = new JLabel("");
		btn_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String id = txt_id.getText(); // 아이디 가져와서 값 넣고
				String pw = txt_pw.getText();// 비번 가져와서 값 넣고
//				System.out.println("아이디: "+ id + "패스워드: "+ pw );
				txt_id.setText(""); // 보여줄때 공백으로 보여주기
				txt_pw.setText(""); // 보여줄때 공백으로 보여주기

				vo vo = new vo(id, pw);
				String name = dao.login(vo);
				log_id = name;
				if (name != null) { // 로그인 성공
					frame.dispose();
					login_okay.main(null);
				} else {
					frame.dispose();
					login_fail.main(null);
				}

			}
		});
		btn_login.setBounds(28, 332, 318, 28);
		frame.getContentPane().add(btn_login);

		JLabel btn_join = new JLabel("");
		btn_join.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				join.main(null);
			}
		});
		btn_join.setBounds(28, 399, 318, 28);
		frame.getContentPane().add(btn_join);

		txt_id = new JTextField();
		txt_id.setBounds(101, 175, 206, 41);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		txt_id.setBorder(null);

		txt_pw = new JPasswordField();
		txt_pw.setBounds(101, 239, 206, 41);
		frame.getContentPane().add(txt_pw);
		txt_pw.setBorder(null);

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\login.png";
		Image image = new ImageIcon(path).getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_FAST)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 377, 553);
		frame.getContentPane().add(lblNewLabel);

	}
}
