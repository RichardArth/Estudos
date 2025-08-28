import './App.scss';
import axios from 'axios';
import { useState } from 'react';


function App() {

  return (
    <div className="App">
      <div className='cabecalho'>
        <img src='./assets/images/logoPokedex 1.png'/>
        <button>Encontrar Pokémons</button>
      </div>
      <div className='meio'>
        <div className='cima'>
            <div>
              <img src='./assets/images/Ellipse 3.png'/>
              <h4>bulbasaur</h4>
              <p>grass poison</p>
            </div>

            <div>
              <img src='./assets/images/Ellipse 3.png'/>
              <h4>bulbasaur</h4>
              <p>grass poison</p>
            </div>

            <div>
              <img src='./assets/images/Ellipse 3.png'/>
              <h4>bulbasaur</h4>
              <p>grass poison</p>
            </div>

            <div>
              <img src='./assets/images/Ellipse 3.png'/>
              <h4>bulbasaur</h4>
              <p>grass poison</p>
            </div>
        </div>
        <div className='baixo'>

        <div>
              <img src='./assets/images/Ellipse 3.png'/>
              <h4>bulbasaur</h4>
              <p>grass poison</p>
            </div>

            <div>
              <img src='./assets/images/Ellipse 3.png'/>
              <h4>bulbasaur</h4>
              <p>grass poison</p>
            </div>

            <div>
              <img src='./assets/images/Ellipse 3.png'/>
              <h4>bulbasaur</h4>
              <p>grass poison</p>
            </div>

            <div>
              <img src='./assets/images/Ellipse 3.png'/>
              <h4>bulbasaur</h4>
              <p>grass poison</p>
            </div>

        </div>
      </div>

      <div className='rodape'>
        <button>Buscar mais</button>
      </div>
    </div>
  );
}

export default App;
