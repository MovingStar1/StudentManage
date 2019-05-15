<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<STYLE type=text/css> 
	*{
		FONT-SIZE: 12px; COLOR: white
	}
	#logo {
		COLOR: white
	}
	#logo A {
		COLOR: white
	}
	FORM {
		MARGIN: 0px
	}
	</STYLE>
	<SCRIPT src="<%=path %>/js/Clock.js" type=text/javascript></SCRIPT>
    <script type="text/javascript">
       function out()
       {
           //javascript:window.opener=null;
           //window.parent.close();
           window.parent.location.href="<%=path %>/login.jsp";
       }
    </script>
  </head>
  
  <BODY style="BACKGROUND-IMAGE: url(<%=path %>/img/bg.gif); MARGIN: 0px; BACKGROUND-REPEAT: repeat-x">
        <DIV id=logo style="BACKGROUND-IMAGE: url(<%=path %>/img/logo.png); BACKGROUND-REPEAT: no-repeat">
		    <DIV style="PADDING-RIGHT: 50px; BACKGROUND-POSITION: right 50%; DISPLAY: block; PADDING-LEFT: 0px; BACKGROUND-IMAGE: url(); PADDING-BOTTOM: 0px; PADDING-TOP: 3px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 30px; TEXT-ALIGN: right">
		    <A href=""></A> 
		    <A id=HyperLink2 href=""></A>
		    <A id=HyperLink3 href="#" onclick="out()">退出系统</A> 
        </DIV>
        <DIV style="DISPLAY: block; HEIGHT: 54px"></DIV>
        <DIV style="BACKGROUND-IMAGE: url(<%=path %>/img/bg_nav.gif); BACKGROUND-REPEAT: repeat-x; HEIGHT: 30px">
	       <TABLE cellSpacing=0 cellPadding=0 width="100%">
	          <TR>
	            <TD>
	              <DIV>
	                   <IMG src="<%=path %>/img/nav_pre.gif" align=absMiddle>
	                        <c:if test="${sessionScope.userType==0}">
	                                欢迎您：系统管理员
	                        </c:if>
	                        <c:if test="${sessionScope.userType==1}">
	                                欢迎您：${sessionScope.laoshi.xingming}(老师)
	                        </c:if>
	                        <c:if test="${sessionScope.userType==2}">
	                                欢迎您：${sessionScope.xuesheng.xingming}(学生)
	                        </c:if>
	              </DIV>
	            </TD>
	            <TD align=right width="70%">
		             <SPAN style="PADDING-RIGHT: 50px">
			             <A href="javascript:history.go(-1);"><!--  <IMG src="<%=path %>/img/nav_back.gif" align=absMiddle border=0>--></A> 
			             <A href="javascript:history.go(1);"><!-- <IMG src="<%=path %>/img/nav_forward.gif" align=absMiddle border=0>--></A>
			             <A href="" target=_top><!-- <IMG src="<%=path %>/img/nav_changePassword.gif" align=absMiddle border=0>--></A>
			             <A href="" target=mainFrame><!-- <IMG src="<%=path %>/img/nav_resetPassword.gif" align=absMiddle border=0>--></A> 
			             <A href="#" target=mainFrame><!-- <IMG src="<%=path %>/img/nav_help.gif" align=absMiddle border=0>--></A> 
			             <IMG src="<%=path %>/img/menu_seprator.gif" align=absMiddle> <SPAN id=clock></SPAN>
			         </SPAN>
	            </TD>
	          </TR>
	       </TABLE>
        <DIV>
	    <SCRIPT type=text/javascript>
	       var clock = new Clock();clock.display(document.getElementById("clock"));
	    </SCRIPT>
</BODY>
</html>
