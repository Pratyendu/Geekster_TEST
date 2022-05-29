// What is difference between undefined and not defined ?

//     Ans -
//     If the variable name which is being accessed doesn't exist in memory space then it would be not defined,
//     and if exists in memory space but hasn't been assigned any value till now, then it would be undefined.
//     Null means an empty or non-existent value.(null is an assigned value , it means nothing.)

e.g.:

let a;           //here 'a' is declared but not assigned any value so 'a' is undefined

b = 100;        //here 'b' is a variable but it hasn't been declared so it doesn't exist in memory , so 'b' is not defined 

let c = 'null';  // here 'c' is assigned a value of null which means 'c' contains nothing in its memory location (null)