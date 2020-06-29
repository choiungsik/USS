package chart;

public class DBVO {
	
	private String mem_id;
	private String mem_pw;
	private String mem_name;
	private int mem_age;
	private String mem_sex;
	private String mem_inter;
	private String mem_grade;
	
	
	private int join_num;
	private int meet_id;
	private String meet_name;
	private int personnel;
	
	
	private int review_no;
	private int review_star;
	private String review_title;
	private String review_cont;
	
	
	private int book_no;
	private String book_name;
	private String book_price;
	private String book_cont;
	private String book_date;
	private int buy;
	private String buy_id;
	
	public DBVO(String mem_id, String mem_pw, String mem_name, int mem_age, String mem_sex, String mem_inter,
			String mem_grade, int join_num, int meet_id, String meet_name, int personnel) {
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_age = mem_age;
		this.mem_sex = mem_sex;
		this.mem_inter = mem_inter;
		this.mem_grade = mem_grade;
		this.join_num = join_num;
		this.meet_id = meet_id;
		this.meet_name = meet_name;
		this.personnel = personnel;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public int getMem_age() {
		return mem_age;
	}

	public void setMem_age(int mem_age) {
		this.mem_age = mem_age;
	}

	public String getMem_sex() {
		return mem_sex;
	}

	public void setMem_sex(String mem_sex) {
		this.mem_sex = mem_sex;
	}

	public String getMem_inter() {
		return mem_inter;
	}

	public void setMem_inter(String mem_inter) {
		this.mem_inter = mem_inter;
	}

	public String getMem_grade() {
		return mem_grade;
	}

	public void setMem_grade(String mem_grade) {
		this.mem_grade = mem_grade;
	}

	public int getJoin_num() {
		return join_num;
	}

	public void setJoin_num(int join_num) {
		this.join_num = join_num;
	}

	public int getMeet_id() {
		return meet_id;
	}

	public void setMeet_id(int meet_id) {
		this.meet_id = meet_id;
	}

	public String getMeet_name() {
		return meet_name;
	}

	public void setMeet_name(String meet_name) {
		this.meet_name = meet_name;
	}

	public int getPersonnel() {
		return personnel;
	}

	public void setPersonnel(int personnel) {
		this.personnel = personnel;
	}

	public int getReview_no() {
		return review_no;
	}

	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}

	public int getReview_star() {
		return review_star;
	}

	public void setReview_star(int review_star) {
		this.review_star = review_star;
	}

	public String getReview_title() {
		return review_title;
	}

	public void setReview_title(String review_title) {
		this.review_title = review_title;
	}

	public String getReview_cont() {
		return review_cont;
	}

	public void setReview_cont(String review_cont) {
		this.review_cont = review_cont;
	}

	public int getBook_no() {
		return book_no;
	}

	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_price() {
		return book_price;
	}

	public void setBook_price(String book_price) {
		this.book_price = book_price;
	}

	public String getBook_cont() {
		return book_cont;
	}

	public void setBook_cont(String book_cont) {
		this.book_cont = book_cont;
	}

	public String getBook_date() {
		return book_date;
	}

	public void setBook_date(String book_date) {
		this.book_date = book_date;
	}

	public int getBuy() {
		return buy;
	}

	public void setBuy(int buy) {
		this.buy = buy;
	}

	public String getBuy_id() {
		return buy_id;
	}

	public void setBuy_id(String buy_id) {
		this.buy_id = buy_id;
	}
	
	
	

}
