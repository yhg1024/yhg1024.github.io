/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.81
 * Generated at: 2023-11-28 01:39:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.my_005fpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("	<head>\n");
      out.write("		<meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content />\n");
      out.write("        <meta name=\"author\" content />\n");
      out.write("        <title>양형경 page</title>\n");
      out.write("        <!-- Favicon-->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("        <!-- Custom Google font-->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@100;200;300;400;500;600;700;800;900&amp;display=swap\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Bootstrap icons-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Core theme CSS (includes Bootstrap)-->\n");
      out.write("        <link href=\"../css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"d-flex flex-column\">\n");
      out.write("        <main class=\"flex-shrink-0\">\n");
      out.write("            <!-- Navigation-->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-white py-3\">\n");
      out.write("                <div class=\"container px-5\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\"><span class=\"fw-bolder text-primary\">취직하고 싶다</span></a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0 small fw-bolder\">\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"index.html\">Home</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"resume.html\">Resume</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"projects.html\">Projects</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"contact.html\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!-- Page content-->\n");
      out.write("            <section class=\"py-5\">\n");
      out.write("                <div class=\"container px-5\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    <!-- Contact form-->\n");
      out.write("                    <div class=\"bg-light rounded-4 py-5 px-4 px-md-5\">\n");
      out.write("                        <div class=\"text-center mb-5\">\n");
      out.write("                            <div class=\"feature bg-primary bg-gradient-primary-to-secondary text-white rounded-3 mb-3\"><i class=\"bi bi-envelope\"></i></div>\n");
      out.write("                            <h1 class=\"fw-bolder\">Get in touch</h1>\n");
      out.write("                            <p class=\"lead fw-normal text-muted mb-0\">Let's work together!</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row gx-5 justify-content-center\">\n");
      out.write("                            <div class=\"col-lg-8 col-xl-6\">\n");
      out.write("                                <!-- * * * * * * * * * * * * * * *-->\n");
      out.write("                                <!-- * * SB Forms Contact Form * *-->\n");
      out.write("                                <!-- * * * * * * * * * * * * * * *-->\n");
      out.write("                                <!-- This form is pre-integrated with SB Forms.-->\n");
      out.write("                                <!-- To make this form functional, sign up at-->\n");
      out.write("                                <!-- https://startbootstrap.com/solution/contact-forms-->\n");
      out.write("                                <!-- to get an API token!-->\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <form action=\"/contact\" name=\"contactForm\" method=\"post\" enctype=\"multipart/form-data\" id=\"contactForm\" data-sb-form-api-token=\"API_TOKEN\">\n");
      out.write("                                    <!-- Name input-->\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input class=\"form-control\" id=\"name\" type=\"text\" placeholder=\"Enter your name...\" data-sb-validations=\"required\" />\n");
      out.write("                                        <label for=\"name\">Full name</label>\n");
      out.write("                                        <div class=\"invalid-feedback\" data-sb-feedback=\"name:required\">A name is required.</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Email address input-->\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input class=\"form-control\" id=\"email\" type=\"email\" placeholder=\"name@example.com\" data-sb-validations=\"required,email\" />\n");
      out.write("                                        <label for=\"email\">Email address</label>\n");
      out.write("                                        <div class=\"invalid-feedback\" data-sb-feedback=\"email:required\">An email is required.</div>\n");
      out.write("                                        <div class=\"invalid-feedback\" data-sb-feedback=\"email:email\">Email is not valid.</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Phone number input-->\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input class=\"form-control\" id=\"phone\" type=\"tel\" placeholder=\"(123) 456-7890\" data-sb-validations=\"required\" />\n");
      out.write("                                        <label for=\"phone\">Phone number</label>\n");
      out.write("                                        <div class=\"invalid-feedback\" data-sb-feedback=\"phone:required\">A phone number is required.</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- file input-->\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <input name=\"file\" class=\"form-control\" id=\"file\" type=\"file\" data-sb-validations=\"required\" />\n");
      out.write("                                        <label for=\"phone\">file</label>\n");
      out.write("                                        <div class=\"invalid-feedback\" data-sb-feedback=\"file:required\">A file is required.</div>\n");
      out.write("                                    <!-- Message input-->\n");
      out.write("                                    <div class=\"form-floating mb-3\">\n");
      out.write("                                        <textarea class=\"form-control\" id=\"message\" type=\"text\" placeholder=\"Enter your message here...\" style=\"height: 10rem\" data-sb-validations=\"required\"></textarea>\n");
      out.write("                                        <label for=\"message\">Message</label>\n");
      out.write("                                        <div class=\"invalid-feedback\" data-sb-feedback=\"message:required\">A message is required.</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <!-- Submit success message-->\n");
      out.write("                                    <!---->\n");
      out.write("                                    <!-- This is what your users will see when the form-->\n");
      out.write("                                    <!-- has successfully submitted-->\n");
      out.write("                                    <div class=\"d-none\" id=\"submitSuccessMessage\">\n");
      out.write("                                        <div class=\"text-center mb-3\">\n");
      out.write("                                            <div class=\"fw-bolder\">Form submission successful!</div>\n");
      out.write("                                            To activate this form, sign up at\n");
      out.write("                                            <br />\n");
      out.write("                                            <a href=\"https://startbootstrap.com/solution/contact-forms\">https://startbootstrap.com/solution/contact-forms</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- Submit error message-->\n");
      out.write("                                    <!---->\n");
      out.write("                                    <!-- This is what your users will see when there is-->\n");
      out.write("                                    <!-- an error submitting the form-->\n");
      out.write("                                    <div class=\"d-none\" id=\"submitErrorMessage\"><div class=\"text-center text-danger mb-3\">Error sending message!</div></div>\n");
      out.write("                                    <!-- Submit Button-->\n");
      out.write("                                    <div class=\"d-grid\"><button class=\"btn btn-primary btn-lg disabled\" id=\"submitButton\" type=\"submit\">Submit</button></div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"bg-white py-4 mt-auto\">\n");
      out.write("            <div class=\"container px-5\">\n");
      out.write("                <div class=\"row align-items-center justify-content-between flex-column flex-sm-row\">\n");
      out.write("                    <div class=\"col-auto\"><div class=\"small m-0\">Copyright &copy; Your Website 2023</div></div>\n");
      out.write("                    <div class=\"col-auto\">\n");
      out.write("                        <a class=\"small\" href=\"#!\">Privacy</a>\n");
      out.write("                        <span class=\"mx-1\">&middot;</span>\n");
      out.write("                        <a class=\"small\" href=\"#!\">Terms</a>\n");
      out.write("                        <span class=\"mx-1\">&middot;</span>\n");
      out.write("                        <a class=\"small\" href=\"#!\">Contact</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- Bootstrap core JS-->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <!-- Core theme JS-->\n");
      out.write("        <script src=\"../js/scripts.js\"></script>\n");
      out.write("        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\n");
      out.write("        <!-- * *                               SB Forms JS                               * *-->\n");
      out.write("        <!-- * * Activate your form at https://startbootstrap.com/solution/contact-forms * *-->\n");
      out.write("        <!-- * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *-->\n");
      out.write("        <script src=\"https://cdn.startbootstrap.com/sb-forms-latest.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
