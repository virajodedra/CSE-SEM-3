import React, { useState } from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import reportWebVitals from "./reportWebVitals";

// Define an array of faculty information
const facultyData = [
  {
    imageUrl: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/404---04-10-2023-10-49-15.jpg",
    name: "Jasmin Chauhan",
    age: 45,
    degree: "PhD in Computer Science",
    birthDate: "08-08-2006"
  },
  {
    imageUrl: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/6---28-04-2023-02-06-07.jpg",
    name: "Pruthviraj Chauhan",
    age: 38,
    degree: "MSc in Mathematics",
    birthDate: "24-12-2005"
  },
  {
    imageUrl: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/335---01-05-2024-07-40-49.JPG",
    name: "Viraj Odedra",
    age: 50,
    degree: "PhD in Physics",
    birthDate: "18-08-2006"
  },
  {
    imageUrl: "https://du-website.s3.ap-south-1.amazonaws.com/U01/Faculty-Photo/335---01-05-2024-07-40-49.JPG",
    name: "Harshil Solanki",
    age: 29,
    degree: "MSc in Chemistry",
    birthDate: "26-10-2005"
  }
];

function App() {
  const [currentIndex, setCurrentIndex] = useState(0);
  const [size, setSize] = useState(300); // Initial size

  const changePhoto = () => {
    setCurrentIndex((prevIndex) => (prevIndex + 1) % facultyData.length);
  };

  const increaseSize = () => {
    setSize((prevSize) => prevSize + 50); 
  };

  const decreaseSize = () => {
    setSize((prevSize) => Math.max(prevSize - 50, 100)); 
  };

  const { imageUrl, name, age, degree, birthDate } = facultyData[currentIndex];

  return (
    <div style={{ textAlign: 'center', marginTop: '2rem' }}>
      <div style={{ 
        display: 'inline-block', 
        textAlign: 'left', 
        border: '1px solid #ddd', 
        borderRadius: '8px', 
        padding: '16px', 
        width: `${size}px`, 
        boxShadow: '0 4px 8px rgba(0,0,0,0.1)'
      }}>
        <img
          src={imageUrl}
          alt={name}
          style={{ width: '100%', height: 'auto', borderRadius: '8px' }}
        />
        <h3>{name}</h3>
        <p><strong>Age:</strong> {age}</p>
        <p><strong>Degree:</strong> {degree}</p>
        <p><strong>Birth Date:</strong> {birthDate}</p>
      </div>
      <div style={{ marginTop: '1rem' }}>
        <button onClick={changePhoto} className="btn btn-secondary">
          Change Photo
        </button>
      </div>
      <div style={{ marginTop: '1rem' }}>
        <button onClick={increaseSize} className="btn btn-secondary">
          Increase SIZE
        </button>
        <button onClick={decreaseSize} className="btn btn-secondary" style={{ marginLeft: '10px' }}>
          Decrease SIZE
        </button>
      </div>
    </div>
  );
}

const root = ReactDOM.createRoot(document.getElementById("root"));

root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

reportWebVitals();