package com.ohgiraffers.mvc.student.controller;

import com.ohgiraffers.mvc.student.model.dto.StudentDTO;
import com.ohgiraffers.mvc.student.model.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/insert")
public class insertStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        /* 꺼낸 값을 employee DTO로  */
        String studentName = req.getParameter("studentName");
        String studentPhone = req.getParameter("studentPhone");
        int studentGrade = Integer.parseInt(req.getParameter("studentGrade"));
        String password = req.getParameter("password");
        String studentStatus = req.getParameter("studentStatus");
        int majorSubject = Integer.parseInt(req.getParameter("majorSubject"));
        int tutorProfessor = Integer.parseInt(req.getParameter("tutorProfessor"));


        StudentDTO std = new StudentDTO();
        std.setStudentName(studentName);
        std.setStudentPhone(studentPhone);
        std.setStudentGrade(studentGrade);
        std.setPassword(password);
        std.setStudentStatus(studentStatus);
        std.setMajorSubject(majorSubject);
        std.setTutorProfessor(tutorProfessor);

        /* 데이터가 잘 들어가져있는지 확인 */
        System.out.println("insert request std : " + std);

        StudentService studentService = new StudentService();
        int result = studentService.insertStudent(std);

        if (result > 0) {
            /* insert가 성공 했을 경우 요청 url이 그대로 남아있으면 브라우저 새로고침 시 insert 재요청이 발생한다
            * forward가 아닌 redirect 처리가 필요하며 전체 사원 목록을 조회하는 기능을 요청하도록 한다. */
            resp.sendRedirect(req.getContextPath() + "/student/list");
        }else {
            req.setAttribute("message", "학생 전체 목록이 조회 되지 않았습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req,resp);
        }

    }
}
