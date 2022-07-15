<script>
    import { busInfo } from "./Pra";
    
    let info=[]
    // function busInfo(){
    //     info=bus
    // }
</script>

<!-- {#each busInfo as info}
    <table>
        <tr>
            <td>{info.routotp}</td>
        </tr>
        <tr>
            <td>{info.routono}</td>
        </tr>
        <tr>
            <td>{info.startnodenm}</td>
        </tr>
        <tr>
            <td>{info.endnodenm}</td>
        </tr>
    </table>
{/each} -->
<!-- <p>{bus["routotp"]}</p> -->
<p>{busInfo}</p>
