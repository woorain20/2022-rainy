<script>
  import svelteLogo from './assets/svelte.svg'
  import Counter from './lib/Counter.svelte'
</script>

<main>
  <body>
    <div class="navbar navbar-dark bg-dark fixed-top navbar-expand-lg">
      <div class="container">
        <a class="navbar-brand" href="#">Korea Museum</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-content">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbar-content">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item"><a class="nav-link" href="#">박물관 정보</a></li>
            <li class="nav-item"><a class="nav-link" href="#">국내 유물</a></li>
            <li class="nav-item"><a class="nav-link" href="#">상설 전시회</a></li>
            <li class="nav-item"><a class="nav-link" href="#">특별 전시회</a></li>
            <li class="nav-item"><a class="nav-link" href="#">EVENT</a></li>
            <li class="nav-item"><a class="nav-link" href="#">게시판</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Museum Shop</a></li>
            <li class="nav-item"><a class="nav-link" href="#">About Us</a></li>
          </ul>
          <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link" href="#">Node.js</a></li>
            <li class="nav-item"><a class="nav-link" href="#">API</a></li>
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


