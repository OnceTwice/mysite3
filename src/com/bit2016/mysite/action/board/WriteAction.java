package com.bit2016.mysite.action.board;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.bit2016.mysite.dao.*;
import com.bit2016.mysite.vo.*;
import com.bit2016.web.*;
import com.bit2016.web.util.*;

public class WriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		BoardVo vo = new BoardVo();
		
		
		BoardDao dao = new BoardDao();
		dao.insert(vo);
		
		WebUtil.redirect(request, response, "/mysite3/board");
	}

}
