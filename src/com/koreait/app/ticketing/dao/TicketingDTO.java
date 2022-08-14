package com.koreait.app.ticketing.dao;

public class TicketingDTO {
	private int ticketingid;
    private String ticketingdate;
    private String movietitle;
	private String userid;
	private String seatid;
    private int cinemaid;
    private int timeid;
	public int getTicketingid() {
		return ticketingid;
	}
	public void setTicketingid(int ticketingid) {
		this.ticketingid = ticketingid;
	}
	public String getTicketingdate() {
		return ticketingdate;
	}
	public void setTicketingdate(String ticketingdate) {
		this.ticketingdate = ticketingdate;
	}
	public String getMovietitle() {
		return movietitle;
	}
	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getSeatid() {
		return seatid;
	}
	public void setSeatid(String seatid) {
		this.seatid = seatid;
	}
	public int getCinemaid() {
		return cinemaid;
	}
	public void setCinemaid(int cinemaid) {
		this.cinemaid = cinemaid;
	}
	public int getTimeid() {
		return timeid;
	}
	public void setTimeid(int timeid) {
		this.timeid = timeid;
	}
    
}
