import { Link } from 'react-router-dom';
import './index.scss';
import { useState } from 'react';
import axios from 'axios';


export default function Filmes() {

  const[filme, setFilme] = useState('');
  const[listafilme, setLista] = useState([]);

  async function buscar() {
    let url = 'https://' + filme;

    let response = await axios.get(url);
    setLista(response.data.Search);
  }

  return (
    <div className="pagina-filme">
      <div className='portfiolio'>
        <img src='../assets/images/portifolio.png'></img>
      </div>
      <div className='cabecalho'>
        <img src='../assets/images/filmes.png'></img>
        <div className='titulo'>
          <h2>IMDB</h2>
        </div>
      </div>

      <div className='lista-filmes'>
        <h2>Consulta de Filmes</h2>

        <div className='buscar-filme'>
          <input type='text' placeholder='Rush' value={filme} onChange={e => setFilme (e.target.value)}></input>
          <img src='../assets/images/icon-buscar.png'></img>
        </div>
        <button onClick={buscar}>Buscar</button>
      </div>




      <Link className='voltar' to='/'> Voltar para Menu </Link>
    </div>
  )
}