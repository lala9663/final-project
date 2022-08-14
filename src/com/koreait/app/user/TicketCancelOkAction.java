package com.koreait.app.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionTo;
import com.koreait.app.ticketing.dao.TicketingDAO;

public class TicketCancelOkAction implements Action{
	@Override
	public ActionTo execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		TicketingDAO tdao = new TicketingDAO();
		int ticketingid = Integer.parseInt(req.getParameter("ticketingid"));
		String seatid = req.getParameter("seatid");
		String[] SeatidList = seatid.split(",");
		for(int i=0;i<SeatidList.length;i++) {
			tdao.cancelSeatOccupied(Integer.parseInt(SeatidList[i]));
		}
		ActionTo acto = new ActionTo();
		acto.setRedirect(true);
		if(tdao.cancelTicketing(ticketingid)) {
			acto.setPath(req.getContextPath()+"/user/UserTicketingList.us?c=t");
		}
		else {
			acto.setPath(req.getContextPath()+"/user/UserTicketingList.us?c=f");
		}
		return acto;
	}
}
