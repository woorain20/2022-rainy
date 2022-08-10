import '../../src/app.css'
import AppIntro from './AppIntro.svelte'

const appIntro = new AppIntro({
  target: document.getElementById('appIntro')
})

export default appIntro