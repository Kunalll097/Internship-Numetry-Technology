// 1.Basic Syntax:

// Traditional function expression
const add = function(a, b) {
    return a + b;
};

// Arrow function
const addArrow = (a, b) => {
    return a + b;
};

// 2.Implicit Return: If the function body consists of a single expression, the curly braces and 'return' keyword can be omitted for a more concise syntax. The expression's result will automatically be returned.

// Traditional function expression
const square = function(x) {
    return x * x;
};

// Arrow function with implicit return
const squareArrow = x => x * x;

// 3.Parentheses: When there's only one parameter, parentheses around parameters can be omitted.

// Traditional function expression
const greet = function(name) {
    return `Hello, ${name}!`;
};

// Arrow function with one parameter
const greetArrow = name => `Hello, ${name}!`;

// 4.No 'this' Binding: Arrow functions do not have their own 'this' value. Instead, they inherit 'this' from the surrounding lexical scope.

// Traditional function expression
const obj = {
    value: 42,
    getValue: function() {
        return this.value;
    }
};

// Arrow function
const objArrow = {
    value: 42,
    getValue: function() {
        return () => this.value;
    }
};

// 5.No 'arguments' object: Arrow functions do not have their own 'arguments' object. If you need access to function arguments, you should use rest parameters instead.

// Traditional function expression
function sum() {
    let total = 0;
    for (let i = 0; i < arguments.length; i++) {
        total += arguments[i];
    }
    return total;
}

// Arrow function with rest parameters
const sumArrow = (...args) => {
    return args.reduce((acc, val) => acc + val, 0);
};

