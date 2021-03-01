import React, { useState } from "react";

export const AddPerson = () => {

    const [name, setName] = useState("");
    const [surname, setSurame] = useState("");
    const [idNumber, setIdNumber] = useState("");
    const [docType, setDocType] = useState("");
    const [docNumber, setDocNumber] = useState("");

    const addNewPerson = (event) => {
        event.preventDefault();
        event.stopPropagation();

        const newPerson = {
            name: name,
            surname: surname,
            idNumber: idNumber,
            docType: docType,
            docNumber: docNumber
        }

        const url = "http://localhost:8080/api/persons"
        fetch(url, {
            method: "POST",
            headers: {
                'Content-Type': "application/json"
            },
            body: JSON.stringify(newPerson)
        }).then(
            data => console.log(data)
        )
    }

    return(
        <form>
            <label>
                Imię:
                <input type="text" 
                name="name" 
                value={name} 
                onChange={event =>  setName(event.target.value)}/>
            </label>
            <label>
                Nazwisko:
                <input type="text" 
                name="surname" 
                value={surname} 
                onChange={event => setSurame(event.target.value)}/>
            </label>
            <label>
                PESEL:
                <input type="text" 
                name="idNumber" 
                value={idNumber} 
                onChange={event => setIdNumber(event.target.value)}/>
            </label>
            <label>
                Typ dokumentu:
                <input type="text" 
                name="docType" 
                value={docType} 
                onChange={event => setDocType(event.target.value)}/>
            </label>
            <label>
                Numer dokumentu:
                <input type="text" 
                name="docNumber" 
                value={docNumber} 
                onChange={event => setDocNumber(event.target.value)}/>
            </label>
            <input type="submit" value="Zapisz" onClick={event => addNewPerson(event)}/>
        </form>
    )
}