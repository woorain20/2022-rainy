<script>
  import Upsidposter from "./lib/mainpage/Upsidposter.svelte";
  
  
  
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

<<<<<<< Updated upstream
      <div class="logo">
        <h1><a href="index.html">Korea Muesum</a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
=======
  //import Exhibitiontotal from "./lib/Exhibitiontotal.svelte";

  // import Relic from "./lib/relic/Relic.svelte";
  // import Eventpage from "./lib/Eventpage.svelte";
  // import Upsidposter from "./lib/mainpage/Upsidposter.svelte";
  import Tesr from "./lib/relic/tesr.svelte"; 




</script>

<main>
    <div class="navbar navbar-dark bg-dark fixed-top navbar-expand-lg">
      <div class="container">
        <a class="navbar-brand" href="../index.html">Korea Museum</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-content">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbar-content">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item, nav-link">박물관 정보</li>
            <li class="nav-item, nav-link">국내 유물</li>
            <li class="nav-item, nav-link">전시회</li>
            <li class="nav-item, nav-link">EVENT</li>
            <li class="nav-item, nav-link">게시판</li>
            <li class="nav-item, nav-link">Museum Shop</li>
            <li class="nav-item, nav-link">About Us</li>
          </ul>
          <ul class="navbar-nav">
            <li class="nav-item, nav-link" href="#">Log In</li>
            <li class="nav-item, nav-link" href="#">회원가입</li>
          </ul>
        </div>
>>>>>>> Stashed changes
      </div>

      <nav id="navbar" class="navbar">
        <ul>
          <li><a class="active" href="index.html">Home</a></li>
          <li><a href="index.html">박물관소개</a></li>
          <li><a href="index.html">유물 검색</a></li>
          <li><a href="index.html">전시회</a></li>
          <li><a href="index.html">EVENT</a></li>
          <li><a href="index.html">게시판</a></li>
          <li><a href="index.html">About Us</a></li>
          <li><a href="cindex.html">Contact</a></li>
        </ul>
        <i class="bi bi-list mobile-nav-toggle"></i>
      </nav><!-- .navbar -->

    </div>
  </header><!-- End Header -->


<Upsidposter />

<<<<<<< Updated upstream
<style>
=======
</div>

<!-- <Exhibitiontotal /> -->
<!-- <Relic/> -->
<Tesr/>
>>>>>>> Stashed changes


</style>
