package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class izle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                            <section class=\"grid col-three-quarters mq2-col-two-thirds mq3-col-full\">\n");
      out.write("\n");
      out.write("                                <figure class=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <!--  ORTA KISIM ICERIK BASI  -->\n");
      out.write("                                    <section>\n");
      out.write("\n");
      out.write("                                        <article>\n");
      out.write("                                            \n");
      out.write("                                      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            ");

                                               
                                                Class.forName("com.mysql.jdbc.Driver").newInstance();
                                                //   String url = "jdbc:mysql://localhost:3306/yazilimvideoveritabani?user=katerina&password=1453";
             String url = "jdbc:mysql://localhost:3306/yazilimv_ideoveritabani?user=yazilimv_katya&password=14531453";
                                                 Connection conVideoIzle = null;
                                                Statement stmtVideoIzle = null;
                                                ResultSet rstVideoIzle = null;
                                                
                                                
                                                ResultSet rstVideoIzleBirOnceki = null;
                                                Statement stmtVideoIzleBirOnceki = null;
                                                
                                                ResultSet rstVideoIzleBirSonraki = null;
                                                Statement stmtVideoIzleBirSonraki = null;
                                               
                                               
                                                try {
                                                     
                                                    conVideoIzle = DriverManager.getConnection(url);
                                                    
                                             
                                               
                                           
                                                    
                                               
                                               
                                                    
                                                    
                                                    stmtVideoIzle = conVideoIzle.createStatement();
                                                    rstVideoIzle = stmtVideoIzle.executeQuery("SELECT * FROM video WHERE kategoriid ='" + request.getParameter("kategoriid") + "' AND videosirasi ='" + (Integer.parseInt(request.getParameter("videosirasi"))) + "' ORDER BY videosirasi ASC;");
                                         
                                                    
                                                    
                                                    // SON VIDEONUN SAYISINI ALAN SORGU---BASI--- 
                                            Statement    stmtVideoIzle1 = conVideoIzle.createStatement();
                                            ResultSet    rstVideoIzle1 = stmtVideoIzle1.executeQuery("SELECT * FROM video WHERE kategoriid ='" + request.getParameter("kategoriid") + "';");
                                               
                                                  
                                                while (rstVideoIzle1.next()) {
                                                     String id = rstVideoIzle1.getString(1);
                                                  }
                                                                                                              
                                                rstVideoIzle1.last();
                                                int siraVideoIzle = rstVideoIzle1.getRow();
                                              //  out.println("Number of Rows=" + siraVideoIzle);
                                            
                                            // SON VIDEONUN SAYISINI ALAN SORGU---SONU--- 
                                                
                                                
                                                    while (rstVideoIzle.next()) {
                                         
     

                                            
      out.write("\n");
      out.write("\n");
      out.write("                                        <h2>");
      out.print(rstVideoIzle.getString("videoadi"));
      out.write("</h2>\n");
      out.write("                                          \n");
      out.write("   <table>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            \n");
      out.write("              <iframe width=\"515\" height=\"315\"  src=\"//");
      out.print(rstVideoIzle.getString("videogommekodu"));
      out.write("\" frameborder=\"0\" allowfullscreen></iframe> \n");
      out.write("                                       \n");
      out.write("         \n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("            \n");
      out.write("            <table class=\"\">\n");
      out.write("    <tr>\n");
      out.write("        <td><strong>Anlatan</strong> </td>\n");
      out.write("        <td>");
      out.print(rstVideoIzle.getString("videoanlatankisi"));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Video Süresi</td>\n");
      out.write("        <td>");
      out.print(rstVideoIzle.getString("videosuresi"));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Eklenme Zamanı</td>\n");
      out.write("        <td>");
      out.print(rstVideoIzle.getString("videoeklenmetarihvesaati"));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td>Açıklama</td>\n");
      out.write("        <td>");
      out.print(rstVideoIzle.getString("videoaciklamasi"));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("                                        \n");
      out.write("                                           \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                       \n");
      out.write("                                            \n");
      out.write("\n");
      out.write(" <p>  <a href=\"");
      out.print(rstVideoIzle.getString("videoadresi"));
      out.write("\" target=\"_blank\">YouTube'da bu videoyu izlemek için tıklayın</a></p>\n");
      out.write("    \n");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("                                            <p>&nbsp;</p>\n");
      out.write("                                            <p><table width=\"100%\" border=\"0\">\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td align=\"left\">\n");
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                 ");
 if (rstVideoIzle.getInt("videosirasi") == 1) {
      out.write("\n");
      out.write("                                                        \n");
      out.write("                                                        <a href=\"izle.jsp?kategoriid=");
      out.print(rstVideoIzle.getInt("kategoriid"));
      out.write("&videosirasi=");
      out.print(1);
      out.write("\">                     \n");
      out.write("                                                            &Ouml;nceki  Video<br>\n");
      out.write(" ");

int birOnceki = (Integer.parseInt(request.getParameter("videosirasi")) - 1);
stmtVideoIzleBirOnceki = conVideoIzle.createStatement();
rstVideoIzleBirOnceki = stmtVideoIzleBirOnceki.executeQuery("SELECT * FROM video WHERE kategoriid ='" + request.getParameter("kategoriid") + "' AND videosirasi ='" + birOnceki + "'");
while (rstVideoIzleBirOnceki.next()) {
out.print(birOnceki +". "+ rstVideoIzleBirOnceki.getString("videoadi"));
}                                                

      out.write("             \n");
      out.write("                                                        </a>\n");
      out.write("\n");
      out.write("                                                        ");
 } else {
      out.write("\n");
      out.write("\n");
      out.write("                                                        <a href=\"izle.jsp?kategoriid=");
      out.print(rstVideoIzle.getInt("kategoriid"));
      out.write("&videosirasi=");
      out.print(rstVideoIzle.getInt("videosirasi") - 1);
      out.write("\">                     \n");
      out.write("                                                            &Ouml;nceki  Video<br>\n");
      out.write(" ");

int birOnceki = (Integer.parseInt(request.getParameter("videosirasi")) - 1);
stmtVideoIzleBirOnceki = conVideoIzle.createStatement();
rstVideoIzleBirOnceki = stmtVideoIzleBirOnceki.executeQuery("SELECT * FROM video WHERE kategoriid ='" + request.getParameter("kategoriid") + "' AND videosirasi ='" + birOnceki + "'");
while (rstVideoIzleBirOnceki.next()) {
out.print(birOnceki +". "+ rstVideoIzleBirOnceki.getString("videoadi"));                                               
}                                                

      out.write("                                                                                                   \n");
      out.write("                                                        </a>\n");
      out.write("\n");
      out.write("                                                        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                    \n");
      out.write("                                                     \n");
      out.write("                                                \n");
      out.write("                                                    <td>\n");
      out.write("\n");
      out.write(" <p>");
      out.print(request.getParameter("videosirasi") + ". "+ rstVideoIzle.getString("videoadi"));
      out.write(' ');
      out.write('(');
      out.print(rstVideoIzle.getInt("videosirasi"));
      out.write('/');
      out.write(' ');
      out.print(siraVideoIzle);
      out.write(")</p> \n");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td align=\"right\">\n");
      out.write("\n");
      out.write("                                                        <a href=\"izle.jsp?kategoriid=");
      out.print(rstVideoIzle.getInt("kategoriid"));
      out.write("&videosirasi=");
      out.print(rstVideoIzle.getInt(4) + 1);
      out.write("\">\n");
      out.write("                                                            Sonraki Video<br>\n");
      out.write("  ");

int birSonraki = (Integer.parseInt(request.getParameter("videosirasi")) + 1);
stmtVideoIzleBirSonraki = conVideoIzle.createStatement();
rstVideoIzleBirSonraki = stmtVideoIzleBirOnceki.executeQuery("SELECT * FROM video WHERE kategoriid ='" + request.getParameter("kategoriid") + "' AND videosirasi ='" + birSonraki + "'");
while (rstVideoIzleBirSonraki.next()) {
out.print(birSonraki +". "+ rstVideoIzleBirSonraki.getString("videoadi"));
}                                                

      out.write("                                                              \n");
      out.write("                                                        \n");
      out.write("                                                        \n");
      out.write("                                                        \n");
      out.write("                                                        \n");
      out.write("                                                        </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </table>\n");
      out.write("                                            <br></br> \n");
      out.write("\n");
      out.write("                                            ");

                                                       

                                                    }
                                                    



                                                } catch (Exception e) {
                                                    System.out.println(e.getMessage());
                                                }finally {
                                                        try {
                                                  rstVideoIzle.close();
                                                    stmtVideoIzle.close();
                                                    conVideoIzle.close();
                                                    } catch (SQLException e) {}
                                                   }
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </article>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div><!-- #content-->\n");
      out.write("                                      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </figure>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </section>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div> <!--main-->\n");
      out.write("\n");
      out.write("                        <footer class=\"center part clearfix\">\n");
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
