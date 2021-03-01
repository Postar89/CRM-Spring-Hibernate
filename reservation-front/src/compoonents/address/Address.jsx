import React, { useEffect, useState } from "react";

export const Address = () => {
    

    const [appState, setAppState] = useState({ addresses: [] });

    useEffect( ()  => {
        const url = "http://localhost:8080/api/address"
        fetch(url)
            .then(data => data.json())
            .then( response => setAppState({addresses: response}));
    },[]);

    const removeAddress = (event, id) => {
        event.preventDefault();
        event.stopPropagation();
        const url = "http://localhost:8080/api/address/"+id;
        fetch(url, {
            method: "DELETE"
        }).then(
            data => console.log(data)
        )   
    };
    

    return (
        <>
        <table>
            <thead>
                <tr>
                    <th>Kraj</th>
                    <th>Miasto</th>
                    <th>KodPocztowy</th>
                    <th>Ulica</th>
                    <th>Numer domu</th> 
                    <th>Numer mieszkania</th>                   
                </tr>                
            </thead>
            <tbody>
                {appState.addresses.map( (address,index) =>{
                return (
                    <tr key={index}>
                        <td>{address.countryId}</td>
                        <td>{address.cityId}</td>
                        <td>{address.passCode}</td>
                        <td>{address.street}</td>
                        <td>{address.houseNb}</td> 
                        <td>{address.floatNb}</td>
                        <td>
                            <button onClick={event => removeAddress(event, address.id)}>Usuń</button>
                        </td>                       
                    </tr>
                )
            })}
            </tbody>
        </table>            
        </>
    )
}