<script>
    import Info from "./Info.svelte";
    import Nested from "./Nested.svelte";
//Props - 부모 컴포넌트에서 자식 컴포넌트에 데이터 전달
const pkg={
    name:"svelte",
    version:3,
    speed:"blazing",
    website:"https://svelte.dev"
}
</script>

<h1>Props</h1>
<!-- <Nested answer={42}/> -->
<Nested answer={"abc"}/>
<Nested/>   <!-- 아무것도 들어가있지 않을 때 Nested의 answer에 쓰여진 값("a mystery")을 받아옴 -->
<Info {...pkg}/>
<style>

</style>
