<script>
import Goods from "./lib/goods/Goods.svelte";



</script>

  <!-- ======= Top Bar ======= -->
  <section id="topbar" class="d-flex align-items-center">
    <div class="container d-flex justify-content-center justify-content-md-between">
      <div class="contact-info d-flex align-items-center">
        <i class="bi bi-envelope d-flex align-items-center"><a href="mailto:contact@example.com"> contact@example.com</a></i>
        <i class="bi bi-phone d-flex align-items-center ms-4"><span>+82 8852 3326</span></i>
      </div>
      <div class="social-links d-none d-md-flex align-items-center">
        <a href="https://twitter.com/?lang=ko" class="twitter"><i class="bi bi-twitter"></i></a>
        <a href="https://ko-kr.facebook.com/" class="facebook"><i class="bi bi-facebook"></i></a>
        <a href="https://www.instagram.com/" class="instagram"><i class="bi bi-instagram"></i></a>
        <a href="https://kr.linkedin.com/" class="linkedin"><i class="bi bi-linkedin"></i></a>
      </div>
    </div>
  </section>

  <!-- ======= Header ======= -->
  <header id="header" class="d-flex align-items-center">
    <div class="container d-flex justify-content-between align-items-center">

      <div class="logo">
        <h1><a href="index.html">Korea Muesum</a></h1>
      </div>


      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="active" href="index.html">Home</a></li>
          <li><a href="index.html">박물관소개</a></li>
          <li><a href="index.html">유물 검색</a></li>
          <li><a href="index.html">전시회</a></li>
          <li><a href="index.html">EVENT</a></li>
          <li><a href="index.html">게시판</a></li>
          <li><a href="index.html">상품</a></li>
          <li><a href="cindex.html">About Us</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

    </div>
  </header><!-- End Header -->

<Goods/>
<style>


</style>
