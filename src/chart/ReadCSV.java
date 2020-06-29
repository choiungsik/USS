package chart;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import login.DAO;

public class ReadCSV {
	DAO dao = new DAO();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	public ArrayList<MaleVO> getList() {

		ArrayList<MaleVO> list = new ArrayList<MaleVO>();

		// 1. 파일이 존재하는 위치와 정보를 담는 객체 생성
		
		File file = new File("C:\\Users\\SMHRD\\Desktop\\모임정보데이터.csv");
	

		// 2. 파일객체를 읽어들여서 값을 꺼내는 Input 스트림 생성
		try {
			Scanner sc = new Scanner(file);
			sc.nextLine();
//			System.out.println(sc.hasNext());
//			System.out.println(sc.nextLine());
//			System.out.println(sc.nextLine());	
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] value = line.split(",");
				String id = value[0];
				String sex = value[1];
				int age = Integer.parseInt(value[2]);
				String meet_id = value[3];
				MaleVO vo = new MaleVO(id, sex, age, meet_id);
				list.add(vo);
//				System.out.print(value[0]+" ");
//				System.out.print(value[1]+" ");
//				System.out.println(value[2]);
				// , 를 제거하고 출력하세요
				// 행정 1100 1~4
				// 교육 2044 1~4

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}
	
	private void getConnection() {

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스오류");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql오류");
		}
	}

	private void close() {
		try {
			// 이 경우도 진행될지 안될지 모르는 상황이니 try ~catch 문으로 실행시켜야 정상작동함
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public ArrayList<DBVO> getDBList() {
		
				// 1. 파일이 존재하는 위치와 정보를 담는 객체 생성
		// 2. 파일객체를 읽어들여서 값을 꺼내는 Input 스트림 생성
		ArrayList<DBVO> dblist = dao.ChartInforSelect();
//				System.out.print(value[0]+" ");
//				System.out.print(value[1]+" ");
//				System.out.println(value[2]);
				// , 를 제거하고 출력하세요
				// 행정 1100 1~4
				// 교육 2044 1~4
		return dblist;

	}

}
