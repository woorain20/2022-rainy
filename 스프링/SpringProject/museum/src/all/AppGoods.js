import '../../src/app.css'
import AppGoods from './AppGoods.svelte'

const appGoods = new AppGoods({
  target: document.getElementById('appGoods')
})

export default appGoods