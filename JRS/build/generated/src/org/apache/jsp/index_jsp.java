package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<!-- Added by HTTrack -->\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" />\r\n");
      out.write("<!-- /Added by HTTrack -->\r\n");
      out.write("<head>\r\n");
      out.write("  <script>\r\n");
      out.write("    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\r\n");
      out.write("    (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\r\n");
      out.write("    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\r\n");
      out.write("    })(window,document,'script','../www.google-analytics.com/analytics.js','ga');\r\n");
      out.write("\r\n");
      out.write("    ga('create', 'UA-41946666-4', 'auto');\r\n");
      out.write("    ga('send', 'pageview');\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("  <meta charset=\"UTF-8\" />\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("  <title>Predikt: Predictive Hiring Software. Instantly Find and Source Top Talent</title>\r\n");
      out.write("  <meta name=\"description\" content=\"Predikt's recruiting platform instantly recommends qualified active and passive candidates. Algorithmically curated talent pool of developers, engineers, product managers, designers\" />\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("  <meta property=\"og:type\" content=\"article\" />\r\n");
      out.write("  <meta property=\"og:title\" content=\"Predictive Hiring Software. Instantly Find and Source Top Talent\" />\r\n");
      out.write("  <meta property=\"og:description\" content=\"Leverage the power of Big Data and Data Science for recruiting. Predikt's recruiting platform instantly recommends qualified active and passive talent from an algorithmically curated talent pool of developers, engineers, product managers, designers\" />\r\n");
      out.write("  <meta property=\"og:url\" content=\"https://www.predikt.co/\" />\r\n");
      out.write("  <meta property=\"og:site_name\" content=\"Predikt\" />\r\n");
      out.write("  <meta content='INDEX, FOLLOW' name='ROBOTS'>\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- stylesheets -->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/compiled/theme.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/animate.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- javascript -->\r\n");
      out.write("  <script src=\"../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"js/theme.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<body id=\"home\">\r\n");
      out.write("<header class=\"navbar navbar-inverse hero\" role=\"banner\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\".bs-navbar-collapse\"> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\r\n");
      out.write("      <a href=\"index.html\" class=\"navbar-brand\"><img src=\"images/logo.png\" /></a> </div>\r\n");
      out.write("    <nav class=\"collapse navbar-collapse bs-navbar-collapse\" role=\"navigation\">\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li> <a href=\"adminLogin.html\"> Admin </a> </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("    \r\n");
      out.write("        <script type=\"text/javascript\" src=\"//platform.linkedin.com/in.js\">\r\n");
      out.write("            api_key: 75a4oosd0t4xnp\r\n");
      out.write("            authorize: true\r\n");
      out.write("            onLoad: onLinkedInLoad\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("            function onLinkedInLoad() {\r\n");
      out.write("                IN.UI.Authorize().place();\r\n");
      out.write("                IN.Event.on(IN, \"auth\", function () {\r\n");
      out.write("                    onLogin();\r\n");
      out.write("                });\r\n");
      out.write("                IN.Event.on(IN, \"logout\", function () {\r\n");
      out.write("                    onLogout();\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("            function onLogin() {\r\n");
      out.write("                IN.API.Profile(\"me\")\r\n");
      out.write("                        .fields(\"firstName\", \"lastName\", \"industry\", \"publicProfileUrl\")\r\n");
      out.write("                        .result(displayProfiles);\r\n");
      out.write("            }\r\n");
      out.write("            function displayProfiles(profiles) {\r\n");
      out.write("                var members = profiles.values;\r\n");
      out.write("                for (var member in members) {\r\n");
      out.write("                    window.location.href='viewResults.jsp?txtAddress='+members[member].publicProfileUrl;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("<div id=\"hero\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <h1 class=\"hero-text animated fadeInDown\"> Discover your next Job<br>\r\n");
      out.write("      <strong>Instantly</strong> </h1>\r\n");
      out.write("    <p class=\"sub-text animated fadeInDown\">Our System's AI finds you to Best Fitting Job positions based on your skills in your LinkedIn Profile.</p>\r\n");
      out.write("    <div class=\"cta animated fadeInDown\"><a input type=\"button\" class=\"button\" onclick=\"onLinkedInLoad()\">Get Started</a> </div>\r\n");
      out.write("    <div class=\"img\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"features\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row feature\">\r\n");
      out.write("      <div class=\"col-md-6 info\">\r\n");
      out.write("        <h4><strong>No more Boolean Keyword searching</strong></h4>\r\n");
      out.write("        <h5>Hire smarter, stop spending time with long keyword strings</h5>\r\n");
      out.write("        <p> All the existing sourcing tools offer keyword search interface, which is very cumbersome, requires long strings, does not rank candidates, and importantly, does not understand what you are exactly looking for.\r\n");
      out.write("          We take the pain out of searching, and automatically recommend top candidates. </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-6 info\">\r\n");
      out.write("        <h4><strong>Automation: Hire for 100's of Jobs</strong></h4>\r\n");
      out.write("        <h5>Using Predikt's technology, you can do months of work in a few hours</h5>\r\n");
      out.write("        <p class=\"p100\"> You can post 100's of Jobs on our platform and automatically get candidate recommendations. Scale your teams instantly. We maintain an algorithmically curated pool of developers, engineers, product managers, designers and other talent. </p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"clients\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-12\">\r\n");
      out.write("        <h3>Ready to find your perfecet fitting Job?</h3>\r\n");
      out.write("      <a href=\"index.html\"> Get Started Now </a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\" class=\"no-margin\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-sm-3 copyright\"> © 2016 Predikt Inc </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
