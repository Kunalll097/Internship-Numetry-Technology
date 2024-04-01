function calculateBMI() {
    var weight = parseFloat(prompt("Enter your weight in kilograms:"));
    var height = parseFloat(prompt("Enter your height in meters(152 = 1.52m):"));
    
    if (!isNaN(weight) && !isNaN(height) && weight > 0 && height > 0) {
      var bmi = weight / (height * height);
      document.getElementById("bmiResult").innerHTML = "Your BMI is: " + bmi.toFixed(2) + " , " +
     "Healthy range is 18.5 to 24.9" ;
    } else {
      alert("Please enter valid weight and height values.");
    }
  }
  