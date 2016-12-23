<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; // basePath="http://localhost:8080/"
%>

<%
Cookie[] cookies = request.getCookies();
if(cookies!=null) {
	for(int i=0;i<cookies.length;i++) {
		if(cookies[i].getName().equals("userAcount")){
			 pageContext.setAttribute("login", "wsx");
		}
	}
}
%>
   <div class="container  hidden-xs">
            <div class="row header-top">
                <p class="col-xs-12 col-sm-6 col-md-6 col-lg-6">客服电话:010-594-78634</p>
                <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 text-right">
                    <div>
                       <a href="#" target="_blank"> <img alt=""  src="imges/54537.png"></a>
                        <a href="#" target="_blank"><img alt=""  src="imges/45678678.png"></a>
                        <a href="#" target="_blank"> <img alt=""  src="imges/54375483543.png"></a>
                        
                     <c:choose>
					   	<c:when test="${not empty pageScope.login}">
							<a href="#" style="color:black;">小金人</a>
                            <a href="<%=basePath%>clearSession" style="color:black;">退出</a>
						</c:when>	
						<c:otherwise>
							<a href="<%=basePath%>login" style="color:black;">登录</a>
                     	    <a href="<%=basePath%>register" style="color:black;">注册</a>
						</c:otherwise>
						
					</c:choose>
                    </div>
                </div>
            </div>
	</div>
		
	<nav class="navbar navbar-default">
			<div class="container">
					<div class="navbar-header">
						<a href="#" class="navbar-brand">
                       		 <img src="imges/logo.png" alt="Brand" class="img-responsive">
                    	</a>
					<button data-target="#open-nav" data-toggle="collapse" class="navbar-toggle btn-primary collapsed" aria-expanded="false">
                            <span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
                     </button>
					</div>
					<div id="open-nav" class="navbar-collapse collapse" aria-expanded="false" style="height: 1px;">
                    <ul class="nav navbar-nav navbar-right text-center list-inline">
                        <li><a href="<%=basePath%>homePage">首页</a></li>
                        <li><a href="<%=basePath%>u/professionPage">职业</a></li>
                        <li><a href="">推荐</a></li>
                        <li><a href="">关于</a></li>
                    </ul>
                </div>
								
			</div>	
	</nav>