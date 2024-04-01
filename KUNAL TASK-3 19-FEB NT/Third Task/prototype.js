function Animal(name) {
    this.name = name;
  }
  
  Animal.prototype.sound = function() {
    return 'generate dog sound';
  };
  
  function Dog(name) {
    Animal.call(this, name);
  }
  
  Dog.prototype = Object.create(Animal.prototype);
  Dog.prototype.constructor = Dog;
  Dog.prototype.sound = function() {
    return 'Woof!';
  };
  
  const myDog = new Dog('Sheru');
  
  console.log(myDog.name); 
  console.log(myDog.sound()); 