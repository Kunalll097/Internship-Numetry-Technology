const months = ['Jan', 'March', 'May', 'July'];

months.splice(1, 1);
console.log(months); 

months.splice(1, 0, 'Feb');
console.log(months); 

months.splice(2, 1, 'June');
console.log(months); 
