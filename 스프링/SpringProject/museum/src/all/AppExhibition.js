import '../../src/app.css'
import AppExhibition from './AppExhibition.svelte'

const appExhibition = new AppExhibition({
  target: document.getElementById('appExhibition')
})

export default appExhibition