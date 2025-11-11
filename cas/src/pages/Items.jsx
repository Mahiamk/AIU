import { useNavigate } from 'react-router-dom'
import '../assets/css/Items.css'

function Items() {
  const navigate = useNavigate()
  
  const recyclableItems = [
    { name: 'Plastic Bottles', points: 5, image: '/images/plastic-bottle.png' },
    { name: 'Aluminum Cans', points: 10, image: '/images/aluminum-can.png' },
    { name: 'Paper', points: 3, image: '/images/paper.png' },
    { name: 'Cardboard', points: 8, image: '/images/cardboard.png' },
    { name: 'Glass Bottles', points: 12, image: '/images/glass-bottle.png' },
    { name: 'Electronics', points: 25, image: '/images/electronics.png' },
  ]

  return (
    <div className="items-container">
      <header className="dashboard-header">
        <h1>IdamanXchange</h1>
        <nav>
          <button onClick={() => navigate('/dashboard')}>Dashboard</button>
          <button onClick={() => navigate('/items')} className="active">Items</button>
          <button onClick={() => navigate('/')}>Logout</button>
        </nav>
      </header>
      
      <main className="items-content">
        <h2>Recyclable Items</h2>
        <p>These are the items we currently accept for recycling:</p>
        
        <div className="items-grid">
          {recyclableItems.map((item, index) => (
            <div className="item-card" key={index}>
              <div className="item-image-placeholder">
                {/* Replace with actual images when available */}
                <span>Image</span>
              </div>
              <h3>{item.name}</h3>
              <p>{item.points} points per kg</p>
            </div>
          ))}
        </div>
      </main>
    </div>
  )
}

export default Items