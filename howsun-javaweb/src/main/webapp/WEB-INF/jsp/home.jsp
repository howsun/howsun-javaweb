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
	
	<title>首页</title>
	<link href="${baseUrl}/css/bootstrap.min.css" rel="stylesheet"/>
	<link href="${baseUrl}/css/bootstrap-theme.min.css" rel="stylesheet"/>
	<link href="${baseUrl}/css/style.css" rel="stylesheet"/>
	
	<style type="text/css">
	</style>
</head>

<body>
	<div class="container">
		<!-- 顶部（标志、搜索框） -->
		<div class="row">
			<div class="col-xs-3 logo">Logo</div>
			<div class="col-xs-9 top_right">
				<form action="">
				<input name='key' placeholder="搜索..."/>
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
	
	<div class="container">
		<!-- 主体（左右两栏） -->
		<div class="row">
			<div class="col-sm-8">
				<div class="panel panel-default" style="min-height: 400px;">
				  <div class="panel-body">
				  		<h1>标题1</h1>
				  		<h2>标题2</h2>
				  		<h3>标题3</h3>
				  		<p>段落</p>
				  		<p class="lead">表示通知信息的，如请求收到了或正在进行处理。</p>
						<p>
							<small>
								2xx 表示成功，如接受或知道了。<br/>
								3xx 表示重定向，表示要完成请求还必须采取进一步的行动。<br/>
								4xx 表示客户的差错，如请求中有错误的语法或不能完成。<br/>
								5xx 表示服务器的差错，如服务器失效无法完成请求。<br/>
							</small>
						</p>
						<blockquote>
						来自《设计模式》一书                         。
						</blockquote>
						<p class="small">设计模式：工厂模式（模拟数据库方言实例讲解），单例模式（懒汉模式，饿汉模式），MVC模式(模型、视图、控制器)、桥接模式、代理模式 等等总共23种。	</p>
				  		<pre><var>var</var> myvar = {id:1,name:"howsun"};</pre>
				  		
				  		<div style="width: 400px;" class="text-left">JavaEE组件介绍</div>
				  		<div style="width: 400px;" class="text-center">JAX-RS是JAVA EE6 引入的一个新技术</div>
				  		<div style="width: 400px;" class="text-right">JAX-RS</div>
				  		<p class="text-center">中间</p>
				  		<p class="text-right">右边</p>
				  		<p align="center">中间</p>
				    	<br/><br/><br/><br/><br/>左边<br/><br/><br/><br/>
				    	
				    	<p class="text-primary">设计模式：工厂模式（模拟数据库方言实例讲解），单例模式（懒汉模式，饿汉模式），MVC模式(模型、视图、控制器)、桥接模式、代理模式 等等总共23种。</p>
				    	<p class="text-success">前端框架：Bootstrap(根据CSS3的 @ media屏幕查询特性，将显示设备分为4种模式，并根据这些模式设定了一套栅格，以及各种常用组件)、EasyUI</p>
				    	<p class="text-info">数据库设计：用户模块 BBS项目</p>
				    	<p class="text-warning">数据库防注入攻击：使用Spring MVC接收参数，对字符串类型进行安全过滤，JDBC使用PreparedStatement。</p>
				    	<p class="text-danger">跨系统调用：RPC框架（Dubbe），HTTP、WebService</p>
				    	<button class="btn btn-primary">确定</button>
				    	<button class="btn btn-success">成功</button>
				    	<button class="btn btn-info">信息</button>
				    	<button class="btn btn-warning">删除</button>
				    	<button class="btn btn-danger">清空</button>
				    	
				    	
				    	<div class="panel panel-default">
						  <div class="panel-heading">默认面板</div>
						  <div class="panel-body">
						    Panel content
						  </div>
						</div>
				    	
				    	<div class="panel panel-primary">
						  <div class="panel-heading">主面板</div>
						  <div class="panel-body">
						    Panel content
						  </div>
						</div>
				    	
				    	<div class="panel panel-success">
						  <div class="panel-heading">成功消息</div>
						  <div class="panel-body">
						    	您操作已完成
						  </div>
						</div>
				    	
				    	<div class="panel panel-info">
						  <div class="panel-heading">信息面板</div>
						  <div class="panel-body">
						    Panel content
						  </div>
						</div>
				    	
				    	<div class="panel panel-warning">
						  <div class="panel-heading">警告</div>
						  <div class="panel-body">
						    Panel content
						  </div>
						</div>
				    	
				    	<div class="panel panel-danger">
						  <div class="panel-heading">你确定要清空吗？</div>
						  <div class="panel-body">
						    Panel content
						  </div>
						</div>
				  </div>
				</div>
			</div>
			<div class="col-sm-4 hidden-xs hidden-print">
				<div class="panel panel-default" style="min-height: 400px;">
				  <div class="panel-body">
				  		<div class="table-responsive">
				  		
				  		<table class="table">
				  			<thead>
				  				<tr>
				  					<th>ID</th>
				  					<th>姓名</th>
				  					<th>日期</th>
				  					<th>状态</th>
				  					<th>操作</th>
				  				</tr>
				  			</thead>
				  			
				  			<tbody>
				  				<tr>
				  					<td>1</td>
				  					<td>张三</td>
				  					<td>2017-4-20</td>
				  					<td>有效</td>
				  					<td><a href="#">编辑</a></td>
				  				</tr>
				  				<tr>
				  					<td>2</td>
				  					<td>李四</td>
				  					<td>2017-4-20</td>
				  					<td>有效</td>
				  					<td><a href="#">编辑</a></td>
				  				</tr>
				  				<tr>
				  					<td>3</td>
				  					<td>王三</td>
				  					<td>2017-4-20</td>
				  					<td>有效</td>
				  					<td><a href="#">编辑</a></td>
				  				</tr>
				  				<tr>
				  					<td>4</td>
				  					<td>吴四</td>
				  					<td>2017-4-20</td>
				  					<td>有效</td>
				  					<td><a href="#">编辑</a></td>
				  				</tr>
				  				<tr>
				  					<td>5</td>
				  					<td>张三</td>
				  					<td>2017-4-20</td>
				  					<td>有效</td>
				  					<td><a href="#">编辑</a></td>
				  				</tr>
				  				<tr>
				  					<td>6</td>
				  					<td>李一</td>
				  					<td>2017-4-20</td>
				  					<td>有效</td>
				  					<td><a href="#">编辑</a></td>
				  				</tr>
				  			</tbody>
				  			<!-- 
				  			<tfoot>
				  				
				  			</tfoot>
				  			 -->
				  		</table>
				  		</div>
				  		
				  		<img src="${baseUrl}/images/doctor.jpg" class="img-responsive img-rounded"/>
				  		<img src="${baseUrl}/images/notfound.png" class="img-responsive img-circle"/>
				    	<div>
				    		<div class="pull-left">左边</div>
				    		<div class="pull-right">右边</div>
				    		<div class="clearfix "></div>
				    	</div>
				    	<div class="hide">====</div>
				    	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
				  </div>
				</div>
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