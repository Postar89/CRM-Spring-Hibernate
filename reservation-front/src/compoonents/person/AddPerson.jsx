import React, { useState } from "react";
import { Form, Button } from "react-bootstrap";

export const AddPerson = () => {

    
    const [name, setName] = useState("");
    const [surname, setSurame] = useState("");
    const [idNumber, setIdNumber] = useState("");
    const [docType, setDocType] = useState("");
    const [docNumber, setDocNumber] = useState("");
    const [id, getId] = useState("");

    const addNewPerson = (event) => {
        event.preventDefault();
        event.stopPropagation();

        const newPerson = {
            id: id,
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
    
    const addAdres = (event) =>{
        event.preventDefault();
        event.stopPropagation();
        console.log("dodaj adres");

    }

    return(
        <Form>
            <Form.Label>KoChocimski</Form.Label>
            <Form.Group>
            <Form.Label>Imię:</Form.Label>
                <Form.Control type="text" 
                name="name" 
                value={name} 
                onChange={event =>  setName(event.target.value)}/>
            <Form.Label>Nazwisko:</Form.Label>
                <Form.Control type="text" 
                name="surname" 
                value={surname} 
                onChange={event => setSurame(event.target.value)}/>
            <Form.Label>PESEL:</Form.Label>
                <Form.Control type="text" 
                name="idNumber" 
                value={idNumber} 
                onChange={event => setIdNumber(event.target.value)}/>
            <Form.Label>Typ dokumentu:</Form.Label>
                <Form.Control type="text" 
                name="docType" 
                value={docType} 
                onChange={event => setDocType(event.target.value)}/>
            <Form.Label>Numer dokumentu:</Form.Label>
                <Form.Control type="text" 
                name="docNumber" 
                value={docNumber} 
                onChange={event => setDocNumber(event.target.value)}/>
            </Form.Group>
            <Form.Group>
                <Button variant="primary" type="submit" value="Zapisz" onClick={event => addAdres(event)}>Dodaj Adres</Button>
                <Button variant="primary" type="submit" value="Zapisz" onClick={event => addNewPerson(event)}>Zapisz</Button>
            </Form.Group>
            
            
            <Button variant="primary" type="submit" value="Zapisz">Powrót</Button>
        </Form>
    )
}