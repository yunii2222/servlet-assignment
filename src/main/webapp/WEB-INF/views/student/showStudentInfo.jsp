<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>학생정보</title>
</head>
<body>
    <h1>${ param.studentCode }번 학생의 정보</h1>
    <h4>학생명 : ${ selectedStudent.studentName }</h4>
    <h4>학생 전화번호 : ${ selectedStudent.studentPhone }</h4>
    <h4>학년 : ${ selectedStudent.studentGrade }</h4>
    <h4>학적 상태 ( E-재학중, T-휴학, G-졸업, O-퇴학 ) : ${ selectedStudent.studentStatus }</h4>
</body>
</html>
