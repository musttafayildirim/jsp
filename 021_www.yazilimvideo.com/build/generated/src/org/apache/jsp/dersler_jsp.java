package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class dersler_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			"hata.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"tr\">\n");
      out.write("    <head>\n");
      out.write("    <title>Yazılım Video</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"Yazılım Video, JSP - HTML5 - CSS3 - MySQL\">\n");
      out.write("        <meta name=\"author\" content=\"Mimar Aslan, Computer Engineer, mimaraslan.com\">\n");
      out.write("\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"favicon.ico\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"favicon.png\">\n");
      out.write("\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        <header class=\"center clearfix\" id=\"navtop\"> \n");
      out.write("            <a href=\"index.jsp\" class=\"logo fleft\"><img src=\"img/logo.png\" alt=\"\" /></a>\n");
      out.write("            <nav class=\"fright\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\" class=\"navactive\">Anasayfa</a></li>\n");
      out.write("                    <li><a href=\"hakkimizda.jsp\">Hakkımızda</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"dersler.jsp\">Videolar</a></li>\n");
      out.write("                    <li><a href=\"http://www.youtube.com/user/yazilimvideo\">VLog</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"rehberlik.jsp\">Rehberlik</a></li>\n");
      out.write("                    <li><a href=\"sss.jsp\">S.S.S</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("    <div class=\"main center\">\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("<!--\n");
      out.write("\t\t<aside class=\"grid col-one-quarter mq2-col-full\">\n");
      out.write("\t\t\t<p class=\"mbottom\">Keep the same size ratio for thumbnails to avoid breaking the grid because of the margin-bottom.</p>\n");
      out.write("\t\t\t<menu>\n");
      out.write("\t\t\t\t<a  id=\"work_all\" class=\"arrow buttonactive\">All</a><br>\n");
      out.write("\t\t\t\t<a  id=\"work_1\" class=\"arrow\">Web design</a><br>\n");
      out.write("\t\t\t\t<a  id=\"work_2\" class=\"arrow\">Web development</a><br>\n");
      out.write("\t\t\t\t<a  id=\"work_3\" class=\"arrow\">Graphic design</a>\n");
      out.write("\t\t\t</menu>\n");
      out.write("\t\t</aside>\n");
      out.write("        -->\n");
      out.write("\t\t\n");
      out.write("       \n");
      out.write("            \n");
      out.write("\t\t<section class=\"grid col-three-quarters mq2-col-full\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t<div class=\"grid-wrap works\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("       <section class=\"part clearfix\">\n");
      out.write("            <header class=\"title clearfix\">\n");
      out.write("                <p class=\"fleft\">Dersler</p>\n");
      out.write("                <a href=\"dersler.html\" class=\"arrow more fright\">tamamını gör</a> \n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            ");

               Class.forName("com.mysql.jdbc.Driver").newInstance();

               //    String url = "jdbc:mysql://localhost:3306/yazilimvideoveritabani?user=katerina&password=1453";
             String url = "jdbc:mysql://localhost:3306/yazilimv_ideoveritabani?user=yazilimv_katya&password=14531453";
                  Connection conDilTeknoloji = null;
                ResultSet rsDilTeknoloji = null;
                Statement stmtDilTeknoloji = null;

                try {

                  

                    conDilTeknoloji = DriverManager.getConnection(url);
                    stmtDilTeknoloji = conDilTeknoloji.createStatement();
                    rsDilTeknoloji = stmtDilTeknoloji.executeQuery("SELECT * FROM kategori "
                            + "WHERE kategorivitrindegosterim = 1 OR  kategorivitrindegosterim = 0  "
                            + "ORDER BY kategoriadi ASC");

                    while (rsDilTeknoloji.next()) {


            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <figure class=\"work\"> <a href=\"liste.jsp?kategoriid=");
      out.print(rsDilTeknoloji.getInt(1));
      out.write("&kategoriadi=");
      out.print(rsDilTeknoloji.getString(4));
      out.write("&kategoriresimadi=");
      out.print(rsDilTeknoloji.getString(5));
      out.write("\"> \n");
      out.write("                    <img src=\"img/");
      out.print(rsDilTeknoloji.getString(5));
      out.write("\" alt=\"");
      out.print(rsDilTeknoloji.getString(4));
      out.write("\"> <span class=\"zoom\"></span>\n");
      out.write("                </a>\n");
      out.write("                <figcaption> <a href=\"liste.jsp?kategoriid=");
      out.print(rsDilTeknoloji.getInt(1));
      out.write("&kategoriadi=");
      out.print(rsDilTeknoloji.getString(4));
      out.write("&kategoriresimadi=");
      out.print(rsDilTeknoloji.getString(5));
      out.write("\" class=\"arrow\">");
      out.print(rsDilTeknoloji.getString(4));
      out.write("</a>\n");
      out.write("                    <!--  <p></p> -->\n");
      out.write("                </figcaption>\n");
      out.write("            </figure>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");


                     
                    }

                    conDilTeknoloji.close();
                    rsDilTeknoloji.close();
                    stmtDilTeknoloji.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


            
      out.write("\n");
      out.write("\n");
      out.write("              </section>\n");
      out.write("            \n");
      out.write("            </div> <!-- grid inside 3/4-->\n");
      out.write("\t\t\n");
      out.write("\t</section>\t\n");
      out.write("    </div> <!--main-->\n");
      out.write("\n");
      out.write("    \n");
      out.write("  <footer class=\"center part clearfix\">\n");
      out.write("        <ul class=\"social column3 mright\">\n");
      out.write("            <li><a href=\"#\">RSS</a></li>\n");
      out.write("            <li><a href=\"https://www.facebook.com/yazilimvideo?fref=ts\">Facebook</a></li>\n");
      out.write("            <li><a href=\"https://twitter.com/yazilimvideo\">Twitter</a></li>\n");
      out.write("            <li><a href=\"https://plus.google.com/111146263507625687917/posts\">Google+</a></li>\n");
      out.write("            <li><a href=\"#\">Flickr</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"up column3 mright\"> <a href=\"#navtop\" class=\"ir\">Go up</a> </div>\n");
      out.write("        <nav class=\"column3\">\n");
      out.write("            <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Anasayfa</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">Hakkımızda</a></li>\n");
      out.write("                    <li><a href=\"dersler.jsp\">Videolar</a></li>\n");
      out.write("                    <li><a href=\"http://www.youtube.com/user/yazilimvideo\">VLog</a></li>\n");
      out.write("                    <li><a href=\"rehberlik.jsp\">Rehberlik</a></li>\n");
      out.write("                    <li><a href=\"sss.jsp\">S.S.S</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"js/jquery-1.5.1.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"js/slides.min.jquery.js\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("    <!--[if (gte IE 6)&(lte IE 8)]>\n");
      out.write("    <script src=\"js/selectivizr.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</body>\n");
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
