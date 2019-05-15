<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		<script type="text/javascript" src="<%=path%>/js/jquery-1.12.4.js"></script>
        <script language="javascript">
           function adminDel(userId)
           {
                   window.location.href="<%=path %>/Manager/DelManager.do?userId="+userId;
           }
           function adminAdd()
           {
                 var url="<%=path %>/admin/admin/adminAdd.jsp";
                 //var n="";
                 //var w="480px";
                 //var h="500px";
                 //var s="resizable:no;help:no;status:no;scroll:yes";
				 //openWin(url,n,w,h,s);
				 window.location.href=url;
           }
<%-- 
           function test() {
        		$.ajax({
        			url:"<%=path%>/Manager/test.do",
        			type:"post",
        			dataType:"json",
        			success:function(a){
        				$(a).each(function(){
        					$("table").append("<tr align='center' bgcolor='#FFFFFF' onMouseMove='javascript:this.bgColor='red';>' height='22'"+
        							"<td  bgcolor='#FFFFFF'  align='center'>"+this.userName+"</td>"+
        							"<td  bgcolor='#FFFFFF'  align='center'>"+this.userPw+"</td>"+
        							"<td bgcolor='#FFFFFF' align='center'>"+
        							"<input type='button' value='删除' onclick='adminDel(${"+this.userId+"})'>"
        							+"</td>"
        					+"</tr>")


        				})
        				
        				
        			},
        			error:function(){
        				alert("错误");
        			}
        		})
        	} --%>

       </script>
	</head>
	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif' onload="test()">
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="3" background="<%=path %>/img/tbg.gif">&nbsp;管理员&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="33%"  id="userName">帐号</td>
					<td width="33%">密码</td>
					<td width="33%">密码</td>
		        </tr>	
          	<c:forEach items="${sessionScope.adminList}" var="admin">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center" class="userName">
						${admin.userName}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${admin.userPw}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						     <input type="button" value="删除" onclick="adminDel(${admin.userId})"/>
					</td>
				</tr>
			</c:forEach> 
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
			  <tr>
			    <td>
			      <input type="button" value="添加" style="width: 80px;" onclick="adminAdd()" />
			    </td>
			  </tr>
		    </table>
		    <table class="table"></table>
	</body>
</html>
