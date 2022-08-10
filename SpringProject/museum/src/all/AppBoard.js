import '../../src/app.css'
import AppBoard from './AppBoard.svelte'

const appBoard = new AppBoard({
  target: document.getElementById('appBoard')
})

export default appBoard
