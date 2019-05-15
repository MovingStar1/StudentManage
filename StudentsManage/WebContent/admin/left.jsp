<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
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
		<STYLE type=text/css> 
		{
			FONT-SIZE: 12px
		}
		#menuTree A {
			COLOR: #566984; TEXT-DECORATION: none
		}
		</STYLE>

		<SCRIPT src="<%=path%>/js/TreeNode.js" type=text/javascript></SCRIPT>
		<SCRIPT src="<%=path%>/js/Tree.js" type=text/javascript></SCRIPT>
	</head>

	<BODY style="BACKGROUND-POSITION-Y: -120px;  BACKGROUND-REPEAT: repeat-x" topmargin="5">
		<TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%">
				<TR>
					<TD width=10 height=29>
						<IMG src="<%=path %>/img/bg_left_tl.gif">
					</TD>
					<TD
						style="FONT-SIZE: 18px; BACKGROUND-IMAGE: url(<%=path %>/img/bg_left_tc.gif); COLOR: white; FONT-FAMILY: system">
						
					</TD>
					<TD width=10>
						<IMG src="<%=path %>/img/bg_left_tr.gif">
					</TD>
				</TR>
				<TR>
					<TD style="BACKGROUND-IMAGE: url(<%=path %>/img/bg_left_ls.gif)"></TD>
					<TD id=menuTree
						style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px; HEIGHT: 100%; BACKGROUND-COLOR: white"
						vAlign=top></TD>
					<TD style="BACKGROUND-IMAGE: url(<%=path %>/img/bg_left_rs.gif)"></TD>
				</TR>
		</TABLE>
		<SCRIPT type=text/javascript>
                var tree = null;
	            var root = new TreeNode('系统菜单');
	            
	            <c:if test="${sessionScope.userType==0}">
	            var fun2 = new TreeNode('密码修改');
	            var fun21 = new TreeNode('密码修改', '<%=path %>/admin/userinfo/adminPw.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun2.add(fun21);
	            root.add(fun2);
	            
	            
	            var fun3 = new TreeNode('系统管理');
	            var fun31 = new TreeNode('系统管理', '<%=path %>/admin/admin/adminMana.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun3.add(fun31);
	            root.add(fun3);
	            
	            
	            var fun3 = new TreeNode('课程管理');
	            var fun31 = new TreeNode('课程管理', '<%=path %>/admin/kecheng/kechengMana.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            var fun32 = new TreeNode('课程录入', '<%=path %>/admin/kecheng/kechengAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun3.add(fun31);
	            fun3.add(fun32);
	            root.add(fun3);
	            
	            
	            var fun4 = new TreeNode('老师管理');
	            var fun41 = new TreeNode('老师管理', '<%=path %>/admin/laoshi/laoshiMana.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            var fun42 = new TreeNode('老师录入', '<%=path %>/admin/laoshi/laoshiAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun4.add(fun41);
	            fun4.add(fun42);
	            root.add(fun4);
	            
	            
	            var fun4 = new TreeNode('课表管理');
	            var fun41 = new TreeNode('课表管理', '<%=path %>/admin/kebiao/kebiaoMana.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            var fun42 = new TreeNode('课表录入', '<%=path %>/admin/kebiao/kebiaoAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun4.add(fun41);
	            fun4.add(fun42);
	            root.add(fun4);
	            
	            
	            var fun5 = new TreeNode('学生管理');
	            var fun51 = new TreeNode('学生管理', '<%=path %>/admin/xuesheng/xueshengMana.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            var fun52 = new TreeNode('学生录入', '<%=path %>/admin/xuesheng/xueshengAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun5.add(fun51);
	            fun5.add(fun52);
	            root.add(fun5);
	            </c:if>
	            
	            <c:if test="${sessionScope.userType==1}">
	            var fun2 = new TreeNode('我的信息');
	            var fun21 = new TreeNode('我的信息', '<%=path %>/alaoshi/myxinxi.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun2.add(fun21);
	            root.add(fun2);   
	            
	            var fun3 = new TreeNode('课表浏览');
	            var fun31 = new TreeNode('课表浏览', '<%=path %>/admin/kebiao/kebiaoMana_t.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun3.add(fun31);
	            root.add(fun3);   
	            </c:if>
	            
	            
	            
	            <c:if test="${sessionScope.userType==2}">
	            var fun2 = new TreeNode('我的信息');
	            var fun21 = new TreeNode('我的信息', '<%=path %>/axuesheng/myxinxi.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun2.add(fun21);
	            root.add(fun2);   
	            
	            
	            var fun3 = new TreeNode('课表信息');
	            var fun31 = new TreeNode('课表信息', '<%=path %>/admin/kebiao/kebiaoAll1.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun3.add(fun31);
	            root.add(fun3);   
	            
	            
	            var fun4 = new TreeNode('我的选课');
	            var fun41 = new TreeNode('我的选课', '<%=path %>/admin/kebiao/kebiaoAll.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
	            fun4.add(fun41);
	            root.add(fun4);   
	            </c:if>     
	            
	            tree = new Tree(root);
	            tree.show('menuTree');
        </SCRIPT>
	</BODY>
</html>
