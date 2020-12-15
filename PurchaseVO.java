package com.purchaseList.model;

public class PurchaseVO {
	private int purno;
	private int bookno;
	private int price;
	private int purdate;
	private String userid;
	private String purflag;
	
	public PurchaseVO() {
		super();
	}

	public PurchaseVO(int purno, int bookno, int price, int purdate, String userid, String purflag) {
		super();
		this.purno = purno;
		this.bookno = bookno;
		this.price = price;
		this.purdate = purdate;
		this.userid = userid;
		this.purflag = purflag;
	}

	public int getPurno() {
		return purno;
	}

	public void setPurno(int purno) {
		this.purno = purno;
	}

	public int getBookno() {
		return bookno;
	}

	public void setBookno(int bookno) {
		this.bookno = bookno;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPurdate() {
		return purdate;
	}

	public void setPurdate(int purdate) {
		this.purdate = purdate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPurflag() {
		return purflag;
	}

	public void setPurflag(String purflag) {
		this.purflag = purflag;
	}

	@Override
	public String toString() {
		return "purchaseVO [purno=" + purno + ", bookno=" + bookno + ", price=" + price + ", purdate=" + purdate
				+ ", userid=" + userid + ", purflag=" + purflag + "]";
	}
	
	
}
