<script>
    
    import {Router, Route} from "../../node_modules/svelte-routing"
    import Eventdetail from "../../src/lib/Eventdetail.svelte";
    import Eventpage from "../../src/lib/Eventpage.svelte";

    export let url=""

</script>

<Eventpage />

<Router url={url}>
    <!-- <nav>
        <Link to="/">Home</Link>
        <Link to="infomation">Infomation</Link>
        <Link to="search">Search</Link>
        <Link to="option">Option</Link>
        <Link to="/">Exit</Link>
    </nav> -->
    <div>
        <Route path="eventpage" component={Eventpage}><Eventpage/></Route>
        <Route path="eventdetail" component={Eventdetail}></Route>
        <Route path="/"></Route>
    </div>
</Router>