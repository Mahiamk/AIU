const { useState } = React;

function TopBar({ title, onBack }) {
  return (
    <div className="topbar">
      {onBack ? (
        <button onClick={onBack} style={{background:'transparent',border:0,color:'#fff',fontSize:18,cursor:'pointer'}}>&larr;</button>
      ) : null}
      <h1>{title}</h1>
    </div>
  );
}

function Login({ onSignIn, goRegister }) {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  return (
    <div className="app-shell">
      <TopBar title="Login" />
      <div className="content">
        <div className="hero">
          <img alt="Welcome to CassavaCycle" src="https://images.unsplash.com/photo-1599577181546-0903f829e59a?q=80&w=1600&auto=format&fit=crop" />
          <div className="hero-caption">WELCOME TO CASSAVACYCLE</div>
        </div>
        <p className="section-title">"Time to Change… Recycle Now… Exchange"</p>
        <div className="stack">
          <label className="input">
            <span role="img" aria-label="email">✉️</span>
            <input placeholder="Email" value={email} onChange={(e)=>setEmail(e.target.value)} />
          </label>
          <label className="input">
            <span role="img" aria-label="password">🔒</span>
            <input placeholder="Password" type="password" value={password} onChange={(e)=>setPassword(e.target.value)} />
          </label>
          <button className="btn btn-primary" onClick={()=>onSignIn({email})}>SIGN IN</button>
          <button className="btn btn-outline" onClick={goRegister}>REGISTER</button>
        </div>
      </div>
    </div>
  );
}

function Home({ goItems }) {
  return (
    <div className="app-shell">
      <TopBar title="Hello, CassavaCycler" />
      <div className="content">
        <div className="hero" style={{marginBottom:16}}>
          <img alt="CassavaCycle Center" src="https://images.unsplash.com/photo-1520639888713-7851133b1ed0?q=80&w=1600&auto=format&fit=crop" />
        </div>
        <div className="panel">
          <div>
            <div className="muted">Recycle in 2024</div>
            <div className="value">0.00 KG</div>
            <div className="muted">Dashboard &gt;</div>
          </div>
          <div className="sep" />
          <div>
            <div className="muted">Balance Points</div>
            <div className="value">0.00</div>
            <div className="muted">Transactions &gt;</div>
          </div>
        </div>

        <div style={{height:12}} />

        <div className="grid">
          {[
            {title:'Redemption'},
            {title:'Recycle Centers'},
            {title:'Events'},
            {title:'Calculator'},
            {title:'FAQ'},
            {title:'Highlights'},
          ].map((x, i)=> (
            <div className="card" key={i}>
              <img alt={x.title} src={`https://picsum.photos/seed/${i+10}/400/240`} />
              <h4>{x.title}</h4>
            </div>
          ))}
        </div>
      </div>

      <a className="center-fab" onClick={goItems} style={{textDecoration:'none'}}>QR</a>

      <div className="navbar">
        <div className="nav">
          {['Home','Items','QR','Notification','Profile'].map((l, i)=> (
            <button key={i} className={i===0? 'active':''}>{l}</button>
          ))}
        </div>
      </div>
    </div>
  );
}

const ITEM_DATA = [
  'Cardboard (OCC)', 'Old News Paper', 'Black & White Paper', 'Mix Paper (MC)',
  'PET (Mineral Water)', 'HDPE', 'PP', 'Aluminium Can'
];

function Items({ onBack }) {
  return (
    <div className="app-shell">
      <TopBar title="Items" onBack={onBack} />
      <div className="content">
        <div className="section-title">These are the items that we accept</div>
        <div className="grid">
          {ITEM_DATA.map((title, i)=> (
            <div className="card" key={title}>
              <img alt={title} src={`https://picsum.photos/seed/item${i}/400/300`} />
              <h4>{title}</h4>
            </div>
          ))}
        </div>
      </div>
      <div className="navbar">
        <div className="nav">
          {['Home','Items','QR','Notification','Profile'].map((l, i)=> (
            <button key={i} className={i===1? 'active':''}>{l}</button>
          ))}
        </div>
      </div>
    </div>
  );
}

function App() {
  const [route, setRoute] = useState('login');
  return (
    route === 'login' ? (
      <Login onSignIn={()=>setRoute('home')} goRegister={()=>alert('Registration flow TBD')} />
    ) : route === 'home' ? (
      <Home goItems={()=>setRoute('items')} />
    ) : (
      <Items onBack={()=>setRoute('home')} />
    )
  );
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<App />);


