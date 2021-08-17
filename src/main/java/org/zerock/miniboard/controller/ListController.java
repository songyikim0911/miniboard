package org.zerock.miniboard.controller;

import org.zerock.miniboard.dto.BoardDTO;
import org.zerock.miniboard.service.BoardService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ListController", value = "/board/list")
public class ListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //게시물 등록화면

        ArrayList<BoardDTO> boardDTOS = BoardService.INSTANCE.getList();

        request.setAttribute("boardList", boardDTOS);

        request.getRequestDispatcher("/WEB-INF/board/list.jsp")
                        .forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
