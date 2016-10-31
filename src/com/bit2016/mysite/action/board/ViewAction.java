package com.bit2016.mysite.action.board;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.bit2016.mysite.dao.*;
import com.bit2016.mysite.vo.*;
import com.bit2016.web.*;
import com.bit2016.web.util.*;

public class ViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		BoardDao dao = new BoardDao();
//		List<BoardVo> list = dao.getList();
		
		// request 범위에 모델 데이터 저장
//		request.setAttribute("list", list);
		
		WebUtil.forward(request, response, "/WEB-INF/views/board/view.jsp");
	}

}
