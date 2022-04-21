import { Menus } from "./Navi";
import{BrowserRouter,Routes,Route }from 'react-router-dom'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import { Agaram, Thenali, Vikatan } from "./MyComps";

const App=()=>{
  return(
    <>
    <BrowserRouter>
    <Menus/>
    <Routes>
        <Route path="/" exact element={<Agaram/>}/>
        <Route path="/second/:roshan" exact element={<Thenali/>}/>
        <Route path="/third" exact element={<Vikatan/>}/>
    </Routes>
    </BrowserRouter>
    </>
  )
}

export default App;