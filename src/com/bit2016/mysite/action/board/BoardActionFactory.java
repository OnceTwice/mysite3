package com.bit2016.mysite.action.board;

import com.bit2016.web.*;

public class BoardActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if("writeform".equals(actionName)) {
			action = new WriteFormAction();
		} else if("write".equals(actionName)) {
			action = new WriteAction();
		} else if("delete".equals(actionName)) {
			
		} else {
			action = new ListAction();
		}
		
		return action;
	}

}
