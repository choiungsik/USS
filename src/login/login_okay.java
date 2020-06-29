package login;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import main.home;
import moimmain.InterSelect;

public class login_okay {

	private JFrame frame;
	DAO dao = new DAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_okay window = new login_okay();
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
	public login_okay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 352, 227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String path = "C:\\Users\\smhrd\\Downloads\\수업내용정리\\작업\\javaworkspace\\total\\src\\icon\\sul\\login_okay.png";
		Image image = new ImageIcon(path).getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image.getScaledInstance(251, 119, image.SCALE_FAST)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 324, 188);
		frame.getContentPane().add(lblNewLabel);

		JLabel btn_ok = new JLabel("New label");
		btn_ok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String inter = dao.interSelect(login.log_id);
				if (inter == null) {
					frame.dispose();
					InterSelect.main(null);
				} else {
					frame.dispose();
					home.main(null);
				}
			}
		});
		btn_ok.setBounds(72, 110, 191, 23);
		frame.getContentPane().add(btn_ok);

	}

}
