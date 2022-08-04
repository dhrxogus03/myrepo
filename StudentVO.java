package Day1;

public class StudentVO {
	
	private int std_no;
	private String std_name;
	private int age;
	private int rsrv_cnt;
	private int loan_cnt;
	private String stop_date;
	
	public StudentVO() {}
	
	public StudentVO(int std_no,String std_name,int age,int rsrv_cnt,int load_cnt,String stop_date) {
		
		this.std_no = std_no;
		this.std_name = std_name;
		this.age = age;
		this.rsrv_cnt = rsrv_cnt;
		this.loan_cnt = load_cnt;
		this.stop_date = stop_date;
	}
	
	public StudentVO(String data) {
		
		String[] temp = data.split(",");
		this.std_no = Integer.parseInt(temp[0].trim());
		this.std_name = temp[1].trim();
		this.age = Integer.parseInt(temp[2].trim());
		this.rsrv_cnt = Integer.parseInt(temp[3].trim());
		this.loan_cnt = Integer.parseInt(temp[4].trim());
		this.stop_date = temp[5].trim();
	}

	public int getStd_no() {
		return std_no;
	}

	public void setStd_no(int std_no) {
		this.std_no = std_no;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRsrv_cnt() {
		return rsrv_cnt;
	}

	public void setRsrv_cnt(int rsrv_cnt) {
		this.rsrv_cnt = rsrv_cnt;
	}

	public int getLoan_cnt() {
		return loan_cnt;
	}

	public void setLoan_cnt(int load_cnt) {
		this.loan_cnt = load_cnt;
	}

	public String getStop_date() {
		return stop_date;
	}

	public void setStop_date(String stop_date) {
		this.stop_date = stop_date;
	}
	
}
