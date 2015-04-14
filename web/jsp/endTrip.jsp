<%@page import="liveView.endTrip"%>
<%@page import="java.math.BigDecimal"%>

<%
    liveView.endTrip e = new endTrip();
    //out.println(request.getParameter("tripId"));
    if(e.end(new BigDecimal(request.getParameter("tripId").toString()))==true)
        out.print("success");
    else
        out.print("failure");
%>