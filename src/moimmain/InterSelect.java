package moimmain;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import login.DAO;
import main.home;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterSelect {

	private JFrame frame;
	private int count = 0;
	DAO dao = new DAO();
	private String result = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterSelect window = new InterSelect();
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
	public InterSelect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JLabel lbl_music = new JLabel("");
		lbl_music.setBounds(43, 113, 112, 113);
		frame.getContentPane().add(lbl_music);

		JLabel lbl_study = new JLabel("");
		lbl_study.setBounds(214, 113, 112, 113);
		frame.getContentPane().add(lbl_study);

		JLabel lbl_art = new JLabel("");
		lbl_art.setBounds(43, 262, 112, 113);
		frame.getContentPane().add(lbl_art);

		JLabel lbl_sport = new JLabel("");
		lbl_sport.setBounds(214, 262, 112, 113);
		frame.getContentPane().add(lbl_sport);

		JLabel btn_next = new JLabel("");
		btn_next.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				dao.UpdateTable(login.login.log_id, result);
				frame.dispose();
				home.main(null);									// 다음 클릭시 메인화면 
			}
		});
		btn_next.setBounds(122, 435, 129, 54);
		frame.getContentPane().add(btn_next);
		
		String draw  = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\draw.png";
		Image image1 = new ImageIcon(draw).getImage();
		frame.getContentPane().setLayout(null);
		JLabel btn_art = new JLabel(new ImageIcon(image1.getScaledInstance(105,103, image1.SCALE_SMOOTH)));
		btn_art.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count > 0) {
					result += ", art";
				} else {
					result = "art";
					count++;
				}
				btn_art.setVisible(false);                           // art 클릭시 파란아이콘
			}
		});
		btn_art.setHorizontalAlignment(SwingConstants.CENTER);
		btn_art.setBounds(50, 262, 105,113);
		frame.getContentPane().add(btn_art);
		
		String sports = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\sports.png";
		Image image2 = new ImageIcon(sports).getImage();
		JLabel btn_sport = new JLabel(new ImageIcon(image2.getScaledInstance(105,103, image2.SCALE_SMOOTH)));
		btn_sport.addMouseListener(new MouseAdapter() {
				
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count > 0) {
					result += ", sport";
				} else {
					result = "sport";
					count++;
				}
				btn_sport.setVisible(false);						 // sport 클릭시 파란아이콘
			}
		});
		btn_sport.setHorizontalAlignment(SwingConstants.CENTER);
		btn_sport.setBounds(214, 262, 112,113);
		frame.getContentPane().add(btn_sport);
		frame.getContentPane().setLayout(null);
		
		String music = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\music.png";
		Image image3 = new ImageIcon(music).getImage();
		frame.getContentPane().setLayout(null);
		JLabel btn_music = new JLabel(new ImageIcon(image3.getScaledInstance(105,103, image3.SCALE_SMOOTH)));
		btn_music.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent e) {
				if (count > 0) {
					result += ", music";
				} else {
					result = "music";
					count++;
				}
				btn_music.setVisible(false);						// music 클릭시 파란아이콘
			}
		});
		btn_music.setHorizontalAlignment(SwingConstants.CENTER);
		btn_music.setBounds(43, 113,112,113);
		frame.getContentPane().add(btn_music);
		
		String study = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\study.png";
		Image image4 = new ImageIcon(study).getImage();
		frame.getContentPane().setLayout(null);
		JLabel btn_study = new JLabel(new ImageIcon(image4.getScaledInstance(105,103, image4.SCALE_SMOOTH)));
		btn_study.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (count > 0) {
					result += ", study";
				} else {
					result = "study";
					count++;
				}
				btn_study.setVisible(false);						// study 클릭시 파란아이콘
			}
		});
		btn_study.setHorizontalAlignment(SwingConstants.CENTER);
		btn_study.setBounds(214, 113, 112,113);
		frame.getContentPane().add(btn_study);
	
		
		

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\img\\interests.png";
		Image image = new ImageIcon(path).getImage();
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(342, 500, image.SCALE_SMOOTH)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 376, 553);
		frame.getContentPane().add(lblNewLabel);

	}

}
