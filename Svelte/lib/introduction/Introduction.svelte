<script>
    //data.binding
    //document.getElementById("greeting").textContent="Hello Svelte" -js.vanilla에서의 데이터 바인딩
    let name="world"    //svelte에서의 data binding
    //속성 데이터 바인딩
    import src from "../../assets/image.gif"
    import Nested from "./Nested.svelte"
    //console.log(src)
    let danceManName="Rick Astley"
    //컴포넌트 코드가 html로 변환 되는 것 - 렌더링(Rendering)
    let string=`this string contains some <strong>HTML!!!</strong>`
</script>

<p>{string}</p>
<p>{@html string}</p>
<!-- @html을 쓰면 <></>와 안에 있는 내용이 적용됨 -->

<h1>Introduction</h1>
<h1>Hello {name.toUpperCase()}!</h1>
<img {src} alt="{danceManName} dancing"/>
<!-- 속성과 식별자가 같을 때 속성 생략 가능 -->

<p>This is a paragraph.</p>
<Nested/>
<!-- 
    <Nested></Nested> 이런식으로도 사용 가능
 -->
<style>
    img:hover{
        transform: scale(0.9);
        border-radius: 5px 5px 5px 5px;
    }
    p{
        color: blueviolet;
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        font-size: 2em;
    }
    /* p:hover{
        color: brown;
    } */
</style>