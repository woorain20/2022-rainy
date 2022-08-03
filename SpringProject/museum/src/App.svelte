<script>
  import MuseumInfo from './lib/MuseumInfo.svelte'
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
            <li class="nav-item, nav-link" >상설 전시회</li>
            <li class="nav-item, nav-link">특별 전시회</li>
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
      </div>
    </div>
  <div>
</main>
<div>
    <MuseumInfo/>
</div>


