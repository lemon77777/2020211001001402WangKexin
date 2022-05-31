<%@ page import="com.WangKexin.model.Users" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Update User Info</h2>
<% if(!(session.getAttribute("user")==null)){
    
   com.WangKexin.model.Users u = (com.WangKexin.model.Users)request.getAttribute("user");
%>
<%if(!(request.getAttribute("updateFail")==null)){
    out.println("<h3>"+request.getAttribute("updateFail")+"</h3>");
}%>
<form method="post" action="<%=request.getContextPath()+"/updateUser"%>">
   <label>Username : </label> <input type="text" name="username" placeholder="Username" value="<%=u.getUsername()%>"/>
    <label>Password : </label><input type="text" name="password" placeholder="password" value="<%=u.getPassword()%>"/>
    <label>Email : </label><input type="text" name="email" placeholder="Email" value="<%=u.getEmail()%>"/><br/>
 	<label> Gender </label>
 	 &nbsp;<input type="radio"  style="width: 15px; height: 15px; display:inline;" name="gender" value="male" <%="Male".equals(u.getGender())? "checked":""%> />&nbsp;Male&nbsp;
 	<input type="radio" style="width: 15px; height: 15px;   display: inline;" name="gender" value="female" <%="Female".equals(u.getGender())? "checked":""%>/>&nbsp;Female
 	<br/><br/>
   <label>Date of Birth : </label><input type="text" name="birth" placeholder="Date of Birth (yyyy-mm-dd)" value="<%=u.getBirth()%>" />
   <input type="hidden" name="id" value="<%=u.getId()%>">
    <button type="submit" class="btn btn-default">Save Changes</button>
    <%}%>
</form>
</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->
<%@include file="footer.jsp"%>
