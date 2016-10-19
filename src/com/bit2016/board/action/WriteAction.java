package com.bit2016.board.action;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.bit2016.web.*;
import com.bit2016.web.util.*;

public class WriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		WebUtil.redirect(request, response, "/mysite3/board");
	}

}
