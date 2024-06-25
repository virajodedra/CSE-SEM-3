let a = prompt("enter the number ");
 let pr=0;
for(let i=2; i<a;i++){
    if(a%i!=0){
       pr=1
    }else{
        pr=2
    }
}
if(pr=1){
    document.write("the number is prime");
}else{
    document.write("the number is not prime");
}