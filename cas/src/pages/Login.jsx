import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import '../assets/css/Login.css'

function Login() {
  const [email, setEmail] = useState('')
  const [password, setPassword] = useState('')
  const navigate = useNavigate()

  const handleSubmit = (e) => {
    e.preventDefault()
    // In a real app, you would validate credentials here
    // For now, we'll just navigate to the dashboard
    navigate('/dashboard')
  }

  return (
    <div className="login-container">
      <div className="login-card">
        <h1 className="app-title">IdamanXchange</h1>
        <p className="app-subtitle">Recycling Made Easy</p>
        
        <form onSubmit={handleSubmit} className="login-form">
          <div className="form-group">
            <label htmlFor="email">Email</label>
            <input 
              type="email" 
              id="email" 
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              required
              placeholder="Enter your email"
            />
          </div>
          
          <div className="form-group">
            <label htmlFor="password">Password</label>
            <input 
              type="password" 
              id="password" 
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              required
              placeholder="Enter your password"
            />
          </div>
          
          <button type="submit" className="login-button">Login</button>
        </form>
      </div>
    </div>
  )
}

export default Login