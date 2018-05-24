<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.brainmentors.apps.utils.MessageConstants"%>
<%@page import="com.brainmentors.apps.dto.MessageDTO"%>
<%@page import="com.brainmentors.apps.dao.UserDAO"%>
<%@page import="com.brainmentors.apps.dto.UserDTO"%>
<%@ page autoFlush="true" session="false" buffer="8kb" info="this is a login page"  errorPage="error.jsp" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<%
String userid = request.getParameter("userid");
String pwd = request.getParameter("pwd");
if(userid!=null && pwd!=null){
	UserDTO userDTO = new UserDTO(userid, pwd);
	UserDAO userDAO = new UserDAO();
	MessageDTO messageDTO = userDAO.doLogin(userDTO);
	if(messageDTO!=null && messageDTO.getStatus()==MessageConstants.SUCCESS){
		 HttpSession session = request.getSession(true);
		 session.setAttribute("uid", userid);
		 HashMap<String, ArrayList<UserDTO>> map = new HashMap<>();
		 session.setAttribute("role", map);
		 request.setAttribute("xyz", "abcd");
		 application.setAttribute("name", "admin");
		//RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
		//rd.forward(request, response);
		//response.sendRedirect("dashboard.jsp?uid="+userid);	
		String urlWithSessionId = response.encodeRedirectURL("dashboardallow.jsp");  // URL + SessionID
	//response.sendRedirect("dashboard.jsp");
	response.sendRedirect(urlWithSessionId);
	}
	else{
		
	
%>
<h3><%=messageDTO.getMessage() %></h3>
<%
	}
}
%>
<div class="container">
<h2>Login Form</h2>
<form action="" method="post">
<div class="form-group">
<label for="">Userid</label>
<input name="userid" type="text" class="form-control" placeholder="Type Userid Here" />
</div>
<div class="form-group">
<label for="">Password</label>
<input  name="pwd" type="password" placeholder="Type Password Here" class="form-control" />
</div>
<div class="form-group">
<button type="submit" class="btn btn-primary">Login</button>
</div>
</form>
</div>
