import React from 'react'
import { connect } from 'react-redux';
const Result = (props) => {
  //console.log(props.result)
  return <div>
     {props.result && 'Se teletransportó a: '+ props.result} 
  </div>
}


const stateMapToPros = state => {
  
  return {
    result: state.random.result?.wrapper
  }
}


export default connect(stateMapToPros)(Result)
