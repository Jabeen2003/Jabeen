let number1=parseFloat(prompt("Enter first number:"));
let number2=parseFloat(prompt("Enter second number:"));
let operator=(prompt("Enter operator(+, -, *, /):"));
if(operator=='+') {
    result=number1+number2;
}
else if(operator=='-') {
    result=number1-number2;
}
else if(operator=='*') {
    result=number1*number2;
}
else {
    result=number1/number2;
}

console.log(result);