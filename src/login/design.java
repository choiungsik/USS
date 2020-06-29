package login;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class design {

	private JFrame frame;
	private JLabel lbl_image;
	int cnt = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					design window = new design();
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
	public design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 393, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 370, 584);
		frame.getContentPane().add(panel);

		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\메인2.png";
		Image image = new ImageIcon(path).getImage();
		panel.setLayout(null);

//		String path2 = "C:\\Users\\SMHRD\\Desktop\\자바(5.28~)\\eclipse-jee-2019-12-R-win32-x86_64\\eclipse\\img\\일단.png";
//		Image image2 = new ImageIcon(path2).getImage();
//		JLabel lblNewLabel_1 = new JLabel();
//		lblNewLabel_1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				cnt++;
//				if (cnt % 2 == 0) {
//					lblNewLabel_1.setIcon(new ImageIcon(image2.getScaledInstance(166, 80, Image.SCALE_SMOOTH)));
//				} else {
//					String path3 = "C:\\Users\\SMHRD\\Desktop\\자바(5.28~)\\eclipse-jee-2019-12-R-win32-x86_64\\eclipse\\img\\일단2.png";
//					lblNewLabel_1.setIcon(new ImageIcon(
//							new ImageIcon(path3).getImage().getScaledInstance(166, 80, Image.SCALE_SMOOTH)));
//				}
//			}
//		});
//		lblNewLabel_1.setBounds(117, 437, 153, 52);
//		panel.add(lblNewLabel_1);

		// 라벨에 픽셀 , setBounds도 맞춰주세요!
		lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(388, 564, Image.SCALE_AREA_AVERAGING)));
		lbl_image.setBounds(0, 0, 388, 564);
		panel.add(lbl_image);
		
		JLabel btn_moni = new JLabel("New label");
		btn_moni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				login.main(null);
				
			}
		});
		btn_moni.setBounds(121, 436, 114, 50);
		panel.add(btn_moni);

	}
}
