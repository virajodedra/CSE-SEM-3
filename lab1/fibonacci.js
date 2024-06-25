let a = prompt("enter the number of a ");

document.write("0,1,");

let b =0;
let c=1;
let d;
// b=1  c=0+1

for(let i=0; i<a; i++){
    document.write((b+c) +",");
    d=c;
    c+=b;
    b=d;
    
}