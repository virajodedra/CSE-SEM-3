const http = require('http');
const server = http.createServer((req,res) => {
    res.setHeader('Content-Type','text/html');

    console.log(req.url);
    
    if(req.url == '/favicon.ico'){
        res.end('');
    }
    else if(req.url == '/home'){
        res.StatusCode = 200;
        res.write('Welcome Home Buddy..');
        res.write('</br>');
        res.write('bye byeeee !!!!!!!!!!!');
        res.end();
    }
    else if(req.url == '/Contact'){
        res.StatusCode = 200;
        res.end('My phone number is : <h2> 93280 #####</h2>');
    }
    else if(req.url == '/About'){
        res.StatusCode = 200;
        res.write('ABOUT US');
        res.write("</br>");
        res.end('This is all it is !!');
    }
    else{
        res.write('Wrong url...');
        res.write('</br>');
        res.write('Try Again');
        res.end();
    }
});

    server.listen(4040,() =>{

    });
