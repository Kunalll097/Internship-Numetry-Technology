// Arithmetic Operators
let x = 10;
let y = 5;
let addition = x + y; // Addition
let subtraction = x - y; // Subtraction
let multiplication = x * y; // Multiplication
let division = x / y; // Division
let modulus = x % y; // Modulus
let exponentiation = x ** y; // Exponentiation

console.log("Arithmetic Operators:");
console.log("Addition:", addition);
console.log("Subtraction:", subtraction);
console.log("Multiplication:", multiplication);
console.log("Division:", division);
console.log("Modulus:", modulus);
console.log("Exponentiation:", exponentiation);

// Assignment Operators
let a = 10;
a += 5; // Equivalent to a = a + 5
console.log("\nAssignment Operators:");
console.log("Value of a after addition assignment:", a);

// Comparison Operators
let num1 = 10;
let num2 = 5;
console.log("\nComparison Operators:");
console.log("num1 > num2:", num1 > num2);
console.log("num1 === num2:", num1 === num2);
console.log("num1 != num2:", num1 != num2);

// Logical Operators
let isTrue = true;
let isFalse = false;
console.log("\nLogical Operators:");
console.log("isTrue && isFalse:", isTrue && isFalse);
console.log("isTrue || isFalse:", isTrue || isFalse);
console.log("!isFalse:", !isFalse);

// Unary Operators
let num = 5;
console.log("\nUnary Operators:");
console.log("Unary plus:", +num);
console.log("Unary minus:", -num);
console.log("Increment:", ++num);
console.log("Decrement:", --num);

// Ternary Operator
let age = 20;
let canVote = (age >= 18) ? "Yes" : "No";
console.log("\nTernary Operator:");
console.log("Can vote?", canVote);

// Comma Operator
let result = (x++, y++, x + y);
console.log("\nComma Operator:");
console.log("Result of comma operator:", result);
