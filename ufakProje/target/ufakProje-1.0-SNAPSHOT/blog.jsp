<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page errorPage="hata.jsp" %>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Designa Studio | Blog</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" >
<link rel="stylesheet" href="css/style_blog.css" >
<!--[if lt IE 9]><script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
<header class="center clearfix" id="navtop"> <a href="index.jsp" class="logo fleft"><img src="img/logo.png" alt="" /></a>
  <nav class="fright">
    <ul>
      <li><a href="index.jsp">Home</a></li>
      <li><a href="about.jsp">About</a></li>
    </ul>
    <ul>
      <li><a href="works.jsp">Works</a></li>
      <li><a href="services.jsp">Services</a></li>
    </ul>
    <ul>
      <li><a href="blog.jsp" class="navactive">Blog</a></li>
      <li><a href="contact.jsp">Contact</a></li>
    </ul>
  </nav>
</header>
<div class=" center blog part clearfix">
  <header class="title">
    <p class="fleft">Blog</p>
  </header>
  <section class="columnthird content mright">
    <article class="post">
      <h2><a href="#" class="post-title">Blog post</a></h2>
      <div class="meta">
        <p>Posted on <span class="time">November 15, 2011</span> by <a href="#" class="fn">Sylvain Lafitte</a> in <a href="#"class="cat">Other</a> with <a href="#" class="comments-link">42 comments</a>.</p>
      </div>
      <div class="entry">
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi commodo, ipsum sed pharetra gravida, orci magna rhoncus neque, id pulvinar odio lorem non turpis. Nullam sit amet enim. Suspendisse id velit vitae ligula volutpat condimentum. Aliquam erat volutpat. Sed quis velit. Nulla facilisi. Nulla libero. Vivamus pharetra posuere sapien. Nam consectetuer. Sed aliquam, nunc eget euismod ullamcorper, lectus nunc ullamcorper orci, fermentum bibendum enim nibh eget ipsum. Donec porttitor ligula eu dolor. Maecenas vitae nulla consequat libero cursus venenatis. Nam magna enim, accumsan eu, blandit sed, blandit a, eros.</p>
      </div>
      <footer> <a href="#" class="more-link">Continue reading…</a> </footer>
    </article>
    <article class="post">
      <h2><a href="#" class="post-title">Blog post</a></h2>
      <div class="meta">
        <p>Posted on <span class="time">November 15, 2011</span> by <a href="#" class="fn">Sylvain Lafitte</a> in <a href="#"class="cat">Other</a> with <a href="#" class="comments-link">42 comments</a>.</p>
      </div>
      <div class="entry">
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi commodo, ipsum sed pharetra gravida, orci magna rhoncus neque, id pulvinar odio lorem non turpis. Nullam sit amet enim. Suspendisse id velit vitae ligula volutpat condimentum. Aliquam erat volutpat. Sed quis velit. Nulla facilisi. Nulla libero. Vivamus pharetra posuere sapien. Nam consectetuer. Sed aliquam, nunc eget euismod ullamcorper, lectus nunc ullamcorper orci, fermentum bibendum enim nibh eget ipsum. Donec porttitor ligula eu dolor. Maecenas vitae nulla consequat libero cursus venenatis. Nam magna enim, accumsan eu, blandit sed, blandit a, eros.</p>
      </div>
      <footer> <a href="#" class="more-link">Continue reading…</a> </footer>
    </article>
    <article class="post">
      <h2><a href="#" class="post-title">Blog post</a></h2>
      <div class="meta">
        <p>Posted on <span class="time">November 15, 2011</span> by <a href="#" class="fn">Sylvain Lafitte</a> in <a href="#"class="cat">Other</a> with <a href="#" class="comments-link">42 comments</a>.</p>
      </div>
      <div class="entry">
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi commodo, ipsum sed pharetra gravida, orci magna rhoncus neque, id pulvinar odio lorem non turpis. Nullam sit amet enim. Suspendisse id velit vitae ligula volutpat condimentum. Aliquam erat volutpat. Sed quis velit. Nulla facilisi. Nulla libero. Vivamus pharetra posuere sapien. Nam consectetuer. Sed aliquam, nunc eget euismod ullamcorper, lectus nunc ullamcorper orci, fermentum bibendum enim nibh eget ipsum. Donec porttitor ligula eu dolor. Maecenas vitae nulla consequat libero cursus venenatis. Nam magna enim, accumsan eu, blandit sed, blandit a, eros.</p>
      </div>
      <footer> <a href="#" class="more-link">Continue reading…</a> </footer>
    </article>
    <article class="post">
      <h2><a href="#" class="post-title">Blog post</a></h2>
      <div class="meta">
        <p>Posted on <span class="time">November 15, 2011</span> by <a href="#" class="fn">Sylvain Lafitte</a> in <a href="#"class="cat">Other</a> with <a href="#" class="comments-link">42 comments</a>.</p>
      </div>
      <div class="entry">
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi commodo, ipsum sed pharetra gravida, orci magna rhoncus neque, id pulvinar odio lorem non turpis. Nullam sit amet enim. Suspendisse id velit vitae ligula volutpat condimentum. Aliquam erat volutpat. Sed quis velit. Nulla facilisi. Nulla libero. Vivamus pharetra posuere sapien. Nam consectetuer. Sed aliquam, nunc eget euismod ullamcorper, lectus nunc ullamcorper orci, fermentum bibendum enim nibh eget ipsum. Donec porttitor ligula eu dolor. Maecenas vitae nulla consequat libero cursus venenatis. Nam magna enim, accumsan eu, blandit sed, blandit a, eros.</p>
      </div>
      <footer> <a href="#" class="more-link">Continue reading…</a> </footer>
    </article>
    <article class="post">
      <h2><a href="#" class="post-title">Blog post</a></h2>
      <div class="meta">
        <p>Posted on <span class="time">November 15, 2011</span> by <a href="#" class="fn">Sylvain Lafitte</a> in <a href="#"class="cat">Other</a> with <a href="#" class="comments-link">42 comments</a>.</p>
      </div>
      <div class="entry">
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi commodo, ipsum sed pharetra gravida, orci magna rhoncus neque, id pulvinar odio lorem non turpis. Nullam sit amet enim. Suspendisse id velit vitae ligula volutpat condimentum. Aliquam erat volutpat. Sed quis velit. Nulla facilisi. Nulla libero. Vivamus pharetra posuere sapien. Nam consectetuer. Sed aliquam, nunc eget euismod ullamcorper, lectus nunc ullamcorper orci, fermentum bibendum enim nibh eget ipsum. Donec porttitor ligula eu dolor. Maecenas vitae nulla consequat libero cursus venenatis. Nam magna enim, accumsan eu, blandit sed, blandit a, eros.</p>
      </div>
      <footer> <a href="#" class="more-link">Continue reading…</a> </footer>
    </article>
    <ul class="page-numbers">
      <li><a href="#">Prev</a></li>
      <li><a href="#" class="current">1</a></li>
      <li><a href="#">2</a></li>
      <li><a href="#">3</a></li>
      <li><a href="#">4</a></li>
      <li><a href="#">Next</a></li>
    </ul>
  </section>
  <aside class="column4 sidebar">
    <div class="widget widget_search">
      <input id="s" type="search" name="search" value="Type and hit enter to search" >
    </div>
    <div class="widget">
      <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi commodo, ipsum sed pharetra gravida, orci magna rhoncus neque, id pulvinar odio lorem non turpis. Nullam sit amet enim.</p>
    </div>
    <div class="widget">
      <h2>Popular Posts</h2>
      <ul>
        <li><a href="#">Nullam porttitor elementum ligula</a></li>
        <li><a href="#">Vestibulum interdum</a></li>
        <li><a href="#">Quisque venenatis ante sit amet dolor</a></li>
        <li><a href="#">Aliquam adipiscing libero vitae leo</a></li>
        <li><a href="#">Sed accumsan quam ac tellus</a></li>
      </ul>
    </div>
    <div class="widget">
      <h2>Categories</h2>
      <ul>
        <li><a href="#">Design (99+)</a></li>
        <li><a href="#">Web (53)</a></li>
        <li><a href="#">Other (12)</a></li>
        <li><a href="#">Weird (4)</a></li>
      </ul>
    </div>
    <div class="widget">
      <h2>Meta</h2>
      <ul>
        <li><a href="#">Entries (RSS)</a></li>
        <li><a href="#">Comments (RSS)</a></li>
      </ul>
    </div>
  </aside>
</div>
<footer class="center part clearfix">
  <ul class="social column3 mright">
    <li><a href="#">RSS</a></li>
    <li><a href="#">Facebook</a></li>
    <li><a href="#">Twitter</a></li>
    <li><a href="#">Google+</a></li>
    <li><a href="#">Flickr</a></li>
  </ul>
  <div class="up column3 mright"> <a href="#navtop" class="ir">Go up</a> </div>
  <nav class="column3">
    <ul>
      <li><a href="index.jsp">Home</a></li>
      <li><a href="about.jsp">About</a></li>
      <li><a href="works.jsp">Works</a></li>
      <li><a href="services.jsp">Services</a></li>
      <li><a href="blog.jsp">Blog</a></li>
      <li><a href="contact.jsp">Contact</a></li>
    </ul>
  </nav>
</footer>
<script src="http://code.jquery.com/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/jquery-1.5.1.min.js"><\/script>')</script>
<script src="js/scripts.js"></script>
<!--[if (gte IE 6)&(lte IE 8)]>
<script src="js/selectivizr.js"></script>
<![endif]-->
</body>
</html>