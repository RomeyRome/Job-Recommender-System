<%-- 
    Document   : adminLogin
    Created on : Apr 2, 2016, 2:24:10 PM
    Author     : Romesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<!-- Mirrored from www.predikt.co/request-demo.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 31 Mar 2016 06:08:44 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
  <script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
    (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','../www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-41946666-4', 'auto');
    ga('send', 'pageview');

  </script>
	<meta charset="UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />	
	<title>Predikt: Predictive Candidate Sourcing Software</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta property="og:type" content="article" />
	<meta property="og:title" content="Predictive Candidate Sourcing Software. Instantly Find and recruit top talent." />
	<meta property="og:description" content="Predikt instantly recommends top talent similar to your best hires." />
	<meta property="og:url" content="https://www.predikt.co/" />
	<meta property="og:site_name" content="Predikt" />
	
	
	<link rel="shortcut icon" href="images/favicon.ico" />
	<!-- stylesheets -->
	<link rel="stylesheet" type="text/css" href="css/compiled/theme.css">
	<link rel="stylesheet" type="text/css" href="css/vendor/animate.css">
	<link rel="stylesheet" type="text/css" href="css/vendor/flexslider.css">
	<link rel="stylesheet" type="text/css" href="css/vendor/font-awesome.min.css">

	<!-- javascript -->
	<script src="../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="js/bootstrap/bootstrap.min.js"></script>
	<script src="js/theme.js"></script>

	<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
        <script>
   function submitClick(){   
          
           document.location.href = "http://localhost:8080/JRS_0.3/loginAdmin?adminName="
                   + document.getElementById("txtUsername").value 
                   + "&adminPass=" 
                   +  document.getElementById("txtPassword").value; 
   }
        </script>
                    
</head>
<body id="home">
	<header class="navbar navbar-inverse normal" role="banner">
  		<div class="container">
    		<div class="navbar-header">
      			<a href="index.html" class="navbar-brand"><img src="images/logo.png" /></a>
    		</div>
  		</div>
	</header>

	<div id="features">
		<div class="container">
			<div class="row feature">
				<div class="col-md-7 info">
					<form role="form" id="FormSubmit">
						<h4>Admin Login</h4>
                        <br>
						<div class="form-group">
				    		<label for="name">User Name<span>(required)</span></label>
				    		<input type="text" class="form-control" id="txtUsername" required />
				  		</div>
				  		<div class="form-group">
				    		<label for="email">Password <span>(required)</span></label>
				    		<input type="email" class="form-control" id="txtPassword" required />
				  		</div> 
				  		<div class="submit">
				  			<button class="button share-show" onclick="submitClick()">
					  			<span>Login to the Admin Panel</span>
					  		</button>
				  		</div>
					</form>
                    <br><br><br><br><br><br><br><br><br><br><br>
				</div>
				<div class="col-md-offset-1 col-md-4 info form">

				</div>
			</div>
		</div>		
	</div>
	<div id="footer">
		<div class="container">
			<div class="row">
				<div class="col-sm-3 copyright">
					© 2016 Predikt Inc.
				</div>
			</div>
		</div>
	</div>

    <script type="text/javascript">
        $(function() {
            /* Demo code for show / hide share option */
            $('#FormSubmit').submit(function(e) {
                var forScreening = $("#forsceening").is(":checked");
                var forSourcing = $("#forsourcing").is(":checked");
                var postData = {"name": $("#name").val(), "email": $("#email").val(),
                                "phone": $("#phone").val(),
                                "forscreening": forScreening, "forsourcing": forSourcing,
                                "atsone": $("#atsone").val(), "comments": $("#comments").val()}
                $.post( "/demo-request", postData, function( data ) {
                    $('.info.form').addClass('hide');
                    $('.info.share').removeClass('hide').addClass('animated fadeInDown');
                }).fail(function() { alert("error"); }); 

                e.preventDefault();
            });
        });
    </script>
</body>

<!-- Mirrored from www.predikt.co/request-demo.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 31 Mar 2016 06:08:49 GMT -->
</html>

