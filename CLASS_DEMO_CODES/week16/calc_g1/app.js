const outputBox = document.getElementById("output");
let result = 0;

let operands = [];
let currentOperand = "";

const processNumClick = (num)=>{

    currentOperand += num;

    outputBox.textContent = currentOperand;
}


document.getElementById("btn1").addEventListener("click", ()=>{
    processNumClick(1);
});
document.getElementById("btn2").addEventListener("click", ()=>{
   processNumClick(2);
});

document.getElementById("btnplus").addEventListener("click", ()=>{
    if(currentOperand !== ""){
        operands.push(parseFloat(currentOperand))
        currentOperand = "";
    }
    console.log(operands)
});

document.getElementById("btnequal").addEventListener("click", ()=>{
    if(currentOperand !== ""){
        operands.push(parseFloat(currentOperand))
        currentOperand = "";
    
    }

    let sum = 0;
    for(let o of operands){
        sum += o;
    }
    outputBox.textContent = sum
    operands = []
});

