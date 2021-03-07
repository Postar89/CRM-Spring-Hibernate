import React, { useEffect, useState } from "react";
import {UpdatePerson} from "./UpdatePerson"
export const Person = () => {
    

    const [appState, setAppState] = useState({ person: [] })

    useEffect( ()  => {
        const url = "http://localhost:8080/api/persons"
        fetch(url)
            .then(data => data.json())
            .then(response => setAppState({person: response}));
    },[]);

    const removePerson = (event, id) => {
        event.preventDefault();
        event.stopPropagation();
       const url = "http://localhost:8080/api/persons/"+id;
       fetch(url, {
           method: "DELETE"
        }).then(
            data => console.log(data)
        )   
    };

    const updatePerson = (event, person) =>{
        event.preventDefault();
        event.stopPropagation();
        <UpdatePerson person = {person}/>
    }
    

    return (
        <>
        <table>
            <thead>
                <tr>
                    <th>Imię</th>
                    <th>Nazwisko</th>
                    <th>PESEL</th>
                    <th>Typ dokumentu</th>
                    <th>Numer dokumentu</th>                    
                </tr>                
            </thead>
            <tbody>
                {appState.person.map((person,index) =>{
                return(
                    <tr key={index}>
                        <td>{person.name}</td>
                        <td>{person.surname}</td>
                        <td>{person.idNumber}</td>
                        <td>{person.docType}</td>
                        <td>{person.docNumber}</td> 
                        <td>
                            <button onClick={event => updatePerson(event, person)}>Edytuj</button>
                        </td>
                        <td>
                            <button onClick={event => removePerson(event, person.id)}>Usuń</button>
                        </td>                       
                    </tr>
                )
            })}
            </tbody>
        </table>            
        </>
    )
}