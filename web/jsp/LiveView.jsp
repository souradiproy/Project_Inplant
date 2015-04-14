<%-- 
    Document   : viewLive
    Created on : Mar 19, 2015, 6:32:31 PM
    Author     : rahul
--%>

<%@page import="java.util.Map"%>
<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Live View</title>
        <link rel="stylesheet" href="css/table.css">
        <script src="js/endTrip.js"></script>
    </head>
    <body>
        
        <h3>
           <!--name: <s:property value="loginName"/>
           password: <s:property value="password"/>
           -->
           
            <%   
               ValueStack stack = ActionContext.getContext().getValueStack();
               //out.println("Size of the valueStack: " + stack.size()); //this is where we access the object
               //hibernate.pojo.TblUsers user = (hibernate.pojo.TblUsers)stack.findValue("user");
               
               Map sesion = (Map)ActionContext.getContext().getSession();
               hibernate.pojo.TblUsers user = (hibernate.pojo.TblUsers)sesion.get("user");
               
               liveView.LiveView l = new liveView.LiveView();
               out.println(l.getLiveView(user));
           %>
        </h3>
    </body>
</html>
