<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- JSPL사용할때 작성 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>학생 목록 전체 조회</title>
</head>
<body>
    <h1>학생 목록 전체 조회</h1>
    <table>
        <tr>
            <th>학생번호</th>
            <th>학생명</th>
            <th>학생전화번호</th>
            <th>학생의 학년</th>
            <th>비밀번호</th>
            <th>학생의 학적</th>
            <th>학생의 전공 코드</th>
            <th>학생의 교수 코드</th>
        </tr>
        <!-- studentList의 name속성을 이용해서 저장 해주었기 때문에
        반복문 안에서 사용할 변수명 std -->
        <c:forEach items="${ studentList }" var="std">
            <tr>
                <td>${ std.studentCode }</td>
                <td>${ std.studentName }</td>
                <td>${ std.studentPhone }</td>
                <td>${ std.studentGrade }</td>
                <td>${ std.password }</td>
                <td>${ std.studentStatus }</td>
                <td>${ std.majorSubject }</td>
                <td>${ std.tutorProfessor }</td>
            </tr>
        </c:forEach>
    </table>
</body>
<style>
    table {
        width: 100%;
    }
    th,td {
        border: 1px solid #222;
        padding: 5px;
        background-color: #fffae9;
        font-size: 18px;
    }
</style>
</html>
