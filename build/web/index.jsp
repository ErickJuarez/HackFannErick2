<%@ page import="java.io.BufferedReader"%>
<%@ page import="java.io.InputStreamReader"%>
<%@ page import="java.net.URLEncoder"%>
<%@ page import="java.net.*"%>
<%@ page import="oauth.signpost.OAuth"%>
<%@ page import="oauth.signpost.OAuthConsumer"%>
<%@ page import="oauth.signpost.OAuthProvider"%>
<%@ page import="oauth.signpost.basic.DefaultOAuthProvider"%>
<%@ page import="oauth.signpost.commonshttp.CommonsHttpOAuthConsumer"%>
<%@ page import="org.apache.http.HttpResponse"%>
<%@ page import="org.apache.http.client.HttpClient"%>
<%@ page import="org.apache.http.client.methods.HttpPost"%>
<%@ page import="org.apache.http.entity.StringEntity"%>
<%@ page import="org.apache.http.impl.client.DefaultHttpClient"%>
<%@page import="Hack.FBConnection"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>LLEVAME</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />

        <link rel="stylesheet" href="assets/css/main.css" />

    </head>
    <body>
        <%

            FBConnection fbConnection = new FBConnection();
            OAuthConsumer consumer = new CommonsHttpOAuthConsumer("CSFhtG66PdTuUHsi86mwv4kDn", "moNMovluQtL8wW03JPXNy1eSSPwcjRIlyUK7OdbGUe1z5wS0tM");
            OAuthProvider provider = new DefaultOAuthProvider(
                    "https://twitter.com/oauth/request_token",
                    "https://twitter.com/oauth/access_token",
                    "https://twitter.com/oauth/authorize");
            String authUrl = provider.retrieveRequestToken(consumer, "http://localhost:8080/Hack/inicio.jsp");
            session.setAttribute("consumer", consumer);
            session.setAttribute("provider", provider);

        %>
        <!-- Header -->
        <section id="header">
            <div class="inner">
                <span class="image"><img src="monito.png" width=550 height=400/></span>

                <h1><a><span style="color:#000000">LLEVAME</span></a></h1>
                <h2>Es una plataforma que se encarga de darte a conocer los rincones de Mexico<h2/>
                    facilitandote la busqueda de hospedaje y transporte</p>
                    <ul class="actions"
                        <section id="one" class="main style1"><li><a href="#one" class="button scrolly">DESCRUBELOS</a></li>
                    </ul>
            </div>
        </section>

        <!-- Three -->
        <section id="three" class="main style1 special">
            <div class="container">
                <h2>Visita México</h2>
                <div class="row 50%">
                    <div class="(small)">
                        <span class="image"><img src="aguasca.jpg"width=250 height=170/></span>
                        <ul class="actions">
                            <a href="#" class="select">Aguascalientes</a> 
                        </ul>
                    </div>
                    <div class="(small)">
                        <span class="image"><img src="BajaNorte.jpg"width=250 height=170/></span>
                        <ul class="actions">
                            <a href="#" class="select">Baja California Norte</a>
                        </ul>
                    </div>
                    <div class="(small)">
                        <span class="image"><img src="BajaSur.jpg"width=250 height=170/></span>
                        <ul class="actions">
                            <li><a href="#" class="select">Baja California Sur</a></li>
                        </ul>
                    </div>
                    <div class="(small)">
                        <span class="image"><img src="Campeche.jpg"width=250 height=170/></span>
                        <ul class="actions">
                            <ul class="actions">
                                <li><a href="#" class="select">Campeche</a></li>
                                </div>
                                
                                </section>

                                <!-- Four -->
                                <section id="four" class="main style2 special">
                                    <div class="container">
                                        <header class="major">
                                            <h2>¿No te has convencido?</h2>
                                        </header>
                                        <p>Prueba nuestra plataforma y compruebalo.</p>
                                        <ul class="actions uniform">
                                            <li><a href="#" class="button special">Sign Up</a></li>
                                            <li><a href="#" class="button">Learn More</a></li>
                                        </ul>
                                    </div>
                                </section>
                                <!-- Footer -->
                                <section id="footer">
                                    <ul class="icons">
                                        <li><a href="<%=authUrl%>" class="icon alt fa-twitter"><span class="label">Twitter</span></a></li>
                                        <li><a href="<%=fbConnection.getFBAuthUrl()%>" class="icon alt fa-facebook"><span class="label">Facebook</span></a></li>
                                        <!--<li><a href="#" class="icon alt fa-instagram"><span class="label">Instagram</span></a></li>
                                        <li><a href="#" class="icon alt fa-github"><span class="label">GitHub</span></a></li>
                                        <li><a href="#" class="icon alt fa-envelope"><span class="label">Email</span></a></li>-->
                                    </ul>
                                    <ul class="copyright">
                                        <li>&copy; Con Amor</li><li>Design: <a href="#">By: Fanna y Erick <3</a></li>
                                    </ul>
                                </section>

                                <!-- Scripts -->
                                <script src="assets/js/jquery.min.js"></script>
                                <script src="assets/js/jquery.scrolly.min.js"></script>
                                <script src="assets/js/skel.min.js"></script>
                                <script src="assets/js/util.js"></script>
                                <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
                                <script src="assets/js/main.js"></script>

                                </body>
                                </html>