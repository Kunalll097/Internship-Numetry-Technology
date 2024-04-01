// const obj = {
//     "name": "Kunal",
//     "age": 21,
//     "isStudent": true,
//     "hobbies": ["collecting coins", "playing cricket"],
//     "address": {
//       "city": "Nashik",
//       "country": "INDIA"
//     }
//   }
  
// const obj = { name: 'kunal', age: 21 };
// const jsonString = JSON.stringify(obj);
// console.log(jsonString); 

// const jsonString = '{"name":"kunal","age":21}';
// const obj = JSON.parse(jsonString);
// console.log(obj); 
// console.log(obj.name); 
// obj.age = 40;
// console.log(obj); 

const complexData = {
    name: 'kunal',
    friends: [
      { name: 'Athrav', age: 22 },
      { name: 'Deep', age: 28 }
    ]
  };
  const complexJsonString = JSON.stringify(complexData);
  console.log(complexJsonString);
  
