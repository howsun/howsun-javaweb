<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String baseUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
pageContext.setAttribute("baseUrl", baseUrl);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<title>登录</title>
	<link href="${baseUrl}/css/bootstrap.min.css" rel="stylesheet"/>
	<link href="${baseUrl}/css/bootstrap-theme.min.css" rel="stylesheet"/>
	<link href="${baseUrl}/css/style.css?v1" rel="stylesheet"/>
	
	<style type="text/css">
		
	</style>
</head>

<body>
	<div class="container">
		<!-- 顶部（标志、搜索框） -->
		<div class="row">
			<div class="col-xs-3 logo">Logo</div>
			<div class="col-xs-3 hidden-sm hidden-xs"> </div>
			<div class="col-xs-6 search">
				<form action="" class="form-inline">
					<div class="input-group" style="margin-left: auto;margin-right: auto;width: 360px;">
						<input name='key' placeholder="搜索..." class="form-control" size="40"/>
						<span class="input-group-btn">
					        <button class="btn btn-default" type="button"><i class="glyphicon glyphicon-search" style="color: red"></i></button>
					    </span>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div class="container-fluid" id="menu">
		<!-- 菜单 -->
		<div class="container">
			<ul>
				<li><a href="#">公司介绍</a></li>
				<li><a href="#">产品服务<span class="caret"></span></a></li>
				<li><a href="#">最新动态</a></li>
				<li><a href="#">关于我们</a></li>
				<li><a href="#">联系我们</a></li>
			</ul>
		</div>
	</div>
	
	<div class="container passport_panel">
		<div class="row">
			<div class="col-md-5">
				<div class="passport_panel_sub">
					<div class="panel panel-warning">
						<div class="panel-heading">欢迎登录</div>
						  <div class="panel-body">
						    <form class="form-inline">
						    	<p>用户名：<input type="text" name="username" class="form-control" size="30"/></p>
						    	<p>密　码：<input type="password" name="passport" class="form-control" size="30"/></p>
						    	<p>验证码：<input type="text" name="validcode" class="form-control"/>	<img alt="验证码" src=""/></p>
						    	<button class="btn btn-info btn-block">登录</button>
						    </form>
						  </div>
					</div>
				
				</div>
			</div>
			<div class="col-md-7 hidden-sm hidden-xs">
				<br/><br/><br/><br/>
				<h1 align="center" style="color: #FFF;">一句广告语</h1>
			</div>
		</div>
	</div>
	
	<!-- 页脚 -->
	<div class="container-fluid" style="background-color: #F2F2F2;margin-top: 20px;line-height: 50px">
		<div class="container">
			<p align="center">版权所有 @ howsun.org</p>
		</div>
	</div>
	<script type="text/javascript" src="${baseUrl}/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="${baseUrl}/js/bootstrap.min.js"></script>
</body>
</html>