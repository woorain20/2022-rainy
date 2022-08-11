<script>
    import { Link } from "svelte-routing";
</script>

<div>
    <h1>Museum</h1>
    <Link to="museum"><button>Museum</button></Link>
    <Link to="relic"><button>Relic</button></Link>
    <Link to="exhibition"><button>Exhibition</button></Link>
    <Link to="event"><button>Event</button></Link>
    <Link to="board"><button>Board</button></Link>
    <Link to="goods"><button>Goods</button></Link>
    <Link to="home"><button>Home</button></Link>
</div>
<div>
    <input type="text">
    <input type="submit">
</div>

<style>
    div{
        margin-bottom: 30px;
    }
</style>