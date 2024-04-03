// Defining a class
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  // Method
  greet() {
    console.log(`Hello, my name is ${this.name} and I'm ${this.age} years old.`);
  }
}

// Creating objects from the class
let person1 = new Person('John', 30);
let person2 = new Person('Alice', 25);

// Accessing properties and calling methods
console.log(person1.name); // Output: 'John'
console.log(person2.age); // Output: 25

person1.greet(); // Output: 'Hello, my name is John and I'm 30 years old.'
person2.greet(); // Output: 'Hello, my name is Alice and I'm 25 years old.'

// ---------------------------------------------------------------------------------------------------------

// Another Example:-
class Animal {
    constructor(name) {
      this.name = name;
    }
  
    sound() {
      console.log('Some generic sound');
    }
  }
  
  class Dog extends Animal {
    constructor(name) {
      super(name); // Call the constructor of the superclass
    }
  
    sound() {
      console.log('Woof woof');
    }
  }
  
  let dog = new Dog('Buddy');
  dog.sound(); // Output: 'Woof woof'
  console.log(dog.name); // Output: 'Buddy'
  