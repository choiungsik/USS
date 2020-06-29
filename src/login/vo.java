package login;

import java.util.ArrayList;

public class vo {
	static ArrayList<vo> arrlist = new ArrayList<vo>();
	String id;
	String pw;
	String sex;
	int age;
	String name;

	public vo(String id, String pw, String name, int age, String sex) {
		super();
		this.id = id;
		this.pw = pw;
		this.sex = sex;
		this.age = age;
		this.name = name;
	}
	

	public vo(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}


	public vo() {
	}


	public vo(String id) {
		
		this.id = id;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
