function outerFunction() {
    let outerVariable = 'I am outer';
    
    function innerFunction() {
        console.log(outerVariable); 
    }

    return innerFunction;
}

let closure = outerFunction();
closure(); 

function createCounter() {
    let count = 0;

    return function() {
        return ++count;
    };
}

let counter = createCounter();
console.log(counter()); 
console.log(counter());
console.log(counter()); 
