package org.zerock.boardcopendium02workbook.todo;

import org.zerock.boardcopendium02workbook.todo.dto.TodoDTO;
import org.zerock.boardcopendium02workbook.todo.service.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="todoreadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("/todo/read");

        // /todo/read?tno=123
        Long tno = Long.parseLong(req.getParameter("tno"));

        TodoDTO dto = ToDoService.INSTANCE.get(tno);

        req.setAttribute("dto", dto);

        req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req, resp);
    }
}
