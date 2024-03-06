package com.ohgiraffers.mvc.student.controller;

import com.ohgiraffers.mvc.student.model.dto.StudentDTO;
import com.ohgiraffers.mvc.student.model.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/student/list")
public class SelectAllStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService studentService = new StudentService();

        List<StudentDTO> studentList = studentService.selectAllStudent();

        String path = " ";
        if (studentList != null && !studentList.isEmpty()) {
            path = "/WEB-INF/views/student/studentList.jsp";
            req.setAttribute("studentList", studentList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "학생 전체 목록이 조회 되지 않았습니다.");
        }
        req.getRequestDispatcher(path).forward(req,resp);
    }
}
