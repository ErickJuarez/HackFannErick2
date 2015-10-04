package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.net.*;
import oauth.signpost.OAuth;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML>\n");
      out.write("<!--\n");
      out.write("        Photon by HTML5 UP\n");
      out.write("        html5up.net | @n33co\n");
      out.write("        Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Photon by HTML5 UP</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <!--[if lte IE 8]><script src=\"assets/js/ie/html5shiv.js\"></script><![endif]-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\" />\n");
      out.write("        <!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie8.css\" /><![endif]-->\n");
      out.write("        <!--[if lte IE 9]><link rel=\"stylesheet\" href=\"assets/css/ie9.css\" /><![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            OAuthConsumer consumer = new CommonsHttpOAuthConsumer("CSFhtG66PdTuUHsi86mwv4kDn", "moNMovluQtL8wW03JPXNy1eSSPwcjRIlyUK7OdbGUe1z5wS0tM");

            OAuthProvider provider = new DefaultOAuthProvider(
                    "https://twitter.com/oauth/request_token",
                    "https://twitter.com/oauth/access_token",
                    "https://twitter.com/oauth/authorize");

// Set your callback URL here
            String authUrl = provider.retrieveRequestToken(consumer, "http://localhost:8080/Hack/inicio.jsp");

            session.setAttribute("consumer", consumer);
            session.setAttribute("provider", provider);

            out.println("<a href='" + authUrl + "'>Connect</a>");

        
      out.write("\n");
      out.write("        <!-- Header -->\n");
      out.write("        <section id=\"header\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <span class=\"icon major fa-cloud\"></span>\n");
      out.write("                <h1>Hi, I'm <strong>Photon</strong>, another fine<br />\n");
      out.write("                    little freebie from <a href=\"http://html5up.net\">HTML5 UP</a>.</h1>\n");
      out.write("                <p>Accumsan feugiat mi commodo erat lorem ipsum, sed magna<br />\n");
      out.write("                    lobortis feugiat sapien sed etiam volutpat accumsan.</p>\n");
      out.write("                <ul class=\"actions\">\n");
      out.write("                    <li><a href=\"#one\" class=\"button scrolly\">Discover</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- One -->\n");
      out.write("        <section id=\"one\" class=\"main style1\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row 150%\">\n");
      out.write("                    <div class=\"6u 12u$(medium)\">\n");
      out.write("                        <header class=\"major\">\n");
      out.write("                            <h2>Lorem ipsum dolor adipiscing<br />\n");
      out.write("                                amet dolor consequat</h2>\n");
      out.write("                        </header>\n");
      out.write("                        <p>Adipiscing a commodo ante nunc accumsan et interdum mi ante adipiscing. A nunc lobortis non nisl amet vis sed volutpat aclacus nascetur ac non. Lorem curae et ante amet sapien sed tempus adipiscing id accumsan.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"6u$ 12u$(medium) important(medium)\">\n");
      out.write("                        <span class=\"image fit\"><img src=\"images/pic01.jpg\" alt=\"\" /></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Two -->\n");
      out.write("        <section id=\"two\" class=\"main style2\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row 150%\">\n");
      out.write("                    <div class=\"6u 12u$(medium)\">\n");
      out.write("                        <ul class=\"major-icons\">\n");
      out.write("                            <li><span class=\"icon style1 major fa-code\"></span></li>\n");
      out.write("                            <li><span class=\"icon style2 major fa-bolt\"></span></li>\n");
      out.write("                            <li><span class=\"icon style3 major fa-camera-retro\"></span></li>\n");
      out.write("                            <li><span class=\"icon style4 major fa-cog\"></span></li>\n");
      out.write("                            <li><span class=\"icon style5 major fa-desktop\"></span></li>\n");
      out.write("                            <li><span class=\"icon style6 major fa-calendar\"></span></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"6u$ 12u$(medium)\">\n");
      out.write("                        <header class=\"major\">\n");
      out.write("                            <h2>Lorem ipsum dolor adipiscing<br />\n");
      out.write("                                amet dolor consequat</h2>\n");
      out.write("                        </header>\n");
      out.write("                        <p>Adipiscing a commodo ante nunc accumsan interdum mi ante adipiscing. A nunc lobortis non nisl amet vis volutpat aclacus nascetur ac non. Lorem curae eu ante amet sapien in tempus ac. Adipiscing id accumsan adipiscing ipsum.</p>\n");
      out.write("                        <p>Blandit faucibus proin. Ac aliquam integer adipiscing enim non praesent vis commodo nunc phasellus cubilia ac risus accumsan. Accumsan blandit. Lobortis phasellus non lobortis dit varius mi varius accumsan lobortis. Blandit ante aliquam lacinia lorem lobortis semper morbi col faucibus vitae integer placerat accumsan orci eu mi odio tempus adipiscing adipiscing adipiscing curae consequat feugiat etiam dolore.</p>\n");
      out.write("                        <p>Adipiscing a commodo ante nunc accumsan interdum mi ante adipiscing. A nunc lobortis non nisl amet vis volutpat aclacus nascetur ac non. Lorem curae eu ante amet sapien in tempus ac. Adipiscing id accumsan adipiscing ipsum.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Three -->\n");
      out.write("        <section id=\"three\" class=\"main style1 special\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <header class=\"major\">\n");
      out.write("                    <h2>Adipiscing amet consequat</h2>\n");
      out.write("                </header>\n");
      out.write("                <p>Ante nunc accumsan et aclacus nascetur ac ante amet sapien sed.</p>\n");
      out.write("                <div class=\"row 150%\">\n");
      out.write("                    <div class=\"4u 12u$(medium)\">\n");
      out.write("                        <span class=\"image fit\"><img src=\"images/pic02.jpg\" alt=\"\" /></span>\n");
      out.write("                        <h3>Magna feugiat lorem</h3>\n");
      out.write("                        <p>Adipiscing a commodo ante nunc magna lorem et interdum mi ante nunc lobortis non amet vis sed volutpat et nascetur.</p>\n");
      out.write("                        <ul class=\"actions\">\n");
      out.write("                            <li><a href=\"#\" class=\"button\">More</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"4u 12u$(medium)\">\n");
      out.write("                        <span class=\"image fit\"><img src=\"images/pic03.jpg\" alt=\"\" /></span>\n");
      out.write("                        <h3>Magna feugiat lorem</h3>\n");
      out.write("                        <p>Adipiscing a commodo ante nunc magna lorem et interdum mi ante nunc lobortis non amet vis sed volutpat et nascetur.</p>\n");
      out.write("                        <ul class=\"actions\">\n");
      out.write("                            <li><a href=\"#\" class=\"button\">More</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"4u$ 12u$(medium)\">\n");
      out.write("                        <span class=\"image fit\"><img src=\"images/pic04.jpg\" alt=\"\" /></span>\n");
      out.write("                        <h3>Magna feugiat lorem</h3>\n");
      out.write("                        <p>Adipiscing a commodo ante nunc magna lorem et interdum mi ante nunc lobortis non amet vis sed volutpat et nascetur.</p>\n");
      out.write("                        <ul class=\"actions\">\n");
      out.write("                            <li><a href=\"#\" class=\"button\">More</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Four -->\n");
      out.write("        <section id=\"four\" class=\"main style2 special\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <header class=\"major\">\n");
      out.write("                    <h2>Ipsum feugiat consequat?</h2>\n");
      out.write("                </header>\n");
      out.write("                <p>Sed lacus nascetur ac ante amet sapien.</p>\n");
      out.write("                <ul class=\"actions uniform\">\n");
      out.write("                    <li><a href=\"Sign.html\" class=\"button special\">Sign Up</a></li>\n");
      out.write("                    <li><a href=\"Muestra.html\" class=\"button\">Demo</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <section id=\"footer\">\n");
      out.write("            <ul class=\"icons\">\n");
      out.write("                <li><a href=\"#\" class=\"icon alt fa-twitter\"><span class=\"label\">Twitter</span></a></li>\n");
      out.write("                <li><a href=\"#\" class=\"icon alt fa-facebook\"><span class=\"label\">Facebook</span></a></li>\n");
      out.write("                <li><a href=\"#\" class=\"icon alt fa-instagram\"><span class=\"label\">Instagram</span></a></li>\n");
      out.write("                <li><a href=\"#\" class=\"icon alt fa-github\"><span class=\"label\">GitHub</span></a></li>\n");
      out.write("                <li><a href=\"#\" class=\"icon alt fa-envelope\"><span class=\"label\">Email</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"copyright\">\n");
      out.write("                <li>&copy; Untitled</li><li>Design: <a href=\"http://html5up.net\">HTML5 UP</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Scripts -->\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.scrolly.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/skel.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/util.js\"></script>\n");
      out.write("        <!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
