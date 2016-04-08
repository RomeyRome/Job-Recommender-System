<%-- 
    Document   : index
    Created on : Apr 2, 2016, 1:45:24 PM
    Author     : Romesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<!-- Added by HTTrack -->
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<!-- /Added by HTTrack -->
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
  <title>Predikt: Predictive Hiring Software. Instantly Find and Source Top Talent</title>
  <meta name="description" content="Predikt's recruiting platform instantly recommends qualified active and passive candidates. Algorithmically curated talent pool of developers, engineers, product managers, designers" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta property="og:type" content="article" />
  <meta property="og:title" content="Predictive Hiring Software. Instantly Find and Source Top Talent" />
  <meta property="og:description" content="Leverage the power of Big Data and Data Science for recruiting. Predikt's recruiting platform instantly recommends qualified active and passive talent from an algorithmically curated talent pool of developers, engineers, product managers, designers" />
  <meta property="og:url" content="https://www.predikt.co/" />
  <meta property="og:site_name" content="Predikt" />
  <meta content='INDEX, FOLLOW' name='ROBOTS'>
  <link rel="shortcut icon" href="images/favicon.ico" />

  <!-- stylesheets -->
  <link rel="stylesheet" type="text/css" href="css/compiled/theme.css">
  <link rel="stylesheet" type="text/css" href="css/vendor/animate.css">

  <!-- javascript -->
  <script src="../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
  <script src="js/bootstrap/bootstrap.min.js"></script>
  <script src="js/theme.js"></script>

<body id="home">
<header class="navbar navbar-inverse hero" role="banner">
  <div class="container">
    <div class="navbar-header">
      <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a href="index.html" class="navbar-brand"><img src="images/logo.png" /></a> </div>
    <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
      <ul class="nav navbar-nav navbar-right">
        <li> <a href="adminLogin.jsp"> Admin </a> </li>
      </ul>
    </nav>
  </div>
</header>
    
        <script type="text/javascript" src="//platform.linkedin.com/in.js">
            api_key: 75a4oosd0t4xnp
            authorize: true
            onLoad: onLinkedInLoad
        </script>

        <script type="text/javascript">

            function onLinkedInLoad() {
                IN.UI.Authorize().place();
                IN.Event.on(IN, "auth", function () {
                    onLogin();
                });
                IN.Event.on(IN, "logout", function () {
                    onLogout();
                });
            }
            function onLogin() {
                IN.API.Profile("me")
                        .fields("firstName", "lastName", "industry", "publicProfileUrl")
                        .result(displayProfiles);
            }
            function displayProfiles(profiles) {
                var members = profiles.values;
                for (var member in members) {
                    window.location.href='viewResults.jsp?txtAddress='+members[member].publicProfileUrl;
                }
            }
        </script>
        
<div id="hero">
  <div class="container">
    <h1 class="hero-text animated fadeInDown"> Discover your next Job<br>
      <strong>Instantly</strong> </h1>
    <p class="sub-text animated fadeInDown">Our System's AI finds you to Best Fitting Job positions based on your skills in your LinkedIn Profile.</p>
    <div class="cta animated fadeInDown"><a input type="button" class="button" onclick="onLinkedInLoad()">Get Started</a> </div>
    <div class="img"></div>
  </div>
</div>
<div id="features">
  <div class="container">
    <div class="row feature">
      <div class="col-md-6 info">
        <h4><strong>No more Boolean Keyword searching</strong></h4>
        <h5>Hire smarter, stop spending time with long keyword strings</h5>
        <p> All the existing sourcing tools offer keyword search interface, which is very cumbersome, requires long strings, does not rank candidates, and importantly, does not understand what you are exactly looking for.
          We take the pain out of searching, and automatically recommend top candidates. </p>
      </div>
      <div class="col-md-6 info">
        <h4><strong>Automation: Hire for 100's of Jobs</strong></h4>
        <h5>Using Predikt's technology, you can do months of work in a few hours</h5>
        <p class="p100"> You can post 100's of Jobs on our platform and automatically get candidate recommendations. Scale your teams instantly. We maintain an algorithmically curated pool of developers, engineers, product managers, designers and other talent. </p>
      </div>
    </div>
  </div>
</div>
<div id="clients">
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <h3>Ready to find your perfecet fitting Job?</h3>
      <a href="index.html"> Get Started Now </a> </div>
    </div>
  </div>
</div>
<div id="footer" class="no-margin">
  <div class="container">
    <div class="row">
      <div class="col-sm-3 copyright"> © 2016 Predikt Inc </div>
    </div>
  </div>
</div>
</body>
</html>
