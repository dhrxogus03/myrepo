package Day1;

public class LoanVO {
	
	private int seq;
    private String load_date;
    private String exp_return_date;
    private int std_no;
    private int book_no;
    private String return_date;
    private String return_yn;
    
    public LoanVO() {}
    
    public LoanVO(int seq,String load_date,String exp_return_date,int std_no,int book_no,String return_date,String return_yn) {
    	
    	this.seq = seq;
    	this.load_date = load_date;
    	this.exp_return_date = exp_return_date;
    	this.std_no = std_no;
    	this.book_no = book_no;
    	this.return_date = return_date;
        this.return_yn = return_yn;
    }
    
    public LoanVO(String data) {
    	
    	String[] temp = data.split(",");
    	
    	this.seq = Integer.parseInt(temp[0].trim());
    	this.load_date = temp[1].trim();
    	this.exp_return_date = temp[2].trim();
    	this.std_no = Integer.parseInt(temp[3].trim());
    	this.book_no = Integer.parseInt(temp[4].trim());
    	this.return_date = temp[5].trim();
        this.return_yn = temp[6].trim();
    }

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getLoad_date() {
		return load_date;
	}

	public void setLoad_date(String load_date) {
		this.load_date = load_date;
	}

	public String getExp_return_date() {
		return exp_return_date;
	}

	public void setExp_return_date(String exp_return_date) {
		this.exp_return_date = exp_return_date;
	}

	public int getStd_no() {
		return std_no;
	}

	public void setStd_no(int std_no) {
		this.std_no = std_no;
	}

	public int getBook_no() {
		return book_no;
	}

	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public String getReturn_yn() {
		return return_yn;
	}

	public void setReturn_yn(String return_yn) {
		this.return_yn = return_yn;
	}
    
    
}
