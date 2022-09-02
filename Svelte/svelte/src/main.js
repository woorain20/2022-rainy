import App from './App.svelte'
//.svelte component 컴포넌트
//싱글페이지로 움직임(SPA)
const app = new App({
  target: document.getElementById('app')
})

export default app
