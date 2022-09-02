import '../../src/app.css'
import AppEvent from './AppEvent.svelte'

const appEvent = new AppEvent({
  target: document.getElementById('appEvent')
})

export default appEvent