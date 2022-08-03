<script>
  import svelteLogo from './assets/svelte.svg'
  import Counter from './lib/Counter.svelte'
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
    <a href="https://vitejs.dev" target="_blank"> 
      <img src="/vite.svg" class="logo" alt="Vite Logo" />
    </a>
    <a href="https://svelte.dev" target="_blank"> 
      <img src={svelteLogo} class="logo svelte" alt="Svelte Logo" />
    </a>
  </div>
  <h1>Vite + Svelte</h1>

  <div class="card">
    <Counter />
  </div>

  <p>
    Check out <a href="https://github.com/sveltejs/kit#readme" target="_blank">SvelteKit</a>, the official Svelte app framework powered by Vite!
  </p>

  <p class="read-the-docs">
    Click on the Vite and Svelte logos to learn more
  </p>
</main>


