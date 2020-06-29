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

		// 1. ������ �����ϴ� ��ġ�� ������ ��� ��ü ����
		
		File file = new File("C:\\Users\\SMHRD\\Desktop\\��������������.csv");
	

		// 2. ���ϰ�ü�� �о�鿩�� ���� ������ Input ��Ʈ�� ����
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
				// , �� �����ϰ� ����ϼ���
				// ���� 1100 1~4
				// ���� 2044 1~4

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
			System.out.println("Ŭ��������");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql����");
		}
	}

	private void close() {
		try {
			// �� ��쵵 ������� �ȵ��� �𸣴� ��Ȳ�̴� try ~catch ������ ������Ѿ� �����۵���
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
		
				// 1. ������ �����ϴ� ��ġ�� ������ ��� ��ü ����
		// 2. ���ϰ�ü�� �о�鿩�� ���� ������ Input ��Ʈ�� ����
		ArrayList<DBVO> dblist = dao.ChartInforSelect();
//				System.out.print(value[0]+" ");
//				System.out.print(value[1]+" ");
//				System.out.println(value[2]);
				// , �� �����ϰ� ����ϼ���
				// ���� 1100 1~4
				// ���� 2044 1~4
		return dblist;

	}

}
