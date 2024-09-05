import React, { useState } from 'react';
import CardForm from './components/CardForm';
import Card from './components/Card';
import './App.css';

const App = () => {
	const [card, setCard] = useState({
		title: '',
		content: '',
		image: ''
	});

	const handleAddCard = (newCard) => {
		setCard(newCard);
	};

	return (
		<div className="container">
			<h1>Card Manager</h1>
			<CardForm onSubmit={handleAddCard} cardData={card} />
			<div className="card-preview">
				<Card title={card.title} content={card.content} image={card.image} />
			</div>
		</div>
	);
};

export default App;
