package com.bit2016.mysite.action.board;

import com.bit2016.web.*;

public class BoardActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		return new ListAction();
	}

}
