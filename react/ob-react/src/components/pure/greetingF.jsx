import React, { useState } from 'react';
import PropTypes from 'prop-types';

const GreetingF = props => {

	// const [variable, método para actualizar] = useState(valor inicial)
	const [age, setAge] = useState(29);

	const birthday = () => {
		setAge(age + 1)
	};

	return (
		<div>
			<h1>
				Hello {props.name}
			</h1>
			<h2>
				Your age is: {age}
			</h2>
			<div>
				<button onClick={birthday}>
					turn years
				</button>
			</div>
		</div>
	);
};

GreetingF.propTypes = {
	name: PropTypes.string
};

export default GreetingF;