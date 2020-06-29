package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.print.DocFlavor.CHAR_ARRAY;

import login.DAO;
import login.vo;

public class homeDAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String log_id;
	private String name;
	DAO dao = new DAO();

	int count = 0;

	private void getConnection() {// 연결해주는 메소드 만들어줌
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

	private void close() {// 닫아주는 메소드
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

	public int join(vo vo) {// 회원가입 부분
		// TODO Auto-generated method stub

		int cnt = 0;
		getConnection();// 통로연결메소드 불러옴

		try {
			String sql = "insert into MEMBERS values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());

			cnt = psmt.executeUpdate();// executeUpdate리턴형은 정수형

		} catch (SQLException e) {
			// 이 부분은 sql문 예외처리 잡아주는 부분이라 남겨야함
			e.printStackTrace();
		} finally {

			close();

		}

		return cnt; // 정보 추가에 성공하면 cnt가 1이 됨

	}

	public String login(vo vo) {// 로그인 부분
		getConnection();
		String name = null;

		try {

			String sql = "SELECT * FROM Meetings WHERE ID = ? AND PW  = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPw());
			log_id = vo.getId();
			rs = psmt.executeQuery();
			// 아이디와 비밀번호를 가져오면 그 줄에 있는 이름을 string name에 넣음
			if (rs.next()) {
				name = rs.getString("name");
				// 아이디와 비밀번호를 가져오면 그 줄에 있는 이름을 string name에 넣음
			}
		} catch (SQLException e) {
			// 이 부분은 sql문 예외처리 잡아주는 부분이라 남겨야함
			e.printStackTrace();
		} finally {
			close();
		}
		return name;

	}

	//
	public String searchVO(String str) {// search method
		getConnection();
		
		try {

			String sql = "SELECT MEET_NAME FROM Meetings WHERE MEET_INTER =? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, str);
			rs = psmt.executeQuery();
			// 아이디와 비밀번호를 가져오면 그 줄에 있는 이름을 string name에 넣음
			for (int i = 0; i < count; i++) {
				rs.next();
			}
			if (rs.next()) {
				name = rs.getString("meet_name");
				// 아이디와 비밀번호를 가져오면 그 줄에 있는 이름을 string name에 넣음
			}
		} catch (SQLException e) {
			// 이 부분은 sql문 예외처리 잡아주는 부분이라 남겨야함
			e.printStackTrace();
		} finally {
			count++;
			close();
		}
		return name;

	}

	public String meetName() {
		String name = "";

		getConnection();
		try {
			String sql = "select * from Meetings";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			for (int i = 0; i < count; i++) {
				rs.next();
			}
			if (rs.next()) {
				name = rs.getString("meet_name");
				// 아이디와 비밀번호를 가져오면 그 줄에 있는 이름을 string name에 넣음
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			count++;
			close();
		}
		return name;

	}

	public String meetinter() {
		String send = "";

		getConnection();
		String inter = dao.interSelect(login.login.log_id);
		ArrayList arr = new ArrayList();
		
		for (int i = 0; i < inter.length(); i++) {
			arr.add(inter.charAt(i));
		}
		
		try {

			String sql = "select meet_name from meetings where meet_inter like substr((select mem_inter from members where mem_id = ?),1,5)";

			for (int i = 1; i < arr.size()/5; i++) {
				sql += " or meet_inter like substr((select mem_inter from members where mem_id = ?),"+(3+i*5)+", 5)";
			}
			psmt = conn.prepareStatement(sql);
			for (int i = 0; i < arr.size()/5; i++) {
				psmt.setString(1+i, login.login.log_id);
				
			}
			rs = psmt.executeQuery();
			for (int i = 0; i < count; i++) {
				rs.next();
			}
			if (rs.next()) {
				// name = rs.getString("meet_inter");
//	        	 	name = Integer.parseInt(rs.getString("MEET_INTER"));
				// 아이디와 비밀번호를 가져오면 그 줄에 있는 이름을 string name에 넣음
				send = rs.getString("MEET_NAME");

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			count++;
			close();
		}
		return send;

	}

	//

//	public ArrayList<vo> selectAll(JTextField a) {
//		ArrayList<vo> list = new ArrayList<vo>();
//
//		getConnection();// 동적로딩 메소드
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
//					System.out.println("다시입력");
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
		String sql = "delete from members where id =? and pw = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);// 매개변수 아이디
			psmt.setString(2, pw);// 매개변수 비밀번호

			int cnt = psmt.executeUpdate();

			if (cnt != 0) {
				return cnt;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return 0;
	}

}
