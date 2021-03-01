import React, { useState } from "react";

export const AddAddress = () => {

    const [countryId, setCountryId] = useState(0);
    const [cityId, setCityId] = useState(0);
    const [passCode, setPassCode] = useState("");
    const [street, setStreet] = useState("");
    const [houseNb, setHouseNb] = useState("");
    const [floatNb, setFloatNb] = useState("");

    const addNewAddress = (event) => {
        event.preventDefault();
        event.stopPropagation();

        const newAddress = {
            countryId: countryId,
            cityId: cityId,
            passCode: passCode,
            street: street,
            houseNb: houseNb,
            floatNb: floatNb
        }

        const url = "http://localhost:8080/api/address"
        fetch(url, {
            method: "POST",
            headers: {
                'Content-Type': "application/json"
            },
            body: JSON.stringify(newAddress)
        }).then(
            data => console.log(data)
        )
    }

    return(
        <form>
            <label>
                Kraj:
                <input type="number" 
                name="countryId" 
                value={countryId} 
                onChange={event =>  setCountryId(event.target.value)}/>
            </label>
            <label>
                Miasto:
                <input type="number" 
                name="cityId" 
                value={cityId} 
                onChange={event => setCityId(event.target.value)}/>
            </label>
            <label>
                Kod Pocztowy:
                <input type="text" 
                name="passCode" 
                value={passCode} 
                onChange={event => setPassCode(event.target.value)}/>
            </label>
            <label>
                Ulica:
                <input type="text" 
                name="street" 
                value={street} 
                onChange={event => setStreet(event.target.value)}/>
            </label>
            <label>
                Numer Domu:
                <input type="text" 
                name="houseNb" 
                value={houseNb} 
                onChange={event => setHouseNb(event.target.value)}/>
            </label>
            <label>
                Numer Mieszkania:
                <input type="text" 
                name="floatNb" 
                value={floatNb} 
                onChange={event => setFloatNb(event.target.value)}/>
            </label>
            <input type="submit" value="Zapisz" onClick={event => addNewAddress(event)}/>
        </form>
    )
}