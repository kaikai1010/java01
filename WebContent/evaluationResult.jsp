<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model.Evaluation" %>

<%
Evaluation e = (Evaluation) application.getAttribute("e");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>評価ページ</title>
</head>
<body>

<h1>○○さんについて</h1>

<p>
<a href="/evaluation/EvaluationServlet?action=like">好き</a>: <%= e.getLike() %>件<br>
<a href="/evaluation/EvaluationServlet?action=dislike">嫌い</a>: <%= e.getDislike() %>件
</p>


</body>
</html>