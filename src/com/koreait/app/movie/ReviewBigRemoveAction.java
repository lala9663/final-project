package com.koreait.app.movie;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.koreait.action.Action;
import com.koreait.action.ActionTo;
import com.koreait.app.movie.dao.MovieDAO;

public class ReviewBigRemoveAction implements Action{
	@Override
	public ActionTo execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		MovieDAO mdao = new MovieDAO();
		int reviewid = Integer.parseInt(req.getParameter("reviewid"));
		ActionTo acto = new ActionTo();
		acto.setRedirect(true);
		if(mdao.removeReview(reviewid)) {
			acto.setPath(req.getContextPath()+"/movie/ReviewList.mo");
		}
		else {
			acto.setPath(req.getContextPath()+"/movie/ReviewView.mo?reviewid="+reviewid);
		}
		return acto;
	}
}
