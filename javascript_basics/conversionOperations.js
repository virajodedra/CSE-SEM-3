let score = true;

console.log(typeof(score));


let valueInNumber = Number(score);
console.log(valueInNumber);
console.log(typeof(valueInNumber));






//notes :

// '4' => 4
// '4volt => NaN
// true => 1 ; false => 0


let isLoggedIn = 1;

let booleanIsLoggedIn  = Boolean(isLoggedIn);
console.log(booleanIsLoggedIn);


isLoggedIn = "";

booleanIsLoggedIn  = Boolean(isLoggedIn);   //false
console.log(booleanIsLoggedIn);


isLoggedIn = "Volt";

booleanIsLoggedIn  = Boolean(isLoggedIn);   // true
console.log(booleanIsLoggedIn);



// 1 => true ; 0 => false
// "" => false ; "Volt" => true




let number = 44;

let stringNumber = String(number);
console.log(stringNumber);
console.log(typeof(stringNumber));

