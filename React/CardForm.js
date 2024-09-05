import React, { useState, useEffect } from 'react';
import './CardForm.css';

const CardForm = ({ onSubmit, cardData }) => {
    const [title, setTitle] = useState(cardData ? cardData.title : '');
    const [content, setContent] = useState(cardData ? cardData.content : '');
    const [image, setImage] = useState(cardData ? cardData.image : '');

    useEffect(() => {
        if (cardData) {
            setTitle(cardData.title);
            setContent(cardData.content);
            setImage(cardData.image);
        }
    }, [cardData]);

    const handleSubmit = (e) => {
        e.preventDefault();
        onSubmit({ title, content, image });
        setTitle('');
        setContent('');
        setImage('');
    };

    return (
        <form onSubmit={handleSubmit}>
            <div>
                <label>
                    Title:
                    <input
                        type="text"
                        value={title}
                        onChange={(e) => setTitle(e.target.value)}
                        required
                    />
                </label>
            </div>
            <div>
                <label>
                    Content:
                    <input
                        type="text"
                        value={content}
                        onChange={(e) => setContent(e.target.value)}
                        required
                    />
                </label>
            </div>
            <div>
                <label>
                    Image URL:
                    <input
                        type="url"
                        value={image}
                        onChange={(e) => setImage(e.target.value)}
                        required
                    />
                </label>
            </div>
            <button type="submit">Save</button>
        </form>
    );
};

export default CardForm;
