package com.ohgiraffers.mvc.student.model.dto;

/* DTO(Data Transfer Object)
 * : 여러 계층간 데이터 전송을 위해 다양한 타입의 데이터를 하나로 묶어 전송하는 쓰임의 클래스 */
public class StudentDTO {
    private String studentCode;
    private String studentName;
    private String studentPhone;
    private int studentGrade;
    private String password;
    private String studentStatus;
    private int majorSubject;
    private int tutorProfessor;

    public StudentDTO() {
    }

    public StudentDTO(String studentCode, String studentName, String studentPhone, int studentGrade, String password, String studentStatus, int majorSubject, int tutorProfessor) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentGrade = studentGrade;
        this.password = password;
        this.studentStatus = studentStatus;
        this.majorSubject = majorSubject;
        this.tutorProfessor = tutorProfessor;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public int getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(int majorSubject) {
        this.majorSubject = majorSubject;
    }

    public int getTutorProfessor() {
        return tutorProfessor;
    }

    public void setTutorProfessor(int tutorProfessor) {
        this.tutorProfessor = tutorProfessor;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentCode='" + studentCode + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentGrade=" + studentGrade +
                ", password='" + password + '\'' +
                ", studentStatus='" + studentStatus + '\'' +
                ", majorSubject=" + majorSubject +
                ", tutorProfessor=" + tutorProfessor +
                '}';
    }
}