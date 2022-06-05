/*we can create functions in two ways:
1) Function Declaration 
2) Function Expression */

exampleOfDeclaration(5, 7);

function exampleOfDeclaration(a, b) {
  let sum = a + b; //function declaration
  console.log(sum);
}

exampleOfExpression(6, 20); //error :ReferenceError: Cannot access 'exampleOfExpression' before initialization

let exampleOfExpression = function (a, b) {
  let sum = a + b; //function expression
  console.log(sum);
};

/*Here the code prints from line 5 but gives an error in line 12 because the function declaration can be called before it is defined 
  but a function expression becomes usable only after its statement is executed.*/

//another difference is that a function declaration has a block scope that is it can be only accessed within that code block and not outside of it
// for example:

let age1 = prompt("What is your age?", 18);

if (age1 < 18) {
  function welcome() {
    alert("You cannot vote");
  }
} else {
  function welcome() {
    alert("Can Vote!");
  }
}

// ...use it later
welcome(); // Error: welcome is not defined

//but if we used function expression this will not be the issue ,

let age = prompt("What is your age?", 18);

let welcome;

if (age < 18) {
  welcome = function () {
    alert("Cannot vote!");
  };
} else {
  welcome = function () {
    alert("Can Vote!");
  };
}

welcome(); // ok now
