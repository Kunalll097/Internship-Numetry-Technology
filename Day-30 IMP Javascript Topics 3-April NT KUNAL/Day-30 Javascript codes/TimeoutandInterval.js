function greet(name) {
    console.log('Hello, ' + name + '!');
}

setTimeout(greet, 2000, 'John'); // Executes greet('John') after 2000 milliseconds (2 seconds)

// --------------------------------------------------------------------------------

// let counter = 0;
// function incrementCounter() {
//     counter++;
//     console.log('Counter:', counter);
// }

// setInterval(incrementCounter, 1000); // Executes incrementCounter() every 1000 milliseconds (1 second)

// --------------------------------------------------------------------------------

let timeoutID = setTimeout(function() {
    console.log('This will not be executed.');
}, 2000);

clearTimeout(timeoutID); // Clears the timeout, preventing the function from executing after 2000 milliseconds

// --------------------------------------------------------------------------------

let intervalID = setInterval(function() {
    console.log('This will be executed repeatedly.');
}, 1000);

setTimeout(function() {
    clearInterval(intervalID); // Clears the interval after 5000 milliseconds
}, 5000);
