// 'var' was in use in previous versions of Javascript while in current version of JS(ES6), 'let' came in .
// The major functionality difference is depicted below:

var a; // declaration
a = 10; // initialization
console.log(a);

var a = "raj"; // var can be re-declared and re-initialized
console.log(a);

let b; //declaration
b = "hello world"; //initialized
console.log(b);

//uncomment below section to see the error in console
// -------------------------------------------------------------------------------

// let b = 90; //  let can be re-initialized but cannot be re-declared

// console.log(b);

// -------------------------------------------------------------------------------------

b = "how are you?";
console.log(b); // let can be re-initialized but cannot be re-declared

const c = 99; //declaration and initialized

console.log(c);

// const c = 'error';          //const cannot be re-initialized or re-declared and it has to declared and initialized together.
// console.log(c);
