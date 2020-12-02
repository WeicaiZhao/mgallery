<%--
  Created by IntelliJ IDEA.
  User: DannyZhao
  Date: 2020-11-26
  Time: 7:00 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Document</title>
  <link rel="stylesheet" type="text/css" href="css\common.css">
  <script type="text/javascript" src="js\js1.js"></script>
</head>
<body>
<div class="header">
  <div class="logo">
    <img src="image\logo.png">
  </div>
  <div class="menu"   onclick="show_menu()" onmouseleave="show_menu1()">
    <div class="menu_title" ><a href="###">Content Classification</a></div>
    <ul id="title">
      <li>Realism</li>
      <li>Abstract expressionism</li>
    </ul>
  </div>
  <div class="auth">
    <ul>
      <li><a href="#">Log in</a></li>
      <li><a href="#">Register</a></li>
    </ul>
  </div>
</div>
<div class="content">
  <div class="banner">
    <img src="image/welcome.png" class="banner-img">
  </div>
  <div class="img-content">
    <ul>
      <li>
        <img src="image/wumingnvlang.jpg" class="img-li">
        <div class="info">
          <h3>A girl</h3>
          <p>
            Description 1
          </p>
          <div class="img-btn">
            <div class="price">$5800</div>
            <a href="#" class="cart">
              <div class="btn">
                <img src="image/cart.svg">
              </div>
            </a>
          </div>
        </div>
      </li>
      <li>
        <img src="image/wumingnvlang.jpg" class="img-li">
        <div class="info">
          <h3>A girl</h3>
          <p>
            Description 2
          </p>
          <div class="img-btn">
            <div class="price">$5800</div>
            <div class="btn">
              <a href="#" class="cart">
                <img src="image/cart.svg">
              </a>
            </div>
          </div>
        </div>
      </li>
      <li>
        <img src="image/wumingnvlang.jpg" class="img-li">
        <div class="info">
          <h3>A girl</h3>
          <p>
            Description 3
          </p>
          <div class="img-btn">
            <div class="price">$5800</div>
            <div class="btn">
              <a href="#" class="cart">
                <img src="image/cart.svg">
              </a>
            </div>
          </div>
        </div>
      </li>
      <li>
        <img src="image/wumingnvlang.jpg" class="img-li">
        <div class="info">
          <h3>A girl</h3>
          <p>
            Description 4
          </p>
          <div class="img-btn">
            <div class="price">$5800</div>
            <div class="btn">
              <a href="#" class="cart">
                <img src="image/cart.svg">
              </a>
            </div>
          </div>
        </div>
      </li>
      <li>
        <img src="image/wumingnvlang.jpg" class="img-li">
        <div class="info">
          <h3>A girl</h3>
          <p>
            Description 5
          </p>
          <div class="img-btn">
            <div class="price">$5800</div>
            <div class="btn">
              <a href="#" class="cart">
                <img src="image/cart.svg">
              </a>
            </div>
          </div>
        </div>
      </li>
      <li>
        <img src="image/wumingnvlang.jpg" class="img-li">
        <div class="info">
          <h3> A girl</h3>
          <p>
            Description 1
          </p>
          <div class="img-btn">
            <div class="price">$5800</div>
            <div class="btn">
              <a href="#" class="cart">
                <img src="image/cart.svg">
              </a>
            </div>
          </div>
        </div>
      </li>
    </ul>
  </div>
  <div class="page-nav">
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">Previous</a></li>
      <li><span class="first-page">1</span></li>
      <li><a href="#">2</a></li>
      <li><a href="#">3</a></li>
      <li><a href="#">4</a></li>
      <li><a href="#">5</a></li>
      <li><a href="#">…</a></li>
      <li><a href="#">98</a></li>
      <li><a href="#">99</a></li>
      <li><a href="#">Next</a></li>
      <li><a href="#">End</a></li>
    </ul>
  </div>
</div>
<div class="footer">
  <p><span>M-GALLARY</span> Weicai Learning Project</p>
</div>
</body>
</html>
