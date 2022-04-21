import { useParams } from "react-router-dom"

export const Agaram=()=>{
    return(
        <>
        <h1>World best literature</h1>
        </>
    )
}

export const Thenali=()=>{
    const{roshan}=useParams()
    return(
        <>
        <h1>Assembly poet from {roshan}</h1>
        </>
    )
}

export const Vikatan=()=>{
    return(
        <>
        <h1>weekly article</h1>
        </>
    )
}