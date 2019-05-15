<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">

function test() {
	$.ajax({
		url:"Manager/test.do",
		type:"post",
		dataType:"json",
		success:function(a){
			$(".table").append("<tr>ID</tr><tr>姓名</tr><tr>密码</tr>")
			$(a).each(function(){
				$(".table").append("<tr>"+
						"<td>"+this.userId+"</td>"+"<td>"+this.userName+"</td>"+"<td>"+this.userPw+"</td>"
				+"</tr>"
						
				
				
				)
			})
			
			
		},
		error:function(){
			alert("错误");
		}
	})
}


</script>
<body onload="test()">
<table class="table">
      

</table>
</body>
</html>