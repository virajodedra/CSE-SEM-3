const http = require('http');

server = http.createServer((req,res) => {
    res.end("Hello from my first server :!!!!!");
});

server.listen(4000);
    