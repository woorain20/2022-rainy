import '../../src/app.css'
import AppMuseum from './AppMuseum.svelte'

const appMuseum = new AppMuseum({
  target: document.getElementById('appMuseum')
})

export default appMuseum