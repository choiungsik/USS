package login;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTextField;

import chart.DBVO;
import main.home;

public class DAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	int count = 0;

	private void getConnection() {// �������ִ� �޼ҵ� �������
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private void close() {// �ݾ��ִ� �޼ҵ�
		try {
			if (rs != null) {
				rs.close();
			}
			if (conn != null) {
				conn.close();

			}
			if (psmt != null) {
				psmt.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int join(vo vo) {// ȸ������ �κ�
		// TODO Auto-generated method stub

		int cnt = 0;
		getConnection();// ��ο���޼ҵ� �ҷ���

		try {
			String sql = "insert into MEMBERS values(?, ?, ?, ?, ?, null, 'normal')";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getSex());

			cnt = psmt.executeUpdate();// executeUpdate�������� ������

		} catch (SQLException e) {
			// �� �κ��� sql�� ����ó�� ����ִ� �κ��̶� ���ܾ���
			e.printStackTrace();
			System.out.println("sql����");
		} finally {
			System.out.println("|");
			close();

		}

		return cnt; // ���� �߰��� �����ϸ� cnt�� 1�� ��

	}

	public String login(vo vo) {// �α��� �κ�
		getConnection();
		String name = null;

		try {

			String sql = "SELECT * FROM members WHERE mem_id = ? AND mem_pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			rs = psmt.executeQuery();
			// ���̵�� ��й�ȣ�� �������� �� �ٿ� �ִ� �̸��� string name�� ����
			if (rs.next()) {
				name = rs.getString("mem_id");
				// ���̵�� ��й�ȣ�� �������� �� �ٿ� �ִ� �̸��� string name�� ����
			}
		} catch (SQLException e) {
			// �� �κ��� sql�� ����ó�� ����ִ� �κ��̶� ���ܾ���
			e.printStackTrace();
		} finally {
			close();
		}
		return name;

	}

	public boolean duplibcateIdCheck(String id) {

		boolean result = false;

		getConnection();
		try {
			String sql = "select * from members where mem_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = true; // ���̵� �������� ������ false
			}

		} catch (SQLException e) {
			System.out.println("�ȵ���");
			e.printStackTrace();
		} finally {
			close();
		}
		return result;

	}

//	public ArrayList<vo> selectAll(JTextField a) {
//		ArrayList<vo> list = new ArrayList<vo>();
//
//		getConnection();// �����ε� �޼ҵ�
//		
//
//		try {
//			String sql = "select * from members";
//			psmt = conn.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				String id = rs.getString("id");				
//				vo vo = new vo(id);
//				list.add(vo);
//				if (list.equals(a)) {
//					System.out.println("�ٽ��Է�");
//					
//				}else {
//					
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			close();
//		}
//
//		return list;
//	}
//	

	public int delete(String id, String pw) {
		getConnection();
		boolean result = false;
		String sql = "delete from members where mem_id =? and mem_pw = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);// �Ű����� ���̵�
			psmt.setString(2, pw);// �Ű����� ��й�ȣ

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = true; // ���̵� �������� ������ false
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return 0;
	}

	public String interSelect(String id) {
		String inter = "";

		getConnection();
		try {
			String sql = "select mem_inter from members where mem_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				inter = rs.getString("mem_inter");
			}

		} catch (SQLException e) {
			System.out.println("�ȵ���");
			e.printStackTrace();
		} finally {
			close();
		}

		return inter;
	}

	public void UpdateTable(String id, String result) {

		getConnection();
		String sql = "update members set mem_inter = ? where mem_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, result);
			psmt.setString(2, id);// �Ű����� ���̵�

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("��ȣ�� ������Ʈ�Ϸ�");
				result = ""; // ���̵� �������� ������ false
			}

		} catch (SQLException e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		} finally {
			close();
		}

	}

	public int MoimIdSelect(String name) {
		int result = 0;
		count = 0;
		getConnection();
		try {
			String sql = "select meet_id from meetings where meet_name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = rs.getInt("meet_id");
			}

		} catch (SQLException e) {
			System.out.println("�ȵ���");
			e.printStackTrace();
		} finally {
			close();
		}

		return result;
	}

	public void JoinMeet() {
		getConnection();
		String sql = "insert into join_meet values(join_no_seq.nextval, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			System.out.println(home.moim_no);
			psmt.setInt(1, home.moim_no);// �Ű����� ���̵�
			System.out.println(login.log_id);
			psmt.setString(2, login.log_id);

			int cnt = psmt.executeUpdate();

			if (cnt > 0) {
				System.out.println("���Ӱ��ԿϷ�"); // ���̵� �������� ������ false
			}

		} catch (SQLException e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public boolean JoinMeetCheck(int meet_id) {
		boolean result = false;

		getConnection();
		try {
			String sql = "select * from join_meet where meet_id = ? and mem_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, meet_id);
			psmt.setString(2, login.log_id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = true;
			}

		} catch (SQLException e) {
			System.out.println("�ȵ���");
			e.printStackTrace();
		} finally {
			close();
		}

		return result;
	}

	public String MoimNameGet(int meet_id) {
		String result = "";
		getConnection();
		try {
			String sql = "select meet_name from meetings where meet_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, meet_id);

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = rs.getString("meet_name");
			}

		} catch (SQLException e) {
			System.out.println("�ȵ���");
			e.printStackTrace();
		} finally {
			close();
		}

		return result;
	}

	public int MoimCountGet(int meet_id) {

		getConnection();
		try {
			String sql = "select * from join_meet where meet_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, meet_id);

			rs = psmt.executeQuery();

			while (rs.next()) {
				count++;
			}

		} catch (SQLException e) {
			System.out.println("�ȵ���");
			e.printStackTrace();
		} finally {
			close();
		}

		return count;
	}

	public ArrayList<DBVO> ChartInforSelect() {

		ArrayList<DBVO> dblist = new ArrayList<DBVO>();
		getConnection();
		try {
			String sql = "select * from members m, meetings t, join_meet j where m.mem_id = j.mem_id and t.meet_id = j.meet_id and t.meet_id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, home.moim_id);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String mem_id = rs.getString(1);
				String mem_pw = rs.getString(2);
				String mem_name = rs.getString(3);
				int mem_age = Integer.parseInt(rs.getString(4));
				String mem_sex = rs.getString(5);
				String mem_inter = rs.getString(6);
				String mem_grade = rs.getString(7);
				String meet_name = rs.getString(10);
				int personnel = Integer.parseInt(rs.getString(11));
				int join_num = Integer.parseInt(rs.getString(13));
				int meet_id = Integer.parseInt(rs.getString(14));

				DBVO VO = new DBVO(mem_id, mem_pw, mem_name, mem_age, mem_sex, mem_inter, mem_grade, join_num, meet_id,
						meet_name, personnel);
				dblist.add(VO);
			}

		} catch (SQLException e) {
			System.out.println("�ȵ���");
			e.printStackTrace();
		} finally {
			close();
		}
		return dblist;
	}

	public int MoimNoSelect(String text) {
		int result = 0;
		getConnection();
		try {
			String sql = "select meet_id from meetings where meet_name = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, text);

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = rs.getInt("meet_id");
			}

		} catch (SQLException e) {
			System.out.println("�ȵ���");
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

}
