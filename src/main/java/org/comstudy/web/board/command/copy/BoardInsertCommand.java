package org.comstudy.web.board.command.copy;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy.web.board.command.Command;

public class BoardInsertCommand implements Command {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		return null;
		
		// Command에서 Redirect 까지 처리할 수 있도록
	}

}
