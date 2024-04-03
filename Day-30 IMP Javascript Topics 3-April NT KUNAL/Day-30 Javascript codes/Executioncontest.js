// Global Execution Context
let globalVariable = 'I am global';

function outerFunction() {
    // Function Execution Context
    let outerVariable = 'I am outer';

    function innerFunction() {
        // Function Execution Context within outerFunction's context
        let innerVariable = 'I am inner';
        console.log(innerVariable); 
        console.log(outerVariable); 
        console.log(globalVariable); 
    }

    innerFunction();
}

outerFunction();
