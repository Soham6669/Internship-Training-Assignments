let num1 = document.getElementById("num1");
let num2 = document.getElementById("num2");



function add() {
    let result = parseInt(num1.value) + parseInt(num2.value);
    document.getElementById("result").textContent = result;
}
function subtract() {
    let result = parseInt(num1.value) - parseInt(num2.value);
    document.getElementById("result").textContent = result;
}   
function multiply() {
    let result = parseInt(num1.value) * parseInt(num2.value);
    document.getElementById("result").textContent = result;
}
function divide() { 
    if (num2.value === 0) {
        document.getElementById("result").textContent = "Cannot divide by zero";
    } else {
        let result = parseInt(num1.value) / parseInt(num2.value);
        document.getElementById("result").textContent = result;
    }
}

