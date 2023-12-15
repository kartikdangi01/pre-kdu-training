function increment(){
    let currEle = document.getElementById("value");
    curr = parseInt(currEle.innerHTML)
    curr = curr + 1;
    currEle.innerHTML = String(curr);
}

function decrement(){
    let currEle = document.getElementById("value");
    curr = parseInt(currEle.innerHTML)
    curr = curr - 1;
    currEle.innerHTML = String(curr);
}