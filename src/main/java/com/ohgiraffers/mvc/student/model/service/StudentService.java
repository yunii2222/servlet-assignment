package com.ohgiraffers.mvc.student.model.service;


import com.ohgiraffers.mvc.student.model.dao.StudentMapper;
import com.ohgiraffers.mvc.student.model.dto.StudentDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.mvc.common.mybatis.Template.getSqlSession;


public class StudentService {

    private StudentMapper studentMapper;

    public StudentDTO selectOneStudentById(String studentCode) {
        SqlSession sqlSession = getSqlSession();
        System.out.println("sqlSession : " + sqlSession);

        studentMapper = sqlSession.getMapper(StudentMapper.class);

        StudentDTO selectedStudent = studentMapper.selectOneStudentById(studentCode);
        System.out.println("dd"+selectedStudent);

        sqlSession.close();

        return selectedStudent;
    }

    public List<StudentDTO> selectAllStudent() {
        SqlSession sqlSession = getSqlSession();

        /* mapper로 꺼내 왔다. */
        studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<StudentDTO> studentList = studentMapper.selectAllStudent();

        sqlSession.close();

        /* 조회 된 결과 반환 */
        return studentList;
    }

    public int insertStudent(StudentDTO std) {
        SqlSession sqlSession = getSqlSession();

        /* mapper로 꺼내 왔다. */
        studentMapper = sqlSession.getMapper(StudentMapper.class);

        int result = studentMapper.insertStudent(std);

        /* 우리는 조회하지 않았기 때문에 foward하지 않는다. */
        if (result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int updateStudent(StudentDTO std) {
        SqlSession sqlSession = getSqlSession();

        /* mapper로 꺼내 왔다. */
        studentMapper = sqlSession.getMapper(StudentMapper.class);

        int result = studentMapper.updateStudent(std);

        /* 우리는 조회하지 않았기 때문에 foward하지 않는다. */
        if (result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int deleteStudent(String studentCode) {
        SqlSession sqlSession = getSqlSession();

        /* mapper로 꺼내 왔다. */
        studentMapper = sqlSession.getMapper(StudentMapper.class);

        int result = studentMapper.deleteStudent(studentCode);

        /* 우리는 조회하지 않았기 때문에 foward하지 않는다. */
        if (result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }
}
