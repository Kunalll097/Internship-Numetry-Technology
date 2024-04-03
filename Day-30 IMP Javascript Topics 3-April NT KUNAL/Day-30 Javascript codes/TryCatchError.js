function divide(a, b) {
    try {
        if (b === 0) {
            throw new Error('Division by zero');
        }
        return a / b;
    } catch (error) {
        console.error('Error:', error.message);
        return null;
    }
}

console.log(divide(66, 2)); 
console.log(divide(55, 0)); 
