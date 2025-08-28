import './App.scss';

function App() {
  return (
    <div className="App">
      
      <div className='cabecalho'>
        <div className='esq'>
          <img src='./assets/images/mv.png'/>
        </div>
        <div className='dir'>
          
          <div><p>Home</p></div>
          
          <div><p>Personagens</p></div>
          
          <div><p>Quadrinhos</p></div>
          
          <div><p>Eventos</p></div>
          
          <div><p>Contato</p></div>
          
          <div><img src='./assets/images/m.png'/></div>
        </div>
      </div>
      <div className='meio'>
         <div className='t01'>
         <h1>Personagens </h1>
          <h1>da MARVEL</h1>
         </div>
         <div className='t02'>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut elementum augue ut ligula malesuada blandit. Quisque tempor ex quis congue malesuada. Pellentesque est eros, aliquam non malesuada et, molestie ut purus.</p>
         </div>
      </div>
      <div className='ps'>
      <input type="text" id="search" name="q" placeholder="Nome do personagem"/>
      </div>
      <div className='rodape'>
        <div className='per'>
          <img src='./assets/images/ca.png'/>
          <h4>Capitão América</h4>
          <p>Lorem ipsum dolor sit amet, consectetur ipsum dolor sit adipiscing elit.</p>
        </div>

        <div className='per'>
          <img src='./assets/images/ca.png'/>
          <h4>Capitão América</h4>
          <p>Lorem ipsum dolor sit amet, consectetur ipsum dolor sit adipiscing elit.</p>
        </div>

        <div className='per'>
          <img src='./assets/images/ca.png'/>
          <h4>Capitão América</h4>
          <p>Lorem ipsum dolor sit amet, consectetur ipsum dolor sit adipiscing elit.</p>
        </div>

        <div className='per'>
          <img src='./assets/images/ca.png'/>
          <h4>Capitão América</h4>
          <p>Lorem ipsum dolor sit amet, consectetur ipsum dolor sit adipiscing elit.</p>
        </div>

        <div className='per'>
          <img src='./assets/images/ca.png'/>
          <h4>Capitão América</h4>
          <p>Lorem ipsum dolor sit amet, consectetur ipsum dolor sit adipiscing elit.</p>
        </div>

      </div>

    </div>

  );
}

export default App;
