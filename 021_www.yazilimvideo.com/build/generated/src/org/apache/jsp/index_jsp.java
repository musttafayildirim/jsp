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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Yazılım Video</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"print.css\" media=\"print\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h1 id=\"sitename\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Yazılım Video</a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h1 id=\"\">\r\n");
      out.write("\t\t\t\t\t<!-- \r\n");
      out.write("\t\t\t\t\t<a href=\"#\"> <img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"images/adsense_185666_adformat-display_728x90_en.jpg\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"aligncenter\" />\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t-->\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t \t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp\">ANASAYFA</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"hakkimizda.jsp\">HAKKIMIZDA</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"dersler.jsp\">VİDEOLAR & DERSLER</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"http://www.youtube.com/user/yazilimvideo\">YOUTUBE VLOG</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"yazilimrehberi.jsp\">YAZILIM REHBERİ</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"forum.jsp\">SORU - CEVAP & FORUM</a></li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--  \r\n");
      out.write("\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t   <img src=\"images/adsense_185679_adformat-link_468x15_tr.png\" alt=\"\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"aligncenter\" /></a>\r\n");
      out.write("\t\t\t\t\t-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</header>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--  ORTA KISIM ICERIK BASI  -->\r\n");
      out.write("\t\t\t<section>\r\n");
      out.write("\t\t\t\t<f:subview id=\"ortakisimicerik\">\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ortakisimicerik.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ortakisimsol.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "ortakisimsag.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</f:subview>\r\n");
      out.write("\t\t\t\t<!--  ORTA KISIM SAG  SONU  -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- #wrapper -->\r\n");
      out.write("\t\t\t<div id=\"wrapper\">\r\n");
      out.write("\t\t\t\t<!--  SON KISIM BASI  -->\r\n");
      out.write("\t\t\t\t<f:subview id=\"sonkisim\">\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sonkisim.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</f:subview>\r\n");
      out.write("\t\t\t\t<!--  SON KISIM SONU  -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
