package com.ohgiraffers.mvc.student.model.dao;

import com.ohgiraffers.mvc.student.model.dto.StudentDTO;

import java.util.List;

public interface StudentMapper {
    StudentDTO selectOneStudentById(String studentCode);

    List<StudentDTO> selectAllStudent();

    int insertStudent(StudentDTO std);

    int updateStudent(StudentDTO std);

    int deleteStudent(String studentCode);

}
