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
        </script>
	</head>
	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="23" background="<%=path %>/img/tbg.gif">&nbsp;课表信息&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
				    <td width="5%">序号</td>
					<td width="11%">课程编号</td>
					<td width="11%">课程名称</td>
					<td width="11%">课时</td>
					<td width="11%">时间</td>
					
					<td width="11%">节次</td>
					<td width="11%">上课教室</td>
					<td width="11%">授课老师</td>
		        </tr>	
				<c:forEach items="${sessionScope.StudentKebiaolist}" var="kebiao" varStatus="sta">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						${sta.index+1}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${kebiao.kecheng.bianhao}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${kebiao.kecheng.mingcheng}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${kebiao.kecheng.keshi}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${kebiao.shijian}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${kebiao.jieci}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${kebiao.jiaoshi}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${kebiao.teacher.xingming}
					</td>
				</tr>
				</c:forEach>
			</table>
	</body>
</html>
