import React from 'react';
import Card from './Card';
import './CardList.css'; // Make sure you create and include this CSS file

const CardList = ({ cards, onEdit, onDelete }) => {
    return (
        <div>
            {cards.map((card, index) => (
                <div key={index} className="card-container">
                    <Card title={card.title} content={card.content} image={card.image} />
                    <button onClick={() => onEdit(index)}>Edit</button>
                    <button onClick={() => onDelete(index)}>Delete</button>
                </div>
            ))}
        </div>
    );
};

export default CardList;
