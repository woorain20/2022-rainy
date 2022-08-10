import '../../src/app.css'
import AppRelic from './AppRelic.svelte'

const appRelic = new AppRelic({
  target: document.getElementById('appRelic')
})

export default appRelic