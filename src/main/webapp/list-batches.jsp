<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>  
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
	}

 </style> 
 
<body>

}

	<jsp:include page="header.jsp"></jsp:include>
	
	
	
	
	
	
	<div1 class="container w-25">
	<h2>Build a Batch</h2>
	<form method="post" action="onSubmit">
	
	
	<label for="StudentFName" class="form-label"> Student First Name</label><br>
	<input type="name" class="form control" name="firstName" id="firstName" ><br>
	
	<label for="StudentLName" class="form-label"> Student Last Name</label><br>
	<input type="name" class="form control" name="lastName" id="lastName" ><br>

	
	<label for="Skill" class="form-label"> Student Skill</label><br>
	<input type="radio" name="Current Skill " value="Master">Master
	<input type="radio" name="Current Skill" value="Adept">Adept
	<input type="radio" name="Current Skill" value="Novice">Novice	
	
		<br><br>
	<label for="Batches">Select a Batch to add to:</label>
	<br><br>

<div class="dropdown">
 <button>Batches</button>
  	<br><br>
  	
<div class="dropdown-options">
 <select name="Batches" id="Batches">
  <option value="Beginners">Beginners</option>
  <option value="Intense">Intense</option>
  <option value="marathon" >Marathon</option>
</select>
	

  </div>
</div>

	<br><br>
	
	
	<br>
  <button type="submit" class="btn btn-primary">Add to Batch</button>
	
		</form>
	</div1>
	

	<div2 class="container w-25" >
	<h2> View Current Batches</h2>


	</div2>
	
	
	
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>