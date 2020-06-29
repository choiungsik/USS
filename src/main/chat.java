package main;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import plusmoim.MoimSetting;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class chat {

	private JFrame frame;
	private JTextField txt_insert;
	private JTextField textField;
	private JTextField textField_1;
	private homeDAO dao = new homeDAO();
	private ArrayList<String> list = new ArrayList<String>();
	private String str = "";
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chat window = new chat();
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
	public chat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\chat.png";
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
		lbl_set.setBounds(313, 10, 29, 35);
		frame.getContentPane().add(lbl_set);
		lbl_exit.setIcon(new ImageIcon("C:\\Users\\smhrd\\Downloads\\\uC218\uC5C5\uB0B4\uC6A9\uC815\uB9AC\\\uC791\uC5C5\\javaworkspace\\total\\src\\icon\\img (3)\\delete.PNG"));
		lbl_exit.setBounds(336, 10, 29, 35);
		frame.getContentPane().add(lbl_exit);
		
		
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(377, 553, image.SCALE_SMOOTH)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 377, 553);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lbl_home = new JLabel("New label");
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				home.main(null);
			}
		});
		lbl_home.setBounds(12, 59, 46, 33);
		frame.getContentPane().add(lbl_home);

		JLabel lbl_moim = new JLabel("New label");
		lbl_moim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				moim.main(null);
			}
		});
		lbl_moim.setBounds(70, 59, 46, 33);
		frame.getContentPane().add(lbl_moim);

		JLabel lbl_search = new JLabel("New label");
		lbl_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				search.main(null);
			}
		});
		lbl_search.setBounds(148, 59, 46, 33);
		frame.getContentPane().add(lbl_search);

		JLabel lbl_book = new JLabel("New label");
		lbl_book.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				book.main(null);
			}
		});
		lbl_book.setBounds(206, 59, 46, 33);
		frame.getContentPane().add(lbl_book);

		JLabel lbl_tab = new JLabel("New label");
		lbl_tab.setBounds(331, 59, 46, 33);
		frame.getContentPane().add(lbl_tab);

		txt_insert = new JTextField();
		txt_insert.setText("");
		txt_insert.setBorder(null);
		txt_insert.setBounds(12, 503, 272, 21);
		frame.getContentPane().add(txt_insert);
		txt_insert.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setFont(new Font("굴림", Font.PLAIN, 15));
		textField_1.setBackground(new Color(127, 140, 141));
		textField_1.setText("");
		textField_1.setBorder(null);
		textField_1.setBounds(165, 134, 152, 53);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel btn_send = new JLabel("");
		btn_send.setBounds(293, 484, 81, 63);
		frame.getContentPane().add(btn_send);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setForeground(Color.BLACK);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBackground(new Color(224, 224, 224));
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(32, 225, 152, 53);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setForeground(Color.WHITE);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBackground(new Color(127, 140, 141));
		textField_3.setText("");
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(165, 312, 152, 53);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setForeground(Color.BLACK);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBackground(new Color(224, 224, 224));
		textField_4.setText("");
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBounds(32, 408, 152, 53);
		frame.getContentPane().add(textField_4);

		btn_send.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {

				
				list.add(txt_insert.getText());
				textField_1.setText(list.get(0));
				txt_insert.setText("");
				textField_2.setText(list.get(1));
				txt_insert.setText("");
				textField_3.setText(list.get(2));
				txt_insert.setText("");
				textField_4.setText(list.get(3));
				txt_insert.setText("");
				
				

			}

		});

	}

}
