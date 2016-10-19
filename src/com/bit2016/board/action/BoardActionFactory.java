package com.bit2016.board.action;

import com.bit2016.guestbook.action.*;
import com.bit2016.web.*;

public class BoardActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if("write".equals(actionName)) {
			action = new WriteAction();
		} else {
			action = new ListAction();
		}
		
		return action;
	}

}
