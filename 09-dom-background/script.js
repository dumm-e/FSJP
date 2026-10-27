const colors = ["lightblue", "lightgreen", "lightyellow", "lightpink", "lavender"];
let index = 0;

function changeColor() {
  document.body.style.backgroundColor = colors[index];
  index = (index + 1) % colors.length;
}

setInterval(changeColor, 5000);
