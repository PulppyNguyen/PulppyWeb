<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
	integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
	integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
	crossorigin="anonymous"></script>
</head>

<body style="background-color: #d4ebf6">
	<!-- Navbar Start -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><span class="navbar-brand">Pulppy
					Entertainment</span></li>
		</ul>
		<form class="form-inline my-2 my-lg-0">
			<input class="form-control mr-sm-2" type="text" placeholder="Search"
				aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		</form>
	</div>
	</nav>
	<!-- Navbar End -->

	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<!-- Left Side Start -->
				<div class="col-md-1"></div>
				<div class="col-md-2">
					<div class="list-group" id="list-tab" role="tablist">
						<a class="list-group-item list-group-item-action active" id="list-home-list" data-toggle="list" href="#list-home" role="tab" aria-controls="home">Home</a>
						<a class="list-group-item list-group-item-action" id="list-profile-list" data-toggle="list" href="#list-profile" role="tab" aria-controls="profile">Movie</a>
						<a class="list-group-item list-group-item-action" id="list-messages-list" data-toggle="list" href="#list-messages" role="tab" aria-controls="messages">Music</a>
						<a class="list-group-item list-group-item-action" id="list-settings-list" data-toggle="list" href="#list-settings" role="tab" aria-controls="settings">Blog</a>
					</div>
				</div>
				<!-- Left Side End -->

				<!-- ================================================================ -->

				<!-- Content Side Start -->
				<div class="col-md-6">
					<c:forEach items="${musicList}" var="music">
						<div class="media">
							<div class="media">
								<img class="d-flex mr-3" src="${music.musicImage}"
									alt="Generic placeholder image">
								<div class="media-body">

									<h5 class="mt-0">${music.musicName}- ${music.musicSinger}
										- ID: ${music.musicID}</h5>
									<audio controls> <source src="${music.musicLink}"
										type="audio/mpeg"></audio>
									<br /> ${music.musicDescription}
								</div>
							</div>
							<br />
					</c:forEach>
				</div>
			</div>
			<!-- Content Side End -->

			<!-- ================================================================ -->

			<!-- Right Side Start -->
			<div class="col-md-2">
				<!-- <ul class="list-group">
								<li class="list-group-item d-flex justify-content-between align-items-center">
								Component 1
									<span class="badge badge-default badge-pill">14</span>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
								Component 2
									<span class="badge badge-default badge-pill">2</span>
								</li>
								<li class="list-group-item d-flex justify-content-between align-items-center">
								Component 3
									<span class="badge badge-default badge-pill">1</span>
								</li>
							</ul> -->
			</div>
			<div class="col-md-1"></div>
			<!-- Right Side End -->

			<!-- ================================================================ -->
		</div>
	</div>
	</div>

</body>
</html>