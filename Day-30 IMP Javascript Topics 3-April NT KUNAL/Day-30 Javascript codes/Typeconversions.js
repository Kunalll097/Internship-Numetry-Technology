// Implicit Type Conversion (Coercion):-

// let num = 10; // Number
// let str = 'Kunal'; // String

// let result = num + str; 
// console.log(result); 

// Explicit Type Conversion:-
// 1. String Conversion:

// let num = 10;
// let str = String(num); 
// console.log(typeof str);

// let bool = true;
// let strBool = bool.toString(); 
// console.log(typeof strBool); 

// 2. Number Conversion:-

let str = '10';
let num = Number(str); // Using Number() function
console.log(typeof num); 

let strFloat = '10.5';
let floatNum = +strFloat; // Using unary plus operator
console.log(typeof floatNum); 

// 3. Integer Conversion:-

// let str = '10';
// let intNum = parseInt(str);
// console.log(typeof intNum); 

// 4. Float Conversion:-

// let str = '10.5';
// let floatNum = parseFloat(str);
// console.log(typeof floatNum); 

// 5. Boolean Conversion:-

// let num = 0;
// let bool = Boolean(num); // Using Boolean() function
// console.log(bool); 

// let str = 'Hello';
// let boolStr = !!str; // Using double negation operator
// console.log(boolStr); 
