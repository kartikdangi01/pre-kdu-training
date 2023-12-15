let res;

function calculateSum(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;

    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    res = num1 + num2;
    document.getElementById("result").innerHTML = `Result : ${res}`;
}
function calculateSub(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;

    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    res = num1 - num2;
    document.getElementById("result").innerHTML = `Result : ${res}`;
}
function calculateMul(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;

    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    res = num1 * num2;
    document.getElementById("result").innerHTML = `Result : ${res}`;
}
function calculateDiv(){
    let num1 = document.getElementById("num1").value;
    let num2 = document.getElementById("num2").value;

    num1 = parseFloat(num1);
    num2 = parseFloat(num2);
    res = (num1 / num2).toFixed(2);
    document.getElementById("result").innerHTML = `Result : ${res}`;
}

