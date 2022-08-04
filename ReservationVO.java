package Day1;

public class ReservationVO {
	private int seq;
    private String rsvs_date;
    private int std_no;
    private int book_no;
    
    public ReservationVO() {}
    
    public ReservationVO(int seq,String rsvs_date,int std_no,int book_no) {
    	
    	this.seq = seq;
    	this.rsvs_date = rsvs_date;
    	this.std_no = std_no;
    	this.book_no = book_no;
    }

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getRsvs_date() {
		return rsvs_date;
	}

	public void setRsvs_date(String rsvs_date) {
		this.rsvs_date = rsvs_date;
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
    
    
}
