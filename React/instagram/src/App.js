import { useState } from 'react';
import './App.scss';
import axios from 'axios';

export function App() {

  const[usuario, setUsuario] = useState('');
  const[tempo, setTempo] = useState('');
  const[avatar, setAvatar] = useState('');
  const[descricao, setDescricao] = useState('')
  const[imagem, setImagem] = useState('');
  const[curtida, setCurtida] = useState(0);
  const[informacoes, setInformacoes] = useState([]);

  function Informacoes() {
    let informacoes = {
      usuario:usuario,
      tempo:tempo,
      descricao:descricao,
      curtida:curtida
    }

    setInformacoes(informacoes)
  }

  async function Avatar() {
    let url = 'http://www.omdbapi.com/?i=tt3896198&apikey=e3729b5d&S=' + avatar;
  
    let response = await axios.get(url);
    setAvatar(response.data.Search);
  }

  async function PegarImagem() {
    let url = 'http://www.omdbapi.com/?i=tt3896198&apikey=e3729b5d&S=' + imagem;
  
    let response = await axios.get(url);
    setImagem(response.data.Search);
  }


  return (
    <div className="pagina-insta">
      <div className='cabecalho'>
        <img src='./assets/images/portifolio.png'></img>
      </div>
      <div className='colocar-dados'>
        <div className='cima'>

          <div className='usuario'>
            <h4>Usuário:</h4>
            <input type='text' value={usuario} onChange={e => setUsuario(e.target.value)}></input>
          </div>

          <div className='tempo'>
            <h4>Tempo:</h4>
            <input type='text' value={tempo} onChange={e => setTempo(e.target.value)}></input>
          </div>
        </div>

        <div className='meio'>
          <div className='avatar'>
              <h4>Avatar:</h4>
              <input type='text' value={avatar} onChange={e => setAvatar(e.target.value)}></input>
          </div>

          <div className='descricao'>
            <h4>Descrição:</h4>
            <input type='text' value={descricao} onChange={e => setDescricao(e.target.value)}></input>
          </div>
        </div>

        <div className='baixo'>
          <div className='imagem'>
              <h4>Post:</h4>
              <input type='text' value={imagem} onChange={e => setImagem(e.target.value)}></input>
          </div>

          <div className='curtidas'>
            <h4>Curtidas:</h4>
            <input type='number' value={curtida} onChange={e => setCurtida(Number(e.target.value))}></input>
          </div>
        </div>

        <button onClick={Informacoes}>Postar</button>

        <div className='imagem-avatar'>
            <div className='cabecalho-post'>
              <div>{Avatar}</div>
              <div className='usuario-post'>{informacoes.usuario}<img src='./assets/images/verificado.png'></img></div>
              <div className='tempo-post'>{informacoes.tempo}</div>
            </div>
        </div>

        <div className='imagem-post'>
          {PegarImagem}
        </div>

        <div className='descricao-post'>
         <div className='icones'>
          <img src='./assets/images/coracao.png'></img>
          <img src='./assets/images/balao.png'></img>
          </div>

            <div>{informacoes.curtida} Curtidas</div>

            <div className='descricao'>
              <div><b>{informacoes.usuario}</b></div>
              <div>{informacoes.descricao}</div>
            </div>
        </div>
      </div>
    </div>
  );
}

export default App;
