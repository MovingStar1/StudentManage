<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<FRAMESET id=index border=0 frameSpacing=0 rows=120,* frameBorder=no>
	<FRAME id=topFrame name=topFrame src="<%=path%>/admin/top.jsp" noResize
		scrolling=no>
	<FRAMESET border=0 frameSpacing=0 frameBorder=no cols=20%,*>
		<FRAME id=leftFrame name=leftFrame src="<%=path%>/admin/left.jsp"
			noResize scrolling=no>
		<FRAME id=mainFrame name=mainFrame src="<%=path%>/admin/right.jsp"
			noResize scrolling=no>
	</FRAMESET>
</FRAMESET>
<noframes></noframes>
</html>
