package lesson.jdbc.day4;

public class StudentVO {
	private int stdNO;
	private String email;
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int hist;
	private int total;
	private String mgrCode;
	private String accCode;
	private String locCode;
	
	public StudentVO() {
		
	}
	
	public StudentVO(int stdNO,String email,int kor,int eng,int math,int sci,int hist,int total,String mgrCode,String accCode,String locCode) {
		
		this.stdNO = stdNO;
		this.email = email;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sci = sci;
		this.hist = hist;
		this.total = total;
		this.mgrCode = mgrCode;
		this.accCode = accCode;
		this.locCode = locCode;
	}
	
	public StudentVO(String data) {
		
		String[] temp = data.split(",");
		
		this.stdNO = Integer.parseInt(temp[0].trim());
		this.email = temp[1].trim();
		this.kor = Integer.parseInt(temp[2].trim());
		this.eng = Integer.parseInt(temp[3].trim());
		this.math = Integer.parseInt(temp[4].trim());
		this.sci = Integer.parseInt(temp[5].trim());
		this.hist = Integer.parseInt(temp[6].trim());
		this.total = Integer.parseInt(temp[7].trim());
		this.mgrCode = temp[8].trim();
		this.accCode = temp[9].trim();
		this.locCode = temp[10].trim();
	}
	
	public int getStdNo() {
		return this.stdNO;
	}
	
	public void setStdNo(int StdNo) {
		this.stdNO = StdNo;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getHist() {
		return hist;
	}

	public void setHist(int hist) {
		this.hist = hist;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getMgrCode() {
		return mgrCode;
	}

	public void setMgrCode(String mgrCode) {
		this.mgrCode = mgrCode;
	}

	public String getAccCode() {
		return accCode;
	}

	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}

	public String getLocCode() {
		return locCode;
	}

	public void setLocCode(String locCode) {
		this.locCode = locCode;
	}
	
	public int getKorEng() {
		return this.kor + this.eng;
	}
	
	public int getEngMath() {
		return this.eng + this.math;
	}
	
	@Override
	public String toString() {
		return "[" + this.stdNO +" : " + this.getKorEng() + "]";
	}
}
