package com.bit2016.board.dao.test;

import com.bit2016.mysite.dao.*;
import com.bit2016.mysite.vo.*;

public class BoardDaoTest {
	public static void main(String[] args) {
		insertTest();
		
	}
	
	public static void insertTest() {
		BoardVo vo = new BoardVo();
		
		
		
		BoardDao dao = new BoardDao();
		dao.insert(vo);
	}
	
	public static void updateTest() {
		BoardVo vo = new BoardVo();

		
		
		BoardDao dao = new BoardDao();
		dao.update(vo);
	}
	
	public static void getListTest() {
		BoardVo vo = new BoardVo();
		
	}
}
