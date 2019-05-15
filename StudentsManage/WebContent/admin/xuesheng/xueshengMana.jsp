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
		
        <script language="javascript">
           function xueshengDel(id)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/Student/StudentDel.do?id="+id;
               }
           }
           
           function xueshengAdd()
           {
                 var url="<%=path %>/admin/xuesheng/xueshengAdd.jsp";
                 //var n="";
                 //var w="480px";
                 //var h="500px";
                 //var s="resizable:no;help:no;status:no;scroll:yes";
				 //openWin(url,n,w,h,s);
				 window.location.href=url;
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="23" background="<%=path %>/img/tbg.gif">&nbsp;学生管理&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
				    <td width="11%">序号</td>
					<td width="11%">学号</td>
					<td width="11%">姓名</td>
					<td width="11%">性别</td>
					
					<td width="11%">年龄</td>
					<td width="11%">班级</td>
					<td width="11%">登陆账号</td>
					<td width="11%">登陆密码</td>
					
					<td width="11%">操作</td>
		        </tr>	
		        
				<c:forEach items="${sessionScope.studentlist}" var="xuesheng" varStatus="sta">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						${sta.index+1}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${xuesheng.xuehao}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${xuesheng.xingming}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${xuesheng.xingbie}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${xuesheng.nianling}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${xuesheng.banji}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${xuesheng.loginname}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${xuesheng.loginpw}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a href="#" onclick="xueshengDel(${xuesheng.id})">删除</a>
					</td>
				</tr>
				</c:forEach>
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
			  <tr>
			    <td>
			      <input type="button" value="添加" style="width: 80px;" onclick="xueshengAdd()" />
			    </td>
			  </tr>
		    </table>
	</body>
</html>
