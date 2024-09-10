import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Routes, Route, Link, Outlet } from 'react-router-dom';
import './index.css';

const root = ReactDOM.createRoot(document.getElementById('root'));

function Layout() {
  return (
    <div className="container-fluid">
      <header className="header bg-dark text-white py-3">
        <div className="container d-flex justify-content-between align-items-center">
          <div className="logo">
            <img
              src="https://github.com/Pruthviraj36/Prebito/blob/main/ReactJS%20Images/logo-color.png?raw=true"
              style={{ width: '100px', height: 'auto' }} // Smaller logo size
            />
          </div>
          <nav className="navbar navbar-expand-lg">
            <div className="container-fluid">
              <Link className="navbar-brand text-light" to="#">Pages</Link>
              <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span className="navbar-toggler-icon"></span>
              </button>
              <div className="collapse navbar-collapse" id="navbarNav">
                <ul className="navbar-nav">
                  <li className="nav-item">
                    <Link className="nav-link text-light" to="/home">Home</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link text-light" to="/about">About</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link text-light" to="/contact">Contact</Link>
                  </li>
                </ul>
              </div>
            </div>
          </nav>
        </div>
      </header>

      <main className="main-content container-fluid my-4">
        <div className="row">
          <aside className="col-md-3 bg-light p-3 sidebar d-none d-md-block">
            <div className="sidebar-header mb-3">
              <h4 className="text-dark">Navigation</h4>
            </div>
            <div className="sidebar-content">
              <ul className="list-group">
                <li className="list-group-item">
                  <Link className="text-dark" to="/home">Home</Link>
                </li>
                <li className="list-group-item">
                  <Link className="text-dark" to="/about">About</Link>
                </li>
                <li className="list-group-item">
                  <Link className="text-dark" to="/contact">Contact</Link>
                </li>
                <li className="list-group-item">
                  <Link className="text-dark" to="/help">Help</Link>
                </li>
                <li className="list-group-item">
                  <input type="text" className="form-control" placeholder="Search..." />
                </li>
              </ul>
            </div>
          </aside>
          <div className="col-md-9">
            <div className="content-wrapper">
              <Outlet />
            </div>
          </div>
        </div>
      </main>

      <footer className="footer bg-dark text-white py-3">
        <div className="container d-flex justify-content-between align-items-center">
          <p className="mb-0">@ 2022 My Website. All rights reserved.</p>
          <div>
            <Link className="text-white me-2" to="/help">Help</Link>
            <Link className="text-white me-2" to="/about">About</Link>
            <Link className="text-white" to="/contact">Contact</Link>
          </div>
        </div>
      </footer>
    </div>
  );
}

function Home() {
  return (
    <div className="page-content">
      <h2>Welcome to the Home Page</h2>
      <p>Discover our latest features and updates.</p>
    </div>
  );
}

function About() {
  return (
    <div className="page-content">
      <h2>About Us</h2>
      <p>Learn more about our mission, vision, and values.</p>
    </div>
  );
}

function Contact() {
  return (
    <div className="page-content">
      <h2>Contact Us</h2>
      <p>Get in touch with us through various channels.</p>
    </div>
  );
}

function Help() {
  return (
    <div className="page-content">
      <h2>Help and Support</h2>
      <p>Find answers to frequently asked questions and get support.</p>
    </div>
  );
}

root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route path="/home" element={<Home />} />
        <Route path="/contact" element={<Contact />} />
        <Route path="/about" element={<About />} />
        <Route path="/help" element={<Help />} />
      </Route>
    </Routes>
  </BrowserRouter>
);
