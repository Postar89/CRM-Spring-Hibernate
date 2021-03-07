import './App.css';
import {Person} from "./compoonents/person/Person"
import {AddPerson} from "./compoonents/person/AddPerson"
import {Address} from "./compoonents/address/Address"
import {AddAddress} from "./compoonents/address/AddAddress"
import {Login} from "./mock/Login"
import {SpotkaniaDoradcy} from "./mock/SpotkaniaDoradcy"
import {DodajSpotkanie} from "./mock/DodajSpotkanie"
import {SzczegolySpotkania} from "./mock/SzczegolySpotkania"

function App() {
  
  return (
    <div className="App">
      {/* <Login/> */}
      {/* <SpotkaniaDoradcy/> */}
      {/* <DodajSpotkanie/> */}
      {/* <SzczegolySpotkania/> */}
         <AddPerson/> 
     {/*   <Person/>
         <AddAddress/>
        <Address/> */}
    </div>
  );
}

export default App;
