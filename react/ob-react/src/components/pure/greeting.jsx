import React, { Component } from 'react';
import PropTypes from "prop-types";

class Greeting extends Component {

  constructor(props) {
    super(props);
    this.state = {
      age: 29,
    }
  }

  birthday = () => {
    this.setState((prevSate) => (
      {
        age: prevSate.age + 1
      }
    ))
  }

  render() {
    return (
      <div>
        <h1>
          Hello {this.props.name}
        </h1>
        <h2>
          Your age is: {this.state.age}
        </h2>
        <div>
          <button onClick={this.birthday}>
            turn years
          </button>
        </div>
      </div>
    );
  }
}

Greeting.propTypes = {
  name: PropTypes.string
};

export default Greeting;