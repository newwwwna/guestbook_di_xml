package com.javalec.guestbook.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

import ch.qos.logback.classic.boolex.GEventEvaluator;

@Component("guestbook")
public class GuestBookController {

	private GuestBookDAO guestbookDao ;

	public void setGuestbookDao(GuestBookDAO guestbookDao) {
		this.guestbookDao = guestbookDao;
	}

	public List<GuestBookVO> getList(){
		List<GuestBookVO> list = guestbookDao.getList();
		return list ;
	}
	
	public void delete(GuestBookVO vo) {
		guestbookDao.delete(vo);
	}
	
	public void add(GuestBookVO vo) {
		guestbookDao.insert(vo);
	}
}
