package org.apache.jsp.WEB_002dINF.tiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-xs-12 col-sm-4 col-md-5 col-lg-5 up-1\">\r\n");
      out.write("                <p><a>技能树-改变你我</a></p>\r\n");
      out.write("                <p><a href=\"#\">关于我们 </a>|<a href=\"#\"> 联系我们 </a>|<a href=\"#\"> 合作企业 </a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-12 col-sm-4 col-md-5 col-lg-5 up-2\">\r\n");
      out.write("                <p>旗下网站</p>\r\n");
      out.write("                <ul class=\"list-inline\">\r\n");
      out.write("                    <li><a href=\"#\">草船云孵化器</a></li>\r\n");
      out.write("                    <li><a href=\"#\">最强IT特训营</a><br></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"list-inline\">\r\n");
      out.write("                    <li><a href=\"#\">葡萄藤轻游戏</a></li>\r\n");
      out.write("                    <li><a href=\"#\">桌游精灵</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-12 col-sm-4 col-md-2 col-lg-2 up-3\">\r\n");
      out.write("                <p>微信公众平台</p>\r\n");
      out.write("                <img alt=\"\" src=\"imges/2524.jpg\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container-fluid text-center\">\r\n");
      out.write("        <p>Copyright &copy; 2015 北京葡萄藤信息技术有限公司 All Rights Reserved | 京ICP备15035574号-1</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
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
