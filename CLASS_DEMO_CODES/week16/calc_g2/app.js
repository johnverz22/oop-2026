const ouputBox = document.getElementById("output")

let operands = [];
let currentOperand = "";

/*
    function numClick(num){
    
    }
*/
const numClick = (num)=>{
    if(currentOperand === "")
        ouputBox.textContent = "";

    ouputBox.textContent += num
    currentOperand = ouputBox.textContent
}

document.getElementById("btn1").addEventListener("click", ()=>{
    numClick(1)
})

document.getElementById("btn2").addEventListener("click", ()=>{
    numClick(2)
})

document.getElementById("btnplus").addEventListener("click", ()=>{
    if(currentOperand === "")
        return;

    operands.push(parseFloat(currentOperand))
    console.log(operands)
    currentOperand = ""; //clear current operand
})

document.getElementById("btnequal").addEventListener("click", ()=>{
    if(currentOperand !== ""){
        operands.push(parseFloat(currentOperand))
        currentOperand = "";
    }



    let sum = 0;
    for(let o of operands){
        sum += o;
    }

    ouputBox.textContent = sum;
    operands = []; 

});

/*
add other digits and - munus operator


*/