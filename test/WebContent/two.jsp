<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
welcome
<%
String name=request.getParameter("name");
String mail=request.getParameter("email");
String pass=request.getParameter("password");
 
out.println(name);
out.println(mail);
out.println(pass);
%>
<br>
<sql:setDataSource var="db" driver="org.postgresql.Driver" url="jdbc:postgresql://localhost:5432/postgres" user="postgres" password="tiger"/>

<sql:query var="rs" dataSource="${db}">select * from gadgets</sql:query>

<c:forEach items="${rs.rows}" var="gadget">
<br><c:out value="${gadget.gid}"></c:out> : <c:out value="${gadget.gname}"></c:out> : <c:out value="${gadget.price}"></c:out>
</c:forEach>

<c:set var="str" value="my name is Shafah"/>
<br><br>Length of  '${str}' is:${fn:length(str)}<br>

<c:forEach items="${fn:split(str,' ')}" var="s"><br>
${s}
</c:forEach>
<br><br>
index of "is" : ${fn:indexOf(str,"is")}
<br><br>
is the sentence contains "name" : ${fn:contains(str,"name")}
<br><br>
is the sentence contains "hello" : ${fn:contains(str,"hello")}
<br><br>
<c:if test="${fn:contains(str,'name')}">
'name' is in the sentence
</c:if>
</body>
</html>






