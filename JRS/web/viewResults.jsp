<%@page import="dbLayer.admin"%>
<%@page import="BLL.LinkedinDataHandler"%>
<%@page import="BLL.MLPCal"%>
<%@page import="java.util.List"%>
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
					<h2>Here are the Next Job Recommendation for You! </h2><br><br>
                                        <h3> <%
        String urlString = request.getParameter("txtAddress");
        //out.print(urlString);
        String job="";

        String[] data = LinkedinDataHandler.getResults(urlString);
        MLPCal.trainNet();

        //String[] userData = "Software Engineer Intern,none,none,none,none,none,none,BSc (Hons) Software Engineering,none,OOP,JavaScript,Java,C#,.NET,CSS,none,none,none,none,none,none,none,none,none,none,none,".split(",") 
        List<Double> dataList = MLPCal.suggestClass(data);

        if (dataList.get(0).doubleValue() > 0.5) {
            out.println("Software Engineer");
            job="Software Engineer";
        } else if (dataList.get(1).doubleValue() > 0.5) {
            out.println("Senior Software Engineer");
            job="Senior Software Engineer";
        } else if (dataList.get(2).doubleValue() > 0.5) {
            out.println("Project Manager");
            job="Project Manager";
        } else if (dataList.get(3).doubleValue() > 0.5) {
            out.println("Project Manager");
            job="Project Manager";
        } else {
            out.println("None");
            job="None";
        }
        
//          admin obj=new admin();
//          obj.recommecndation=job;
//          obj.uData=data.toString();
//          obj.logNo="1";
//          obj.insertData();
          
    %> </h3> 
                                        <br>
					<ul>
						<li>This recommendation is giving to your according to your skills in your LinkedIn profile</li>
						<li>If you didn't updated your LinkedIn profile this recommendation might be get wrong </li>						
						<li>So make sure your LinkedIn Profile is up to date </li>
						<li>Leverage AI Technology, find Job similar to your best skills.</li>
					</ul>
                    <br>
					<div class="image">
                    <h3>We got some Job vacancies for your match. Click below to view them</h3>
                    
                     <button type="submit" class="button share-show">View vacancies</button>
					</div>
				</div>
				<div class="col-md-offset-1 col-md-4 info form">
                <br><br><br><br><br><br><br><br>
			    <img src="images/sideview.png" class="img-responsive" alt="feature1" />
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