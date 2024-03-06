package com.ohgiraffers.mvc.student.controller;


import com.ohgiraffers.mvc.student.model.dto.StudentDTO;
import com.ohgiraffers.mvc.student.model.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/student/update")
public class UpdateStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String studentCode = req.getParameter("studentCode");
        String studentName = req.getParameter("studentName");

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentCode(studentCode);
        studentDTO.setStudentName(studentName);

        StudentService studentService = new StudentService();
        int result = studentService.updateStudent(studentDTO);

        if (result > 0) {
            /* get방식이기 때문에 쿼리스트링으로 작성.
            * 한 명의 사원을 조회할 파라미터?가 필요하기 때문에 넣어 주었다. (?empId=)*/
            resp.sendRedirect(req.getContextPath() + "/student/select?studentCode=" + studentCode);
        }else {
            req.setAttribute("message", "학생 정보 수정에 실패하였습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req,resp);
        }
    }
}
