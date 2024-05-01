package org.zerock.boardcopendium02workbook.todo;

import org.zerock.boardcopendium02workbook.todo.dto.TodoDTO;
import org.zerock.boardcopendium02workbook.todo.service.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        System.out.println("/todo/list");

        List<TodoDTO> dtoList = ToDoService.INSTANCE.getList();
        req.setAttribute("list", dtoList);


        req.getRequestDispatcher("/WEB-INF/todo/list.jsp")
                .forward(req, resp);
    }
}
