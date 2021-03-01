import './App.css';
import {Person} from "./compoonents/person/Person"
import {AddPerson} from "./compoonents/person/AddPerson"
import {Address} from "./compoonents/address/Address"
import {AddAddress} from "./compoonents/address/AddAddress"
function App() {
  
  return (
    <div className="App">
        <AddPerson/>
        <Person/>
        <AddAddress/>
        <Address/>
    </div>
  );
}

export default App;
