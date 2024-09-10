import React from 'react';
import './Card.css';

const Card = ({ title, content, image }) => {
    return (
        <div className="card">
            {image && <img src={image} alt={title} className="card-image" />}
            <div className="card-body">
                <h3 className="card-title">{title}</h3>
                <p className="card-content">{content}</p>
            </div>
        </div>
    );
};

export default Card;
