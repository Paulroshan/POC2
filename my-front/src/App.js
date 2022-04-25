import { Menus } from "./Navi";
import{BrowserRouter,Routes,Route }from 'react-router-dom'
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import { Agaram, Thenali, Vikatan } from "./MyComps";
import { NewAccount } from "./SignUp";
import { Login } from "./Login";

const App=()=>{
  return(
    <>
    <BrowserRouter>
    <Menus/>
    <Routes>
        <Route path="/" exact element={<Login/>}/>
        <Route path="/sign" exact element={<NewAccount/>}/>
        <Route path="/second/:roshan" exact element={<Thenali/>}/>
        <Route path="/third" exact element={<Vikatan/>}/>
    </Routes>
    </BrowserRouter>
    </>
  )
}

export default App;