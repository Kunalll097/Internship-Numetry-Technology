// 1.Object.keys(): Returns an array of a given object's own enumerable property names.

// const obj = { a: 1, b: 2, c: 3 };
// const keys = Object.keys(obj);
// console.log(keys); 

// 2.Object.values(): Returns an array of a given object's own enumerable property values.

// const values = Object.values(obj);
// console.log(values); 

// 3.Object.entries(): Returns an array of a given object's own enumerable string-keyed property [key, value] pairs.

// const entries = Object.entries(obj);
// console.log(entries); 

// 4.Object.assign(): Copies the values of all enumerable own properties from one or more source objects to a target object. It returns the target object.

// const target = { a: 1, b: 2 };
// const source = { b: 3, c: 4 };
// const mergedObject = Object.assign(target, source);
// console.log(mergedObject); 

// 5.Object.hasOwnProperty(): Returns a boolean indicating whether the object has the specified property as its own property (not inherited).

// const obj = { a: 1, b: 2 };
// console.log(obj.hasOwnProperty('a')); 
// console.log(obj.hasOwnProperty('c')); 

// 6.Object.freeze(): Freezes an object: other code can't delete or change any properties.

// const obj = { a: 1, b: 2 };
// Object.freeze(obj);
// obj.c = 3; 
// console.log(obj); 

// 7.Object.seal(): Prevents new properties from being added to an object and marks all existing properties as non-configurable.

const obj = { a: 1, b: 2 };
Object.seal(obj);
obj.c = 3; 
console.log(obj); 
