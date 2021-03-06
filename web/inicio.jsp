<%-- 
    Document   : inicio
    Created on : 4/10/2015, 02:52:45 AM
    Author     : erick
--%>
<%@page import="Hack.MainMenu"%>
<%@page import="java.util.Map"%>
<%@page import="Hack.FBGraph"%>
<%@page import="Hack.FBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Identity by HTML5 UP</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="assets2/css/main.css" />
        <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <noscript><link rel="stylesheet" href="assets2/css/noscript.css" /></noscript>
    </head>
    <body class="is-loading">
        <%
            String code;
            code = request.getParameter("code");
            if (code == null || code.equals("")) {
                throw new RuntimeException(
                        "ERROR: Didn't get code parameter in callback.");
            }
            FBConnection fbConnection = new FBConnection();
            String accessToken = fbConnection.getAccessToken(code);

            FBGraph fbGraph = new FBGraph(accessToken);
            String graph = fbGraph.getFBGraph();
            Map<String, String> fbProfileData = fbGraph.getGraphData(graph);
            //out.println("<h1>HoLa</h1>");
            //out.println("<h2>Perfil</h2>");
            //out.println("<div>Welcome: " + fbProfileData.get("name"));
            //out.println("<div>Your Email: " + fbProfileData.get("email"));
            //out.println("<div>You are: " + fbProfileData.get("gender"));
        %>
        <!-- Wrapper -->
        <div id="wrapper">

            <!-- Main -->
            <section id="main">
                <header>
                    <span class="avatar"><img src="images/avatar.jpg" alt="" /></span>
                    <h1><%=fbProfileData.get("name")%></h1>
                    <a href="Estados.jsp" class="button special">Buscar</a>
                </header>

            </section>

            <!-- Footer -->
            <footer id="footer">
                <ul class="copyright">
                    <li>&copy; Con Amor</li>
                    <li>Design: <a href="#">By: Fanna y Erick <3</a></li>
                </ul>
            </footer>

        </div>
    </body>
</html>

        <!-- Scripts -->
        <!--[if lte IE 8]><script src="assets/js/respond.min.js"></script><![endif]-->
        <script>
            if ('addEventListener' in window) {
                window.addEventListener('load', function () {
                    document.body.className = document.body.className.replace(/\bis-loading\b/, '');
                });
                document.body.className += (navigator.userAgent.match(/(MSIE|rv:11\.0)/) ? ' is-ie' : '');
            }
        </script>

    </body>
</html>