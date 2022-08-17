<script>
    import {Router, Route} from "../node_modules/svelte-routing"
    import Board from "./lib/Board.svelte";
    import Event from "./lib/Event.svelte";
    import Exhibition from "./lib/Exhibition.svelte";
    import Goods from "./lib/Goods.svelte";
    import Home from "./lib/Home.svelte";
    import Museum from "./lib/Museum.svelte";
    import Relic from "./lib/Relic.svelte"; 

    export let url=""

</script>

<Router url={url}>
  <!-- <nav>
      <Link to="/">Home</Link>
      <Link to="infomation">Infomation</Link>
      <Link to="search">Search</Link>
      <Link to="option">Option</Link>
      <Link to="/">Exit</Link>
  </nav> -->
  <div>
      <Route path="home" component={Home}><Home/></Route>
      <Route path="museum" component={Museum}></Route>
      <Route path="relic" component={Relic}></Route>
      <Route path="exhibition" component={Exhibition}></Route>
      <Route path="event" component={Event}></Route>
      <Route path="board" component={Board}></Route>
      <Route path="goods" component={Goods}></Route>
      <Route path="/"><Home/></Route>
  </div>
</Router>



<style>

</style>
