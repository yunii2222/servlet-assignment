<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
    <div class="border">
        <h1>강의신청 학생 정보 조회 👩🏻‍💻</h1>
        <form action="${pageContext.servletContext.contextPath}/student/select">
            <div class="tb">
                <label for="studentCode">조회할 학생 코드 : </label>
                <input type="text" id="studentCode" name="studentCode"><br>
            </div>
            <button>조회하기</button>
        </form>
    </div>
    <div class="border">
        <h1>학생 전체 정보 조회 👩🏻‍💻</h1>
        <button onclick="location.href='${pageContext.servletContext.contextPath}/student/list'">
            학생 정보 전체 조회하기
        </button>
    </div>
    <div class="border">
        <h1>강의신청 학생 정보 추가 👩🏻‍💻</h1>
        <form action="${ pageContext.servletContext.contextPath }/student/insert" method="post">
            <div class="tb">
                <label for="studentName2">학생명 : </label>
                <input type="text" id="studentName2" name="studentName"><br>
            </div>
            <div class="tb">
                <label for="studentPhone">학생 전화번호 : </label>
                <input type="tel" id="studentPhone" name="studentPhone"><br>
            </div>
            <div class="tb">
                <label for="studentGrade">학생의 학년 : </label>
                <input type="text" id="studentGrade" name="studentGrade"><br>
            </div>
            <div class="tb">
                <label for="password">학생의 비밀번호 : </label>
                <input type="password" id="password" name="password"><br>
            </div>
            <div class="tb">
                <label for="studentStatus">학생의 학적 : </label>
                <select id="studentStatus" name="studentStatus">
                    <option value="E">E (재학중)</option>
                    <option value="T">T (휴학)</option>
                    <option value="G">G (졸업)</option>
                    <option value="O">O (퇴학)</option>
                </select>
            </div>
            <div class="tb">
                <label for="majorSubject">전공 코드 : </label>
                <input type="text" id="majorSubject" name="majorSubject"><br>
            </div>
            <div class="tb">
                <label for="tutorProfessor">교수 코드 : </label>
                <input type="text" id="tutorProfessor" name="tutorProfessor"><br>
            </div>
            <button type="submit">등록하기</button>
        </form>
    </div>
    <div class="border">
        <h1>학생명 수정 👩🏻‍💻</h1>
        <form action="${ pageContext.servletContext.contextPath }/student/update" method="post">
            <div class="tb">
                <label for="studentCode1">학생 코드 : </label>
                <input type="text" id="studentCode1" name="studentCode"><br>
            </div>
            <div class="tb">
                <label for="studentName3">변경할 학생명 : </label>
                <input type="text" id="studentName3" name="studentName"><br>
            </div>
            <button type="submit">학생명 변경</button>
        </form>
    </div>
    <div class="border">
        <h1>학생 정보 삭제 👩🏻‍💻</h1>
        <form action="${ pageContext.servletContext.contextPath }/student/delete" method="post">
            <div class="tb">
                <label for="studentCode2">학생 번호 : </label>
                <input type="text" id="studentCode2" name="studentCode"><br>
            </div>
            <button type="submit">학생 정보 삭제</button>
        </form>
    </div>
</body>
<style>
    body {
        background-color: #fdf8ee;
    }
    .border {
        width: 100%;
        max-width: 1220px;
        margin: 0 auto;
        padding: 0 20px 20px 20px;
        border-bottom: 1px solid #455959;
    }
    input, select {
        padding: 10px;
        border-radius: 10px;
        border: 1px solid #222;
        margin: 5px;
        width: 200px;
        cursor: pointer;
    }
    option {
        padding: 10px;
    }
    button {
        background-color: #455959;
        color: #fffae9;
        cursor: pointer;
        border: none;
        border-radius: 5px;
        padding: 10px;
        width: 326px;
        margin-top: 15px;
    }
    .tb {
        width: 100%;
        display: flex;
        align-items: center;
    }
    .tb label {
        width: 100%;
        min-width: 120px;
        max-width: 120px;
    }
</style>
</html>
