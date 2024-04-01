function calculateBMI() {
  var weight = parseFloat(prompt("Enter your weight in kilograms:"));
  var height = parseFloat(prompt("Enter your height in meters(152 = 1.52m):"));

  if (!isNaN(weight) && !isNaN(height) && weight > 0 && height > 0) {
    var bmi = weight / (height * height);
    //   document.getElementById("bmiResult").innerHTML = "Your BMI is: " + bmi.toFixed(2) + " , " +
    //  "Healthy range is 18.5 to 24.9" ;
    alert("Your BMI is: " + bmi.toFixed(2) + " , " + "Healthy range is 18.5 to 24.9");
    if (bmi < 18.5) {
      alert("Your BMI is low(UnderWeight)" + " \n "+"Your Goal is now:- Increase calorie intake and promote healthy weight gain." + " \n "+"Click on Get Diet and get beneficial diet for you or you can connect with our dietition");
    } else if (bmi > 24.9) {
      alert("Your BMI is High(OverWeight)" + " \n " + "Your Goal is now:- Control calorie intake and promote healthy weight loss." + + " \n "+"Click on Get Diet and get beneficial diet for you or you can connect with our dietition");
    } else {
      alert("Congratulation!!!... You are healthy But Maintain your Diet");
    }
  } else {
    alert("Please enter valid weight and height values.");
  }
}

function Readmore() {
  alert("Contact Us or You can meet with us in the gym....");
}

function Getdiet(){
  var BMI = parseFloat(prompt("Enter your BMI:"));
    if(BMI < 18.5){
      alert("Your BMI is low(UnderWeight)" + " \n " +
    "Goal: Increase calorie intake and promote healthy weight gain." + " \n " +
    "Nutrition Recommendations:-" + " \n " +
    "Consume calorie-dense foods like nuts, seeds, and avocados."+ " \n " +
    "Incorporate healthy fats such as olive oil and fatty fish."+ " \n " +
    "Include protein-rich foods like lean meats, tofu, and legumes."+ " \n " +
    "Eat complex carbohydrates such as whole grains, fruits, and vegetables."+ " \n " +
    "Avoid empty-calorie foods and focus on nutrient-dense options.");
  }else if(BMI > 24.9){
    alert("Your BMI is High(OverWeight)" + " \n " +
    "Goal: Control calorie intake and promote healthy weight loss." + " \n " +
    "Nutrition Recommendations:-" + " \n " +
    "Control portion sizes to manage calorie intake."+ " \n " +
    "Emphasize whole foods over processed foods and sugary snacks."+ " \n " +
    "Increase fiber intake with fruits, vegetables, and whole grains."+ " \n " +
    "Choose lean protein sources like skinless poultry, fish, and legumes."+ " \n " +
    "Limit added sugars and high-fat foods.");
    }else if(BMI >= 18.5 <= 24.9){
     alert("You are Healthy..." + " \n " +
     "You can Maintain your Diet and do the regular exercise");
    }else{
      "Please enter valid BMI Values."
    }
}

function Sendnow() {
  alert("Thank you for your feedback...");
}