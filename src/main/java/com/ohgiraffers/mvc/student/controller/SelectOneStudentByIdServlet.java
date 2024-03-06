package com.ohgiraffers.mvc.student.controller;

import com.ohgiraffers.mvc.student.model.dto.StudentDTO;
import com.ohgiraffers.mvc.student.model.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/select")
public class SelectOneStudentByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentCode = req.getParameter("studentCode");
        System.out.println("studentCode : " + studentCode);

        StudentService studentService = new StudentService();
        /* 기능 요청
        * 데이터베이스에서 가지고 온 값을 파라미터로 넘겨준다..? 조회 해준다.*/
        StudentDTO selectedStudent =  studentService.selectOneStudentById(studentCode);
        System.out.println("selectedStudent : " + selectedStudent);

        String path = " ";
        if (selectedStudent != null) {
            path = "/WEB-INF/views/student/showStudentInfo.jsp";
            req.setAttribute("selectedStudent", selectedStudent);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "해당 번호를 가진 학생은 없습니다.");
        }
        req.getRequestDispatcher(path).forward(req,resp);
    }
}
