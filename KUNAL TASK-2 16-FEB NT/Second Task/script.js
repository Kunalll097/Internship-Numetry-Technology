var navbarItems = document.querySelectorAll(".navbar a");

for (var i = 0; i < navbarItems.length; i++) {
  navbarItems[i].addEventListener("click", function() {
    var current = document.getElementsByClassName("active");
    if (current.length > 0) {
      current[0].className = current[0].className.replace(" active", "");
    }
    this.className += " active";
  });
}