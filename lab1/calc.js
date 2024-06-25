let a = parseInt(prompt("enter the value of a "));
let b = parseInt(prompt("enter the value of b"));

let c = prompt("enter the performance do you want to do");

if(c==="+"){
    document.write(`the su, is ${a+b}`);
}else if(c==="-"){
    document.write(`the substraction  is ${a-b}`);       
}else if(c==="*"){
    document.write(`the multiplication  is ${a*b}`);       
}else if(c==="/"){
    document.write(`the divisoin  is ${a/b}`);       
}
else if(c==="%"){
    document.write(`the modulo  is ${a%b}`);       
}else{
    alert("enter valid sign");
}