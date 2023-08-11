<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Yamin's Studio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
 
 <style>
 .navbar-brand, .nav-link{
 color: #FFFFFF !important;

 
}

.bg-body-tertiary{
	--bs-bg-opacity: 1;
	 background-color: black;
	}
	.container{
	border: 2px solid black;
	padding: 20px;
	margin-top:30px;
	text-align: center;
 </style> 
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	
	
	<div class="container w-25">
	<<h2> Add Students</h2>
	<form method="post" action="onSubmit">
	
	<label for="StudentFName" class="form-label"> Student first name</label> <br>
	<input type="name" class="form control" name="firstName" id="firstName" ><br>
	
	<label for="StudentLName" class="form-label"> Student last name</label><br>
	<input type="name" class="form control" name="lastName" id="lastName" ><br>
	
	<label for="StudentId" class="form-label"> Student ID Number</label><br>
	<input type="name" class="form control" name="StudentId" id="StudentId" ><br>
		<br><br>
	

	
	<label for="Rank" class="form-label"> Student Rank</label><br>
	<input type="radio" name="Current Rank" value="Master">Master
	<input type="radio" name="Current Rank" value="Adept">Adept
	<input type="radio" name="Current Rank" value="Novice">Novice	
	
	<br><br>
	
	<label for="StartDate" class="form-label"> Student Start Date</label><br>
	<input type="Date" class="form control" name="StartDate" id="StartDate" ><br>
	
	<br><br>
	
	
	
  <button type="submit" class="btn btn-primary">Create New Student</button>
  
  
 
</form>
</div>
	
	
	<br><br><br>
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>