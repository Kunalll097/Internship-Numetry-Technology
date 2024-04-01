// const myObject = {
//     property1: value1,
//     property2: value2,
// }
//     const person ={firstName:"Kunal",
//     lastName:"Lade", age:21,
//     displayInfo: function () {
//         console.log(`Person age is ${person['age']}`);
//     }  
// }
//  person.displayInfo();
    
//   function Person(name, age) {
//     this.name = name;
//     this.age = age;
//   }
//   const object1 = new Object();
//   object1.property1 = 21;
  
//   console.log(object1.hasOwnProperty(`property1`));

//   function Person(name, age){
//     this.name = "Kunal Lade";
//     this.age = 21;
//   }
  
// function createPerson(name, age) {
//     return {
//       name: "Kunal",
//       age: 21,
//       greet() {
//         console.log(`Hello, my name is ${this.name} and I'm ${this.age} years old.`);
//       }
//     };
//   }  

const Person = { 
    firstName : "Kunal",
     lastName : "Lade", 
     age : 21,
     gender : 'male',
};

const keys = Object.keys(Person);

keys.forEach(key => {
    console.log(key, Person[key]);
})