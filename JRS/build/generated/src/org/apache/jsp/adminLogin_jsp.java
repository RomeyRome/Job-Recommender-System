package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.predikt.co/request-demo.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 31 Mar 2016 06:08:44 GMT -->\n");
      out.write("<!-- Added by HTTrack --><meta http-equiv=\"content-type\" content=\"text/html;charset=utf-8\" /><!-- /Added by HTTrack -->\n");
      out.write("<head>\n");
      out.write("  <script>\n");
      out.write("    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("    (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("    m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("    })(window,document,'script','../www.google-analytics.com/analytics.js','ga');\n");
      out.write("\n");
      out.write("    ga('create', 'UA-41946666-4', 'auto');\n");
      out.write("    ga('send', 'pageview');\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("\t<meta charset=\"UTF-8\" />\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\t\n");
      out.write("\t<title>Predikt: Predictive Candidate Sourcing Software</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\t<meta property=\"og:type\" content=\"article\" />\n");
      out.write("\t<meta property=\"og:title\" content=\"Predictive Candidate Sourcing Software. Instantly Find and recruit top talent.\" />\n");
      out.write("\t<meta property=\"og:description\" content=\"Predikt instantly recommends top talent similar to your best hires.\" />\n");
      out.write("\t<meta property=\"og:url\" content=\"https://www.predikt.co/\" />\n");
      out.write("\t<meta property=\"og:site_name\" content=\"Predikt\" />\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n");
      out.write("\t<!-- stylesheets -->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/compiled/theme.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/animate.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/flexslider.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/vendor/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- javascript -->\n");
      out.write("\t<script src=\"../ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/theme.js\"></script>\n");
      out.write("\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("        <script>\n");
      out.write("   function submitClick(){   \n");
      out.write("          \n");
      out.write("           document.location.href = \"http://localhost:8080/JRS_0.3/loginAdmin?adminName=\"\n");
      out.write("                   + document.getElementById(\"txtUsername\").value \n");
      out.write("                   + \"&adminPass=\" \n");
      out.write("                   +  document.getElementById(\"txtPassword\").value; \n");
      out.write("   }\n");
      out.write("        </script>\n");
      out.write("                    \n");
      out.write("</head>\n");
      out.write("<body id=\"home\">\n");
      out.write("\t<header class=\"navbar navbar-inverse normal\" role=\"banner\">\n");
      out.write("  \t\t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"navbar-header\">\n");
      out.write("      \t\t\t<a href=\"index.html\" class=\"navbar-brand\"><img src=\"images/logo.png\" /></a>\n");
      out.write("    \t\t</div>\n");
      out.write("  \t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<div id=\"features\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row feature\">\n");
      out.write("\t\t\t\t<div class=\"col-md-7 info\">\n");
      out.write("\t\t\t\t\t<form role=\"form\" id=\"FormSubmit\">\n");
      out.write("\t\t\t\t\t\t<h4>Admin Login</h4>\n");
      out.write("                        <br>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t    \t\t<label for=\"name\">User Name<span>(required)</span></label>\n");
      out.write("\t\t\t\t    \t\t<input type=\"text\" class=\"form-control\" id=\"txtUsername\" required />\n");
      out.write("\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t  \t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t    \t\t<label for=\"email\">Password <span>(required)</span></label>\n");
      out.write("\t\t\t\t    \t\t<input type=\"email\" class=\"form-control\" id=\"txtPassword\" required />\n");
      out.write("\t\t\t\t  \t\t</div> \n");
      out.write("\t\t\t\t  \t\t<div class=\"submit\">\n");
      out.write("\t\t\t\t  \t\t\t<button class=\"button share-show\" onclick=\"submitClick()\">\n");
      out.write("\t\t\t\t\t  \t\t\t<span>Login to the Admin Panel</span>\n");
      out.write("\t\t\t\t\t  \t\t</button>\n");
      out.write("\t\t\t\t  \t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("                    <br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-offset-1 col-md-4 info form\">\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-3 copyright\">\n");
      out.write("\t\t\t\t\t© 2016 Predikt Inc.\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("            /* Demo code for show / hide share option */\n");
      out.write("            $('#FormSubmit').submit(function(e) {\n");
      out.write("                var forScreening = $(\"#forsceening\").is(\":checked\");\n");
      out.write("                var forSourcing = $(\"#forsourcing\").is(\":checked\");\n");
      out.write("                var postData = {\"name\": $(\"#name\").val(), \"email\": $(\"#email\").val(),\n");
      out.write("                                \"phone\": $(\"#phone\").val(),\n");
      out.write("                                \"forscreening\": forScreening, \"forsourcing\": forSourcing,\n");
      out.write("                                \"atsone\": $(\"#atsone\").val(), \"comments\": $(\"#comments\").val()}\n");
      out.write("                $.post( \"/demo-request\", postData, function( data ) {\n");
      out.write("                    $('.info.form').addClass('hide');\n");
      out.write("                    $('.info.share').removeClass('hide').addClass('animated fadeInDown');\n");
      out.write("                }).fail(function() { alert(\"error\"); }); \n");
      out.write("\n");
      out.write("                e.preventDefault();\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- Mirrored from www.predikt.co/request-demo.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 31 Mar 2016 06:08:49 GMT -->\n");
      out.write("</html>\n");
      out.write("\n");
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
