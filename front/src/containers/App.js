import React, { Component } from 'react'
import From from '../components/From'
import Result from '../components/Result'

class App extends Component {// component stateful
  render() {
    return (
      <div>
        <h3>Teletransportador randómico</h3>
        <p>Teletransportador</p>
        <From />
        <Result />
      </div>
    )
  }
}

export default App


