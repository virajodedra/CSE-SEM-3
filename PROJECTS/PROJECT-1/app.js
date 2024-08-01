const express = require('express');
const path = require('path');

const app = express();
const port = 4040;


app.use(express.static(path.join(__dirname)));


app.get('/home', (req, res) => {
    res.redirect('/');
});

app.get('/contact', (req, res) => {
    res.sendFile(path.join(__dirname,'contact.html'));
});

app.get('/about', (req, res) => {
    res.sendFile(path.join(__dirname,'about.html'));
});

app.get('/criteria', (req, res) => {
    res.sendFile(path.join(__dirname,'criteria.html'));
});

app.listen(4040, () => {
    console.log(`Server Started on http://localhost:${port}`);
});
