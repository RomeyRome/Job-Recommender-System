<%@page import="java.sql.ResultSet"%>
<%@page import="dbLayer.admin"%>
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
</head>
<body id="home">
	<header class="navbar navbar-inverse normal" role="banner">
  <div class="container">
    <div class="navbar-header">
      <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a href="index.html" class="navbar-brand"><img src="images/logo.png" /></a> </div>
    <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
      <ul class="nav navbar-nav navbar-right">
        <li> <a href="index.jsp"> LogOut </a> </li>
      </ul>
    </nav>
  </div>
	</header>

	<div id="features">
		<div class="container">
			<div class="row feature">
				<div class="col-md-7 info">
					<h2>User Logs </h2><br><br><br>
                    
                          <style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;border-color:#aaa;border-width:1px;border-style:solid;}
.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;border-color:#aaa;color:#333;background-color:#fff;}
.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 15px;border-style:solid;border-width:0px;overflow:hidden;word-break:normal;border-color:#aaa;color:#fff;background-color:#4589E3;}
.tg .tg-z2zr{background-color:#FCFBE3}
</style>

      <table class="tg">
        <tr>
          <th class="tg-031e">Log No</th>
          <th class="tg-031e">User Data</th>
          <th class="tg-031e">Recommendation</th>
          <th> </th>
        </tr>
        <tbody>
            <%
                admin obj = new admin();
                ResultSet rs = obj.logData();

                String logNo = "";
                String uData = "";
                String recommendation = "";

                    while (rs.next()) {
                    logNo = rs.getString("logno");
                    uData = rs.getString("uData");
                    recommendation = rs.getString("recommendation");

                    out.print("<tr>");
                    out.print("<td>" + logNo + "</td>");
                    out.print("<td>" + uData + "</td>");
                    out.print("<td>" + recommendation + "</td>");
                    out.print("</tr>");
                }
            %>
        </tbody>
      </table>
                    <br>
					<div class="image">
					</div>
				</div>
				<div class="col-md-offset-1 col-md-4 info form">
                <br><br><br><br><br><br><br><br>
			    
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
