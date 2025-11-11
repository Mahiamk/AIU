import { useNavigate } from 'react-router-dom'
import '../assets/css/Dashboard.css'

function Dashboard() {
  const navigate = useNavigate()

  return (
    <div className="dashboard-container">
      <header className="dashboard-header">
        <h1>IdamanXchange</h1>
        <nav>
          <button onClick={() => navigate('/dashboard')} className="active">Dashboard</button>
          <button onClick={() => navigate('/items')}>Items</button>
          <button onClick={() => navigate('/')}>Logout</button>
        </nav>
      </header>
      
      <main className="dashboard-content">
        <h2>Welcome to IdamanXchange</h2>
        
        <div className="stats-container">
          <div className="stat-card">
            <h3>Total Recycled</h3>
            <p className="stat-value">250 kg</p>
          </div>
          
          <div className="stat-card">
            <h3>Carbon Saved</h3>
            <p className="stat-value">125 kg</p>
          </div>
          
          <div className="stat-card">
            <h3>Points Earned</h3>
            <p className="stat-value">1,250</p>
          </div>
        </div>
        
        <div className="action-buttons">
          <button className="action-button" onClick={() => navigate('/items')}>View Recyclable Items</button>
          <button className="action-button">Schedule Pickup</button>
        </div>
      </main>
    </div>
  )
}

export default Dashboard